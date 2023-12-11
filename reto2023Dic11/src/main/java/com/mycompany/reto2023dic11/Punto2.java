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
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ingreso de contrasena
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una contrasena");
        String contrasena = scanner.nextLine();
        
        //Unico caracter para contrasena
        
        //System.out.println(contrasena);
        
        //Mayusculas
        String mayusculas = "QWERTYUIOPASDFGHJKLZXCVBNM";
        boolean mayusculaEncontrada= false;
        
        //Minusculas
        String minusculas= "qwertyuiopasdfghjklzxcvbnm";
        boolean minusculaEncontrada= false;
        
        //Numero
        String numeros= "1234567890";
        boolean numeroEncontrado= false;
        
        //Caracteres especiales
        String especiales = "!@#$%^&*";
        boolean especialEncontrado= false;
        
        
        //Primero mirar mayusculas
        for( int j=0; j<contrasena.length();j++ ){
            for( int i=0; i<mayusculas.length();i++ ){
                
                char mayusculaCaracter = mayusculas.charAt(i);
                String mayusculaString = Character.toString(mayusculaCaracter);
                
                char contrasenaCaracter = contrasena.charAt(j);
                String contrasenaString = Character.toString(contrasenaCaracter);
                
//                char mayusculaCaracter=mayusculas.charAt(i);
//                char contrasenaCaracter=contrasena.charAt(j);
                if( mayusculaString.equals(contrasenaString) ){
                    //System.out.println("Encontre una mayuscula");
                    mayusculaEncontrada= true;
                    break;
                }
                
            }
        }
        //Hasta aca se analizan mayusculas
        
        
        //Mirar minusculas
        for( int j=0; j<contrasena.length();j++ ){
            for( int i=0; i<minusculas.length();i++ ){
                
                char minusculasCaracter = minusculas.charAt(i);
                String minusculaString = Character.toString(minusculasCaracter);
                
                char contrasenaCaracter = contrasena.charAt(j);
                String contrasenaString = Character.toString(contrasenaCaracter);
                
//                char mayusculaCaracter=mayusculas.charAt(i);
//                char contrasenaCaracter=contrasena.charAt(j);
                if( minusculaString.equals(contrasenaString) ){
                    //System.out.println("Encontre una minuscula");
                    minusculaEncontrada= true;
                    break;
                }
                
            }
        }
        //Hasta aca se analizan minusculas
        
        
        //Mirar numeros
        for( int j=0; j<contrasena.length();j++ ){
            for( int i=0; i<numeros.length();i++ ){
                
                char numerosCaracter = numeros.charAt(i);
                String numerosString = Character.toString(numerosCaracter);
                
                char contrasenaCaracter = contrasena.charAt(j);
                String contrasenaString = Character.toString(contrasenaCaracter);
                
//                char mayusculaCaracter=mayusculas.charAt(i);
//                char contrasenaCaracter=contrasena.charAt(j);
                if( numerosString.equals(contrasenaString) ){
                    //System.out.println("Encontre un número");
                    numeroEncontrado= true;
                    break;
                }
                
            }
        }
        //Hasta aca se analizan numeros
        
        
        
        //Mirar caracteres especiales
        for( int j=0; j<contrasena.length();j++ ){
            for( int i=0; i<especiales.length();i++ ){
                
                char especialesCaracter = especiales.charAt(i);
                String especialesString = Character.toString(especialesCaracter);
                
                char contrasenaCaracter = contrasena.charAt(j);
                String contrasenaString = Character.toString(contrasenaCaracter);
                
//                char mayusculaCaracter=mayusculas.charAt(i);
//                char contrasenaCaracter=contrasena.charAt(j);
                if( especialesString.equals(contrasenaString) ){
                    //System.out.println("Encontre un caracter especial");
                    especialEncontrado= true;
                    break;
                }
                
            }
        }
        //Hasta aca se analizan caracteres especiales
        
        //Mirar si esta analizando bien
        
//        if(mayusculaEncontrada==true){
//            System.out.println("Encontre una mayuscula");
//        }
//        
//        if(minusculaEncontrada==true){
//            System.out.println("Encontre una minuscula");
//        }
//        
//        if(numeroEncontrado==true){
//            System.out.println("Encontre un numero");
//        }
//        
//        if(especialEncontrado==true){
//            System.out.println("Encontre un caracter especial");
//        }

        if(contrasena.length()<8){
            System.out.println("Muy corta la contrasena");
        }else if(mayusculaEncontrada==false){
            System.out.println("No hay mayusculas detectadas");
        }else if(minusculaEncontrada==false){
            System.out.println("No minusculas detectadas");
        }else if(numeroEncontrado==false){
            System.out.println("No numeros detectados");
        }else if(especialEncontrado==false){
            System.out.println("No caracter especial detectado");
        }else{
            System.out.println("La contraseña cumple con todos los requisitos");
        }
        
        
    }
    
}
