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

/* 11) Ingresar la hora y minutos de entrada de un funcionario a la empresa, también la hora y minutos 
de salida. Indicar la cantidad de horas y minutos que trabajó. Se asume que el funcionario entra y sale 
durante el mismo día */

public class Ejercicio11 {
    public static void ejecucion(String[] args) {
        System.out.println("Ingrese la hora y luego los minutos de entrada: ");
        Scanner input = new Scanner(System.in);
        int horaEntrada = input.nextInt();
        int minutosEntrada = input.nextInt();
        System.out.println("Ingrese la hora y luego los minutos de salida: ");
        int horaSalida = input.nextInt();
        int minutosSalida = input.nextInt();
        int horasTrabajo = horaSalida - horaEntrada;
        int minutosTrabajo = minutosSalida - minutosEntrada;
        if (minutosTrabajo < 0) {
            horasTrabajo--;
            minutosTrabajo += 60;
        }
        System.out.println("El funcionario trabajó un total de " +horasTrabajo +" horas y " +minutosTrabajo +" minutos.");
    }
}
