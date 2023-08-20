package com.christiandev.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UsoBufferedInputStream {
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:/Users/cdfal/Downloads/yendry_cv_24-7-2023 (1).docx");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            
            try {
                int dato = ficheroBuffer.read();
                while (dato != -1) {
                    System.out.print((char) dato);
                    dato = ficheroBuffer.read();
                }
            } catch (IOException e) {
                e.getStackTrace();
            }
            fichero.close();
            ficheroBuffer.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
