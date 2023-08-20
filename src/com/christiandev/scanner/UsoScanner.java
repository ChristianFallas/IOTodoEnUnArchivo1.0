package com.christiandev.scanner;

import java.util.Scanner;

public class UsoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
        suma();
        scanner.close();
    }
    
    public static void suma () {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Escribe dos valores a sumar: ");
        int a = scanner1.nextInt();
        int b = scanner1.nextInt();
        int resultado = a+b;
        System.out.println("El resultado de la suma es: " + resultado);
        scanner1.close();
    }
}
