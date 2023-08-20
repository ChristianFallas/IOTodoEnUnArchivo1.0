package com.christiandev.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamLeer5en5 {
    public static void main(String[] args) {
        try {
            InputStream fichero1 = new  FileInputStream("C:/Users/cdfal/Downloads/yendry_cv_24-7-2023 (1).docx"); 

            try {
                byte datos[] = new byte[5]; //Esto indica que se leerá 5 en 5. 
                int dato1 = fichero1.read(datos); //Esto lee los caracteres de 5 en 5 de forma secuencial.
                //Se utiliza un bucle while para poder recorrer de forma secuencial.
                while (dato1 != -1) { //-1 Significa: "EOF"(end of file).
                    System.out.print(datos.toString()); //Como es un array, usamos toString, y esto lo muestra en grupos de 5 en hexadecimal.
                    dato1 = fichero1.read(datos); //En cada iteración actualizo el contenido de dato1.
                }
            } catch (IOException e) {
                System.out.println("No se puede leer el fichero: " + e.getMessage());
            }
            try {
                fichero1.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No puedo acceder al archivo: " + e.getMessage());
        } 
    }
}
