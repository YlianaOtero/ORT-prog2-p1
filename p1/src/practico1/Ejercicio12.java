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
public class Ejercicio12 {
    public static void main(String[] args) {
        int jugador1;
        int jugador2;
        String resultado;
        
        System.out.println("JUGADOR 1: ingrese 1 para piedra, 2 para papel, 3 para tijera.");
        Scanner input = new Scanner(System.in);
        jugador1 = input.nextInt();
        
        System.out.println("JUGADOR 2: ingrese 1 para piedra, 2 para papel, 3 para tijera.");
        jugador2 = input.nextInt();
        
        if (jugador1 == jugador2) {
            resultado = "EMPATE";
            
        //Jugador 1 tira piedra
        } else if (jugador1 == 1) { 
            if (jugador2 == 2){ //Jugador 2 tira papel
                resultado = "GANA EL JUGADOR 2";
            } else { //Jugador 2 tira tijera
                resultado = "GANA EL JUGADOR 1";
            }
            
        //Jugador 1 tira papel
        } else if (jugador1 == 2) {
            if (jugador2 == 1) { //Jugador 2 tira piedra
                resultado = "GANA EL JUGADOR 1";
            } else { //Jugador 2 tira tijera
                resultado = "GANA EL JUGADOR 2";
            }
            
        //Jugador 1 tira tijera
        } else {
            if (jugador2 == 1) { //Jugador 2 tira piedra
                resultado = "GANA EL JUGADOR 2";
            } else { //Jugador 2 tira papel
                resultado = "GANA EL JUGADOR 1";
            }
        }
        System.out.println(resultado);
    }
}
