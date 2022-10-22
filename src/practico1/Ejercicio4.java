/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico1;

import java.util.Scanner;
/**
 *
 * @author ylian
 */
public class Ejercicio4 {
    //public static void main(String[] args) {
    public static void ejecucion() {
        System.out.println("Ingrese 10 numeros para ver a suma de ellos: ");
        Scanner input = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero " +(i+1) +": ");
            suma += input.nextInt();
        }
        System.out.println("La suma de los numeros ingresados es: " +suma); 
    }
    //}
}
