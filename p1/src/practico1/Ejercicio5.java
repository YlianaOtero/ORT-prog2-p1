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
public class Ejercicio5 {
    //public static void main(String[] args) {
    public static void ejecucion() {
        System.out.println("Ingrese los grados Celsius: ");
        Scanner input = new Scanner(System.in);
        int celsius = input.nextInt();
        int farenheit = 32 + (9 * celsius / 5);
        System.out.println(celsius +" grados Celsius equivale a " +farenheit + " grados Farenheit.");
    //}
    }
}
