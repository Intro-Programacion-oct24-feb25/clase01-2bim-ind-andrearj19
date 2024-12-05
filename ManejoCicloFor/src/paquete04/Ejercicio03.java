/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio03 {
     public static void main(String[] args) {
         
        int signos = 5;
         for (int i = 1; i <= signos; i++) {
               for (int j = 1; j <= i; j++) {
                   System.out.println("*");
               }
               System.out.println();
         }
            for (int i = signos- 1; i >= 1; i--) {
                 for (int j = 1; j <= i; j++) {
                      System.out.println("*");
                 }
                 System.out.println();
            }
     }
}
