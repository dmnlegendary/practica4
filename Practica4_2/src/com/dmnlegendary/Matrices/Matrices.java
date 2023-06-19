/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmnlegendary.Matrices;
import java.util.Arrays;

/**
 *
 * @author Jorge Arif Díaz Jiménez 3BV2
 */
public class Matrices {
    double[][] arreglo;
    private final int fila;
    private final int columna;
    
    //Constructor de objetos
    public Matrices(int rows, int columns){
        arreglo = new double[rows][columns];
        this.fila = rows;
        this.columna = columns;
    }
    
    //Métodos de obtención de filas y columnas
    public int getFilas(){
        return this.fila;
    }
    public int getColumnas(){
        return this.columna;
    }
    
    //Método que genera valores aleatorios a una matriz
    public void generacionNumeros(int r, int c){
        for (int clock=0; clock<r; clock++){
            for (int stopwatch=0; stopwatch<c; stopwatch++){
                arreglo[clock][stopwatch] = 10*Math.random();
            }
        }
    }
    //Método sobrecargado
    public void generacionNumeros(){
        for (int clock=0; clock<this.fila; clock++){
            for (int stopwatch=0; stopwatch<this.columna; stopwatch++){
                arreglo[clock][stopwatch] = 10*Math.random();
            }
        }
    }
    
    //Impresión del arreglo
    public void verNumeros(int r, int c){
        for (int clock=0; clock<r; clock++){
            for (int stopwatch=0; stopwatch<c; stopwatch++){
                System.out.print("[" + arreglo[clock][stopwatch] +"]  ");
            }
            System.out.println("");
        }
    }
    //Método sobrecargado
    public void verNumeros(){
        for (int clock=0; clock<this.fila; clock++){
            for (int stopwatch=0; stopwatch<this.columna; stopwatch++){
                System.out.print("[" + arreglo[clock][stopwatch] +"]  ");
            }
            System.out.println("");
        }
    }
    
    //Método que calcula el máximo número
    public double maximo(int r, int c){
        double mayor = arreglo[0][0];
        for (int clock=0; clock<r; clock++){
            for (int stopwatch=0; stopwatch<c; stopwatch++){
                if (mayor<arreglo[clock][stopwatch]){
                    mayor = arreglo[clock][stopwatch];
                }
            }
        }
        return mayor;
    }
    //Método sobrecargado
    public double maximo(){
        double mayor = arreglo[0][0];
        for (int clock=0; clock<this.fila; clock++){
            for (int stopwatch=0; stopwatch<this.columna; stopwatch++){
                if (mayor<arreglo[clock][stopwatch]){
                    mayor = arreglo[clock][stopwatch];
                }
            }
        }
        return mayor;
    }
    
    //Método que calcula el número mínimo
    public double minimo(int r, int c){
        double menor = arreglo[0][0];
        for (int clock=0; clock<r; clock++){
            for (int stopwatch=0; stopwatch<c; stopwatch++){
                if (menor>arreglo[clock][stopwatch]){
                    menor = arreglo[clock][stopwatch];
                }
            }
        }
        return menor;
    }
    //Método sobrecargado
    public double minimo(){
        double menor = arreglo[0][0];
        for (int clock=0; clock<this.fila; clock++){
            for (int stopwatch=0; stopwatch<this.columna; stopwatch++){
                if (menor>arreglo[clock][stopwatch]){
                    menor = arreglo[clock][stopwatch];
                }
            }
        }
        return menor;
    }
    
    //Método que devuelve la matriz
    //[][]
    public double[][] devolucion(){
        return arreglo;
    }
    
    //Método que realiza la suma de dos matrices objeto y devuelve la matriz suma
    public double[][] sumaMatrices(int r, int c, Matrices segunda){
        if (r!=segunda.fila || c!=segunda.columna){
            System.out.println("Dimensiones diferentes, no se puede efectuar la suma.");
            return null;
        }
        double[][] apoyo = new double[r][c];
        for (int clock=0; clock<r; clock++){
            for (int stopwatch=0; stopwatch<c; stopwatch++){
                apoyo[clock][stopwatch] = arreglo[clock][stopwatch] + segunda.arreglo[clock][stopwatch];
            }
        }
        return apoyo;
    }
    //Método sobrecargado
    public double[][] sumaMatrices(Matrices segunda){
        if (this.fila!=segunda.fila || this.columna!=segunda.columna){
            System.out.println("Dimensiones diferentes, no se puede efectuar la suma.");
            return null;
        }
        double[][] apoyo = new double[this.fila][this.columna];
        for (int clock=0; clock<this.fila; clock++){
            for (int stopwatch=0; stopwatch<this.columna; stopwatch++){
                apoyo[clock][stopwatch] = arreglo[clock][stopwatch] + segunda.arreglo[clock][stopwatch];
            }
        }
        return apoyo;
    }
    
    //Método que realiza la resta de dos matrices objeto y devuelve la matriz resta
    public double[][] restaMatrices(int r, int c, Matrices segunda){
        if (r!=segunda.fila || c!=segunda.columna){
            System.out.println("Dimensiones diferentes, no se puede efectuar la resta.");
            return null;
        }
        double[][] apoyo = new double[r][c];
        for (int clock=0; clock<r; clock++){
            for (int stopwatch=0; stopwatch<c; stopwatch++){
                /*
                Efectuamos la resta correspondiente a cada posición
                */
                apoyo[clock][stopwatch] = arreglo[clock][stopwatch] - segunda.arreglo[clock][stopwatch];
            }
        }
        return apoyo;
    }
    //Método sobrecargado
    public double[][] restaMatrices(Matrices segunda){
        if (this.fila!=segunda.fila || this.columna!=segunda.columna){
            System.out.println("Dimensiones diferentes, no se puede efectuar la resta.");
            return null;
        }
        double[][] apoyo = new double[this.fila][this.columna];
        for (int clock=0; clock<this.fila; clock++){
            for (int stopwatch=0; stopwatch<this.columna; stopwatch++){
                /*
                Efectuamos la resta correspondiente a cada posición
                */
                apoyo[clock][stopwatch] = arreglo[clock][stopwatch] - segunda.arreglo[clock][stopwatch];
            }
        }
        return apoyo;
    }
    
    //Método que multiplica dos matrices objeto devolviendo el resultado a otra matriz
    /*
    Para efetuar una correcta multipliaciónd e matrices debe efectuarse la siguiente regla:
    Sea A: m*n y B:l*s dos matrizes;su multiplicación existe ssi n=s => A*B donde A: m*N y B: N*s
    */
    public double[][] multiplicacionMatrices(int r, int c, Matrices segunda){
        if (c!=segunda.fila){
            System.out.println("No se puede efectual la operacion, los renglones distintos a columnas.");
            return null;
        }
        double[][] auxiliar = new double[r][segunda.columna];
        for (int clock=0; clock<r; clock++){
            for (int stopwatch=0; stopwatch<segunda.columna; stopwatch++){
                for (int timmer=0; timmer<c; timmer++){
                    auxiliar[clock][stopwatch] += arreglo[clock][timmer]*segunda.arreglo[timmer][stopwatch];
                }
            }
        }
        return auxiliar;
    }
    //Método sobrecargado
    public double[][] multiplicacionMatrices(Matrices segunda){
        if (this.columna!=segunda.fila){
            System.out.println("No se puede efectual la operacion, los renglones distintos a columnas.");
            return null;
        }
        double[][] auxiliar = new double[this.fila][segunda.columna];
        for (int clock=0; clock<this.fila; clock++){
            for (int stopwatch=0; stopwatch<segunda.columna; stopwatch++){
                for (int timmer=0; timmer<this.columna; timmer++){
                    auxiliar[clock][stopwatch] += arreglo[clock][timmer]*segunda.arreglo[timmer][stopwatch];
                }
            }
        }
        return auxiliar;
    }
}
