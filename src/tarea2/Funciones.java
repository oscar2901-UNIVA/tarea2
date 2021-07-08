package tarea2;

/**
 *
 * @author Oscar Javier Perez Torres
 */
public class Funciones {

    long tiempo;

    public long ordenamientoBurbuja(int[] valores, int primer, int ultimo, long inicio) {
        int aux, dato, i;
        while (primer <= ultimo) {
            dato = valores[primer];
            i = primer;
            for (int j = 0; j < ultimo - 1; j++) {
                if (dato > valores[i + 1]) {
                    aux = valores[i + 1];
                    valores[i] = aux;
                    valores[i + 1] = dato;
                }
                i++;
                dato = valores[i];
            }
            ultimo--;
        }
        tiempo = System.currentTimeMillis() - inicio;
        return tiempo;

    }

    public long ordenamientoDeInsercion(int[] valores, int primer, int ultimo, long inicio) {
        int aux, dato, i;
        while (primer <= ultimo) {
            dato = valores[primer];
            i = primer - 1;
            while (i >= 0 && dato < valores[i]) {
                aux = valores[i];
                valores[i] = dato;
                valores[i + 1] = aux;
                i--;
            }
            primer++;
        }
        tiempo = System.currentTimeMillis() - inicio;
        return tiempo;
    }

    public long ordenamientoDeSeleccion(int[] valores, int primer, int ultimo, long inicio) {
        int dato = valores[primer];
        int aux;
        int pos = primer;
        while (primer != ultimo) {
            for (int i = primer; i < ultimo; i++) {
                if (dato > valores[i + 1]) {
                    dato = valores[i + 1];
                    pos = i + 1;
                } else {
                    if (dato < valores[i + 1]) {

                    }
                }
            }
            aux = valores[primer];
            valores[primer] = dato;
            valores[pos] = aux;
            primer++;
        }
        tiempo = System.currentTimeMillis() - inicio;
        return tiempo;
    }

    public long ordenamientoRapido(int[] valores, int primer, int ultimo, long inicio) {
        int pivot = valores[ultimo];
        int i = primer;
        int j = ultimo - 1;
        int aux;
        if ((ultimo - primer) < 2) {
            if (valores[primer] > valores[ultimo]) {
                aux = valores[ultimo];
                valores[ultimo] = valores[primer];
                valores[primer] = aux;
            }
        } else {
            while (i < j) {
                if (valores[i] > pivot && valores[j] < pivot) {
                    aux = valores[j];
                    valores[j] = valores[i];
                    valores[i] = aux;
                } else {
                    if (valores[i] <= pivot) {
                        i++;
                    }
                    if (valores[j] >= pivot) {
                        j--;
                    }
                }
            }
            int mid;
            if (valores[i] > pivot) {
                aux = valores[i];
                valores[i] = pivot;
                valores[ultimo] = aux;
                mid = i;
            } else {
                if (i == ultimo) {
                    mid = i;
                } else {
                    aux = valores[i + 1];
                    valores[i + 1] = pivot;
                    valores[ultimo] = aux;
                    mid = i + 1;
                }
            }
            if (primer < i) {
                ordenamientoRapido(valores, primer, mid - 1, inicio);
            }
            if (ultimo > j) {
                if ((mid) != ultimo) {
                    ordenamientoRapido(valores, mid + 1, ultimo, inicio);
                }
            }
        }
        tiempo = System.currentTimeMillis() - inicio;
        return tiempo;
    }

}
