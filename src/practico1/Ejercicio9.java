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
public class Ejercicio9 {
    public static void ejecucion() {
        int sumaPares = 0;
        int sumaImpares = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros:");
        int numero;
        for (int i = 0; i < 10; i++) {
            numero = input.nextInt();
            if (numero%2 == 0) {
               sumaPares += numero;
            } else {
               sumaImpares += numero;
            }
        }
        System.out.println("La suma de los valores pares es " +sumaPares + " y la de los impares es " +sumaImpares);
    }
}
