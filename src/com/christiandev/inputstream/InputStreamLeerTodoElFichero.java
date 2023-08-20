package com.christiandev.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamLeerTodoElFichero {
    public static void main(String[] args) {
        //Como leer un archivo pude dar problemas ahi que gestionarlos con un bloque try catch.
        try {
            //Con esta clase vamos a poder leer una fichero.
            InputStream fichero = new FileInputStream("C:/Users/cdfal/Downloads/yendry_cv_24-7-2023 (1).docx");
                //De esta forma podemos leer un fichero por completo.
            try {
                byte []datos = fichero.readAllBytes(); //ReadAllBytes() Carga todo el fichero en memoria.

                for (byte dato : datos) { // Recorro y muestro dato por dato.
                    System.out.print((char)dato); //Convierto el dato de byte a char.
                }
            } catch (IOException e) {
                System.out.println("No puedo leer el archivo: " + e.getMessage());
            }
            try {
                fichero.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se puede acceder al fichero: " + e.getMessage());
        }
    }
}
