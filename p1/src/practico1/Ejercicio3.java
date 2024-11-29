/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico1;

import java.util.Scanner;

/**
 *
 * @author ylian
 */
public class Ejercicio3 {

      public static void ejecucion() {
   // public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del funcionario: ");
        String nombre = input.nextLine();
        System.out.println("Ingrese la edad del funcionario: ");
        int edad = input.nextInt();
        
        while (edad < 18) {
            System.out.println("El funcionario debe ser mayor a 18 años");
            edad = input.nextInt();
        }
        
        System.out.println("Ingrese el salario del funcionario: ");
        int sueldo = input.nextInt();
        double sueldoACobrar = 0;
        
        if (edad <= 50) {
            sueldoACobrar = sueldo * 1.05;
        } else {
            if (edad >= 51 && edad <= 60) {
                sueldoACobrar = sueldo * 1.1;
            } else {
                sueldoACobrar = sueldo * 1.15;
            }
        }
        System.out.println(nombre + " cobra $" +sueldoACobrar);
  //  }
      }
}
