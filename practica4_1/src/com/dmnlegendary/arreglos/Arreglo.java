/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmnlegendary.arreglos;
import java.util.Arrays;

/**
 *
 * @author Jorge Arif Díaz Jiménez 3BV2
 */
public class Arreglo {
    double[] arreglo;
    
   //Constructor de objetos de la clase Arreglo
   public Arreglo(int n)
   {
       arreglo=new double[n];
   }
   
   //Método que llena los espacios de un arreglo con valores aleatorios
   public void llenarArreglo()
   {
       for(int i=0;i<arreglo.length;i++)
       {
           arreglo[i]=Math.random();
       }
   }
   
   //Método que imprime los valores contenidos en el arreglo
   public void imprimirArreglo()
   {
       for(double x:arreglo)
       {
           System.out.println("Elemento - > "+x);
       }
   }
   
   //Método que devuelve todo el arreglo
   public double[] devolverArreglo()
   {
       return arreglo;
   }
   
   //Método que permite obtener el elemento máximo de un arreglo de tipo double
   public double maximum(){
       double resultado = arreglo[0];
       for (int clock=0; clock<arreglo.length; clock++){
           if (resultado<arreglo[clock]){
               resultado = arreglo[clock];
           }
       }
       return resultado;
   }
   
   //Método que permite obtener el elemento mínimo de un arreglo de tipo double
   public double minimum (){
       double resultado = arreglo[0];
       for (int clock=0; clock<arreglo.length; clock++){
           if (resultado > arreglo[clock]){
               resultado = arreglo[clock];
           }
       }
       return resultado;
   }
   
   //Método que suma todos los elementos de un arreglo
   public double sumaTotal(){
       double resultado = 0;
       for(int clock=0; clock<arreglo.length; clock++){
           resultado = resultado + arreglo[clock];
       }
       return resultado;
   }
   
   //Método que suma arreglo atributo con otro objeto del tipo Arreglo
   public double[] sumOfArrays(Arreglo segundo){
       if (arreglo.length!=segundo.arreglo.length){
           System.out.println("No se pueden sumar dos arreglos que tengan tamanos distintos.");
           return null;
       }
       else {
           int size = arreglo.length;
           double[] answer = new double[size];
           for (int clock=0; clock<arreglo.length; clock++){
               answer[clock] = arreglo[clock] + segundo.arreglo[clock]; 
           }
           return answer;
       }
   }
   
   //Notepad: We can interrupt a called to a method, using either be "System.exit(0)" or "return null"
   
   //Método que permite calcular el producto punto de dos objetos del tipo Arreglo
   public double productoPunto(Arreglo segundo){
       double respuesta = 0;
       for (int clock=0; clock<arreglo.length; clock++){
           respuesta = respuesta + (arreglo[clock]*segundo.arreglo[clock]);
       }
       return respuesta;
   }
   
   //Método que permite ordenar el arreglo
   public void ordenamiento(){
       Arrays.sort(arreglo);
   }
   
   //Método que calcula la media del arreglo
   public double media(){
       double promedio = 0;
       for (int clock=0; clock<arreglo.length; clock++){
           promedio = promedio + arreglo[clock];
       }
       return (promedio/arreglo.length);
   }
}
