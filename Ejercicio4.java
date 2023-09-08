package com.generation;
import java.util.Scanner;  //import Scanner

public class Ejercicio4 {
    public static void main(String[] args) {  //meti tod en el main 
      
      Scanner sc = new Scanner();  //cambie sc de scanner
      
      System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
      String player1 = sc.nextLine(); //nombre del jugador 
      
      System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
      Scanner s2 = new Scanner();
      String j2 = sc.nextLine();
      
      if (j1 == j2) {
        System.out.println("Empate");
      } else {
        int g = 2;
        switch(j1) {
          case "piedra":
            if (j2 == "tijeras") {
              g = 1;
            }
  
          case "papel":
            if (j2 == "piedra") {
              g = 1;
            }
          case "tijera":
            if (j2.equals("papel")) {
              g = 1;
            }
            break;
          default:
        }
        System.out.println("Gana el jugador " + g);
      }
    }
    }
  
