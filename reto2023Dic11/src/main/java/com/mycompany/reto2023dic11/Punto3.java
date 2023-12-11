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
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Letras minusculas por defecto
        String minusculas= "qwertyuiopasdfghjklzxcvbnm";
        boolean minusculaEncontrada= false;
        
        //Letras mayusculas
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Deseas que tu contrasena tenga mayusculas? Coloca SI en caso afirmativo o NO en caso negativo");
        String conMayuscula = scanner.nextLine();
        String mayusculas = "QWERTYUIOPASDFGHJKLZXCVBNM";
        boolean mayusculaEncontrada= false;
        
        //Con numeros
        Scanner scannerNumero = new Scanner(System.in);
        System.out.println("¿Deseas que tu contrasena tenga numeros? Coloca SI en caso afirmativo o NO en caso negativo");
        String conNumeros = scannerNumero.nextLine();
        String numeros= "1234567890";
        boolean numeroEncontrado= false;
        
        //Con simbolos o caracteres especiales
        Scanner scannerEspecial = new Scanner(System.in);
        System.out.println("¿Deseas que tu contrasena tenga caracteres especiales? Coloca SI en caso afirmativo o NO en caso negativo");
        String conEspeciales = scannerEspecial.nextLine();
        String especiales = "!@#$%^&*";
        boolean especialEncontrado= false;
        
        if( conMayuscula.equalsIgnoreCase("SI") ){
            System.out.println("Tu contrasena tendra mayusculas");
        }else{
            System.out.println("Tu contrasena NO tendra mayusculas");
        }
        
        
        
    }
    
}
