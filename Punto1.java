/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto2023dic11;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Donde se inicializara la suma
        int suma=0;

        //Pedir los datos al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int N=scanner.nextInt();
        
        //Se empieza desde uno hasta el numero sin contarlo
        for(int i=1;i<N;i++){
            //Si detecta division ya sea entre 3 o 5 los guardara
            if(i%3==0 || i%5==0){
                //Pero si uno de esos numeros es multiplo de 3 y a la vez de 5, no lo guardara
                if(i%3==0 && i%5==0){
                    continue;
                }
                //Los que pasen este filtro son los que se guardaran
                //System.out.println(i);
                suma=suma+i;
            }
        }
        
        //El resultado de la suma
        System.out.println("La suma de todos los numeros de " + N +" que son multiplos de 3 o 5 es: " + suma);
    }
    
}
