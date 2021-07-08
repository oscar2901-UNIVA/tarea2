/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oscar Javier Perez Torres
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        String teclado = null;
        
        while (!"Salir".equals(teclado)) {
            Random r1 = new Random(500);
            int[] tiempo1 = new int[1000];
            int[] tiempo2 = new int[10000];
            int[] tiempo3 = new int[20000];
            long tiempo;
            int num;
            System.out.println("Pulsa enter para iniciar"); 
            Scanner in = new Scanner (System.in); 
            teclado = in.nextLine(); 
            for (int i = 0; i < tiempo1.length; i++) {
                num=r1.nextInt(1000)+1;
                tiempo1[i] = num;
            }
            for (int i = 0; i < tiempo1.length; i++) {
                num=r1.nextInt(10000)+1;
                tiempo2[i] = num;
            }
            for (int i = 0; i < tiempo1.length; i++) {
                num=r1.nextInt(20000)+1;
                tiempo3[i] = num;
            }
            System.out.println("\t\t1000\t10000\t20000");
            
            tiempo = System.currentTimeMillis();
            System.out.println("Burbuja\t\t"+new Funciones().ordenamientoBurbuja(tiempo1, 0, tiempo1.length-1, System.currentTimeMillis())+
                                "\t"+new Funciones().ordenamientoBurbuja(tiempo2, 0, tiempo2.length-1, System.currentTimeMillis())+
                                "\t"+new Funciones().ordenamientoBurbuja(tiempo3, 0, tiempo3.length-1, System.currentTimeMillis()));
            for (int i = 0; i < tiempo1.length; i++) {
                num=r1.nextInt(1000)+1;
                tiempo1[i] = num;
            }
            for (int i = 0; i < tiempo1.length; i++) {
                num=r1.nextInt(10000)+1;
                tiempo2[i] = num;
            }
            for (int i = 0; i < tiempo1.length; i++) {
                num=r1.nextInt(20000)+1;
                tiempo3[i] = num;
            }
             System.out.println("Inserción\t"+new Funciones().ordenamientoDeInsercion(tiempo1, 0, tiempo1.length-1, System.currentTimeMillis())+
                                "\t"+new Funciones().ordenamientoDeInsercion(tiempo2, 0, tiempo2.length-1, System.currentTimeMillis())+
                                "\t"+new Funciones().ordenamientoDeInsercion(tiempo3, 0, tiempo3.length-1, System.currentTimeMillis()));
            for (int i = 0; i < tiempo1.length; i++) {
                num=r1.nextInt(1000)+1;
                tiempo1[i] = num;
            }
            for (int i = 0; i < tiempo1.length; i++) {
                num=r1.nextInt(10000)+1;
                tiempo2[i] = num;
            }
            for (int i = 0; i < tiempo1.length; i++) {
                num=r1.nextInt(20000)+1;
                tiempo3[i] = num;
            }
            System.out.println("Selección\t"+new Funciones().ordenamientoDeSeleccion(tiempo1, 0, tiempo1.length-1, System.currentTimeMillis())+
                                "\t"+new Funciones().ordenamientoDeSeleccion(tiempo2, 0, tiempo2.length-1, System.currentTimeMillis())+
                                "\t"+new Funciones().ordenamientoDeSeleccion(tiempo3, 0, tiempo3.length-1, System.currentTimeMillis()));
            for (int i = 0; i < tiempo1.length; i++) {
                num=r1.nextInt(1000)+1;
                tiempo1[i] = num;
            }
            for (int i = 0; i < tiempo1.length; i++) {
                num=r1.nextInt(10000)+1;
                tiempo2[i] = num;
            }
            for (int i = 0; i < tiempo1.length; i++) {
                num=r1.nextInt(20000)+1;
                tiempo3[i] = num;
            }
           
            
            System.out.println("Rapido\t\t"+new Funciones().ordenamientoRapido(tiempo1, 0, tiempo1.length-1, System.currentTimeMillis())+
                                "\t"+new Funciones().ordenamientoRapido(tiempo2, 0, tiempo2.length-1, System.currentTimeMillis())+
                                "\t"+new Funciones().ordenamientoRapido(tiempo3, 0, tiempo3.length-1, System.currentTimeMillis()));
            
            break;
        }
    }
    
}
