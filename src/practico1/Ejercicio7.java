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
public class Ejercicio7 {
        public static void ejecucion() {
            System.out.println("Ingrese un numero de tres cifras: ");
            Scanner input = new Scanner(System.in);
            int digitos = input.nextInt();
            int digito1 = digitos/100;
            int digito2 = digitos%100/10;
            int digito3 = digitos%100%10;
            System.out.println("La primer cifra del numero es " +digito1 + ", la segunda " +digito2 + ", y la tercera " +digito3);
    }
}
