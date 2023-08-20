# BufferedInputStream.

BufferedInputStream es una clase en Java que se utiliza para mejorar el rendimiento de la lectura de datos desde un flujo de entrada. Funciona al crear un búfer interno que almacena temporalmente los datos leídos del flujo subyacente. Esto minimiza la cantidad de operaciones de lectura en el flujo subyacente y mejora la eficiencia general. 
 
Cuando se lee desde un BufferedInputStream, en lugar de leer directamente del flujo subyacente, los datos se leen en el búfer interno en bloques más grandes. Esto reduce la frecuencia de las llamadas al sistema operativo para leer datos y mejora el rendimiento general. 
 
El uso de BufferedInputStream es especialmente beneficioso cuando se trabaja con flujos de entrada que son lentos, como la lectura de datos desde un archivo en disco o desde una red. Al leer datos en bloques más grandes y almacenarlos en el búfer interno, se minimiza la latencia y se mejora la eficiencia de lectura. 
 
Para utilizar BufferedInputStream en Java, primero debes crear una instancia de esta clase pasando el flujo de entrada subyacente como argumento al constructor. Luego, puedes leer datos desde el BufferedInputStream utilizando los métodos de lectura proporcionados por la clase, como read(), read(byte[]), etc. 
 
Aquí hay un ejemplo básico de cómo utilizar BufferedInputStream:

~~~
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("archivo.txt"))) {
            int data;
            while ((data = bufferedInputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
~~~

En este ejemplo, se crea un BufferedInputStream que lee datos del archivo "archivo.txt". Luego, se utiliza un bucle while para leer y mostrar los datos leídos en la consola. 

## Consideraciones al hacer uso de BufferedInputStream.
Al hacer uso de BufferedInputStream en Java, hay algunas consideraciones a tener en cuenta: 
 
1. Rendimiento: BufferedInputStream mejora el rendimiento al leer datos de un flujo subyacente, ya que almacena en búfer una cantidad de datos en memoria antes de hacer la lectura real. Esto reduce la cantidad de operaciones de lectura en el flujo subyacente y mejora la eficiencia, especialmente cuando se realizan múltiples lecturas pequeñas. 
 
2. Tamaño del búfer: Puedes especificar el tamaño del búfer al crear una instancia de BufferedInputStream. El tamaño del búfer determina la cantidad de datos que se almacenarán en memoria antes de realizar la lectura real. Es importante elegir un tamaño de búfer adecuado según tus necesidades y el tipo de datos que estés leyendo. 
 
3. Lectura y almacenamiento en búfer: BufferedInputStream lee datos del flujo subyacente en bloques y los almacena en el búfer interno. Luego, puedes leer los datos del búfer utilizando los métodos de lectura proporcionados por BufferedInputStream, como  read() ,  read(byte[]) , etc. Ten en cuenta que si no lees todos los datos almacenados en el búfer, se perderán. 
 
4. Cierre del flujo: Es importante cerrar tanto el BufferedInputStream como el flujo subyacente después de utilizarlos para liberar los recursos del sistema. Puedes hacerlo llamando al método  close()  en el BufferedInputStream, lo cual también cerrará el flujo subyacente. 
 
5. Excepciones: Al igual que otras clases de I/O en Java, BufferedInputStream puede lanzar excepciones, como IOException, en caso de errores de lectura o cierre. Es importante manejar estas excepciones adecuadamente utilizando bloques try-catch o propagándolas hacia arriba en la jerarquía de llamadas. 
 
Recuerda que BufferedInputStream es una clase de envoltura (wrapper) para otro flujo de entrada, como FileInputStream. Puedes crear una instancia de BufferedInputStream pasando el flujo subyacente como argumento en el constructor. 
 
Teniendo en cuenta estas consideraciones, puedes utilizar BufferedInputStream para mejorar el rendimiento de lectura de datos en tu aplicación Java.