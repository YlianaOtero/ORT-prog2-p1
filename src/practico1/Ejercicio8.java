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
public class Ejercicio8 {
    public static void ejecucion() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(10*i);
        }
        int i = 1;
        while (i <= 100) {
            System.out.println(10*i);
            i++;
        }
        do {
            System.out.println(10*i);
            i++;
        } while (i <= 100);
    }
}
