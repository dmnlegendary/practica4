/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmnlegendary.Matrices;
import java.util.Scanner;

/**
 *
 * @author Jorge Arif Díaz Jiménez 3BV2
 */
public class MenuEstatico {
    public static void main(String args[]){
        int row, col;
        System.out.print("Ingrese los valores de filas y columnas: ");
        
        Scanner leer = new Scanner(System.in);//Creación de variable de lectura
        
        /*Obtenemos los valores de filas y columnas respectivamente*/
        row = leer.nextInt();
        col = leer.nextInt();
        
        Matrices prueba = new Matrices(row, col);//Creación del objeto
        prueba.generacionNumeros(row, col);//Asignación de valores a la matriz;
        prueba.verNumeros(row, col);//Impresión de valores
        System.out.println("");
        
        Matrices prueba2 = new Matrices(row,col);//Segundo objeto de tipo matriz
        prueba2.generacionNumeros();//Asignación de valores a la matriz
        prueba2.verNumeros();//Impresión de número
        System.out.println("");
        
        double[][] acoso = new double[row][col];//Arreglo bidimensional
        
        /*
        Obtención del valor máximo y mínimo
        */
        double max,min;
        max = prueba.maximo();
        min = prueba.minimo();
        System.out.println("Maximo: "+max);
        System.out.println("Minimo: "+min);
        System.out.println();
        
        /*
        Devolución de una matriz
        */
        double[][] halago = prueba.devolucion();//Segundo arreglo bidimensional
        for (int clock=0; clock<row; clock++){
            for (int stopwatch=0; stopwatch<col; stopwatch++){
                System.out.print("[" + halago[clock][stopwatch] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        /*
        Suma de dos matrices del mismo tamano
        */
        acoso = prueba.sumaMatrices(row, col, prueba2);
        for (int clock=0; clock<row; clock++){
            for (int stopwatch=0; stopwatch<col; stopwatch++){
                System.out.print("[" + acoso[clock][stopwatch] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        //Aplicación del método sobrecargado
        acoso = prueba.sumaMatrices(prueba2);
        for (int clock=0; clock<row; clock++){
            for (int stopwatch=0; stopwatch<col; stopwatch++){
                System.out.print("[" + acoso[clock][stopwatch] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        /*
        Método que resta a dos matrices
        */
        acoso = prueba.restaMatrices(prueba2);
        for (int clock=0; clock<row; clock++){
            for (int stopwatch=0; stopwatch<col; stopwatch++){
                System.out.print("[" + acoso[clock][stopwatch] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        /*
        Método que multiplica dos matrices
        */
        int fi = prueba.getFilas();
        int co = prueba2.getColumnas();
        double[][] multiplicacion = new double[fi][co];
        multiplicacion = prueba.multiplicacionMatrices(prueba2);
        for (int clock=0; clock<fi; clock++){
            for (int stopwatch=0; stopwatch<co; stopwatch++){
                System.out.print("[" + multiplicacion[clock][stopwatch] + "]");
            }
            System.out.println("");
        }
    }
}
