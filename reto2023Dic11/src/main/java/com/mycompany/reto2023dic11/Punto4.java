/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto2023dic11;


/**
 *
 * @author user
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*
        En primer lugar a la letra "a" se le asigna el valor de 0
        Y a la letra "b" se le asigna el valor de 1
        
        Se entra a un for que va desde 0 hasta 9
        
        Imprime el valor de a, que en primera instancia es 0 y al final un espacio en blanco
        
        El valor de "a" ahora se le asigna el valor de "b" o 1
        El valor de "b" cambia a la suma de 0 + 1 osea b vale 1
        Estos cambios lo hara mientras este en el for, que es imprimir "a" y reasignar "a" y "b" 9 veces mas
        
        Despues de acabar el for, no imprime nada
        
        En conclusion, halla las potencias de 2, comenzando desde el numero 0, luego 2 elevado a la cero, luego 2 elevado a la 1, y asi hasta 2 elevado a la 8
        
        */
        
        int a=0;
        int b=1;
        
        for(int i=0;i<10;i++){
            
            String stringA = Integer.toString(a);
            System.out.println(stringA + " ");
            
            a=b;
            b=a+b;
        }
        
    }
    
}
