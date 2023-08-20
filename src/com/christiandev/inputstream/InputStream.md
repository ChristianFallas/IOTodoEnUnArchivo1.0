# InputStream.

InputStream en Java es una clase abstracta que se utiliza para leer datos de una fuente de entrada, como un archivo, una conexión de red o un flujo de bytes. Proporciona una interfaz común para leer diferentes tipos de datos, como bytes, caracteres o valores primitivos. 
 
La clase InputStream funciona como una tubería a través de la cual los datos fluyen desde la fuente de entrada hasta el programa Java. Permite la lectura secuencial de datos en forma de bytes o caracteres. 
 
Para utilizar InputStream, primero debes crear una instancia de una subclase concreta de InputStream, como FileInputStream o ByteArrayInputStream, dependiendo de la fuente de datos que desees leer. 
 
A continuación, puedes utilizar varios métodos proporcionados por InputStream para leer los datos. Algunos de los métodos comunes son: 
 
-  read() : Lee un byte de datos de la fuente de entrada y devuelve el valor leído como un entero. 
-  read(byte[] buffer) : Lee una serie de bytes de la fuente de entrada y los almacena en el arreglo de bytes proporcionado. 
-  skip(long n) : Omite y descarta un número especificado de bytes de la fuente de entrada. 
-  available() : Devuelve el número estimado de bytes que se pueden leer de la fuente de entrada sin bloquear. 
-  readAllBytes() : Lee el fichero por completo (Osea lo carga en memoria). y devuelve bytes.

Aquí tienes un ejemplo básico de cómo utilizar InputStream para leer datos de un archivo:

~~~
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("archivo.txt");
            int byteLeido;
            while ((byteLeido = inputStream.read()) != -1) {
                System.out.print((char) byteLeido);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
~~~

En este ejemplo, se crea una instancia de FileInputStream para leer datos del archivo "archivo.txt". Luego, se utiliza el método  read()  para leer cada byte del archivo y se imprime como un carácter en la consola. Finalmente, se cierra el InputStream para liberar los recursos. 

## Consideraciones a tener en cuenta al hacer uso de InputStream.
Al utilizar InputStream en Java, hay algunas consideraciones importantes a tener en cuenta: 
 
1. Cierre adecuado: Siempre debes asegurarte de cerrar el InputStream una vez que hayas terminado de usarlo. Esto se hace llamando al método  close()  en el objeto InputStream. Esto libera los recursos asociados con el InputStream y evita posibles pérdidas de memoria. 
 
2. Manejo de excepciones: Al leer desde un InputStream, es importante manejar las excepciones adecuadamente. Esto se hace utilizando bloques try-catch para capturar y manejar cualquier excepción que pueda ocurrir durante la lectura. 
 
3. Tamaño del búfer: Al leer datos desde un InputStream, puedes mejorar el rendimiento al utilizar un búfer de lectura. El tamaño del búfer puede variar dependiendo del tipo de datos que estés leyendo y el rendimiento deseado. Es recomendable experimentar con diferentes tamaños de búfer para encontrar el más eficiente en tu caso. 
 
4. Flujos de datos: A menudo, es útil envolver un InputStream en un flujo de datos más alto nivel, como BufferedReader o DataInputStream. Estos flujos proporcionan métodos adicionales para leer datos de manera más conveniente, como leer líneas completas o tipos de datos específicos. 
 
5. Lectura asincrónica: Si necesitas leer de un InputStream de manera asincrónica, puedes considerar el uso de clases como InputStreamReaders o NIO (New Input/Output). Estas clases proporcionan funcionalidades para leer de manera no bloqueante y eficiente cuando se trabaja con múltiples flujos de entrada. 
 
Recuerda que estas son solo algunas consideraciones generales al utilizar InputStream. Siempre es importante leer y comprender la documentación específica de las clases y métodos que estés utilizando para garantizar un uso correcto y eficiente.

### Nota: Que es un buffer?
Un buffer (también conocido como búfer) es un espacio de memoria temporal utilizado para almacenar datos mientras se transfieren de un lugar a otro. En el contexto de InputStream en Java, el tamaño del buffer se refiere a la cantidad de datos que se leen del InputStream a la vez antes de procesarlos. 
 
Por ejemplo, si estás leyendo un archivo de texto grande usando un InputStream, puedes crear un buffer de 1024 bytes. Esto significa que el InputStream leerá 1024 bytes del archivo a la vez y los almacenará temporalmente en el buffer antes de procesarlos. Luego, el InputStream leerá otros 1024 bytes y los almacenará en el buffer, y así sucesivamente hasta que se lean todos los datos del archivo. 
 
El tamaño del buffer puede variar dependiendo del tipo de datos que estés leyendo y el rendimiento deseado. Es importante tener en cuenta que un buffer demasiado pequeño puede resultar en un rendimiento deficiente, mientras que un buffer demasiado grande puede consumir demasiada memoria y causar problemas de rendimiento. Por lo tanto, es recomendable experimentar con diferentes tamaños de buffer para encontrar el más eficiente en tu caso.