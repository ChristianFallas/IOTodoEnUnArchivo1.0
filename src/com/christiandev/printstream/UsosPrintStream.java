package com.christiandev.printstream;

import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;

public class UsosPrintStream {
    public static void main(String[] args) {
// Imprimir en la consola:
        PrintStream ps = System.out;
        ps.println("Hola Mundo");
        ps.printf("El numero es: %d" , 42);

// Escribir en un archivo:
        try {
            File file = new File("/C://Users//cdfal//output.txt/"); // dirección del archivo donde imprimiremos.
            try {
                PrintStream imprimeFile = new PrintStream(file);
                imprimeFile.println("Este es un mensaje en el archivo.");
                imprimeFile.close();
            } catch (FileNotFoundException f) {
                f.getStackTrace();
            } 
        } catch(Exception e) {
            e.getStackTrace();
        }
// Para copiar el contenido de un archivo a otro:
        try {
            InputStream in = new FileInputStream("/C://Users//cdfal//output.txt/");
            byte []archivo = in.readAllBytes();
            in.close();
            
            PrintStream out = new PrintStream("C:/Users/cdfal/Destino.txt");
            out.write(archivo);
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
