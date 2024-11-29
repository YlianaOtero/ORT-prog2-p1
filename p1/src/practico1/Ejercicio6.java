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
public class Ejercicio6 {
    public static void ejecucion() {
        System.out.println("Ingrese una velocidad en km/h: ");
        Scanner input = new Scanner(System.in);
        double km_h = input.nextDouble();
        double m_s = km_h/3.6;
        System.out.println(km_h +" km/h equivale a " +m_s + " m/s.");
    }
}
