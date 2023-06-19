/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmnlegendary.arreglos;

/**
 *
 * @author Jorge Arif Díaz Jiménez 3BV2
 */
public class ArregloAplicado {
    public static void main(String args[]){
        System.out.println("Compila correctamente");
        /*
        Generación de variables a usar
        */
        double[] arri;
        Arreglo fantasia = new Arreglo(3);
        Arreglo luxury = new Arreglo(3);
        /*
        Asignacion de valores
        */
        fantasia.llenarArreglo();
        luxury.llenarArreglo();
        
        /*
        Impresión de arreglos
        */
        fantasia.imprimirArreglo();
        System.out.println();
        luxury.imprimirArreglo();
        System.out.println();
        
        /*
        Devolución de arreglo
        */
        arri = fantasia.devolverArreglo();
        for (int clock=0; clock<arri.length; clock++){
            System.out.println("Elemento: "+arri[clock]);
        }
        System.out.println();
        
        /*
        obtención de los elementos máximos, mínimos y la suma de los elementos de un arreglo
        */
        double max, min, sumaElementos;
        max = luxury.maximum();
        min = luxury.minimum();
        sumaElementos = luxury.sumaTotal();
        System.out.println("Maximo: "+max);
        System.out.println("Mínimo: "+min);
        System.out.println("Suma de elementos: "+sumaElementos);
        System.out.println();
        
        /*
        Suma de dos arreglos
        */
        arri = fantasia.sumOfArrays(luxury);
        for (double x:arri){
            System.out.println("Elemento: "+x);
        }
        System.out.println();
        
        /*
        Obtención del producto punto
        */
        double punto = fantasia.productoPunto(luxury);
        System.out.println("Producto punto: "+punto);
        System.out.println();
        
        /*
        Ordenamiento de un vector
        */
        fantasia.ordenamiento();
        fantasia.imprimirArreglo();
        
        /*
        Calculo de la media de un arreglo
        */
        double med = fantasia.media();
        System.out.println("Media: "+med);
    }
}
