package com.christiandev.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamLeerCaracterACaracter {
    public static void main(String[] args) {
        try {
            InputStream fichero1 = new  FileInputStream("C:/Users/cdfal/Downloads/yendry_cv_24-7-2023 (1).docx"); 

            try {
                int dato1 = fichero1.read(); //Esto lee carácter por carácter de forma secuencial.
                //Se utiliza un bucle while para poder recorrer de forma secuencial.
                while (dato1 != -1) { //-1 Significa: "EOF"(end of file).
                    System.out.print((char)dato1);
                    dato1 = fichero1.read();//con cada iteración actualizamos el estado de dato1.
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
