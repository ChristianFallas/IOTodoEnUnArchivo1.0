# Input y Output Java (IO).

En Java, y en general en todos los lenguajes de programación, el input y el output se refieren a cómo se ingresan los datos en un programa y cómo se muestran los resultados. 
 
El input en Java se realiza mediante la lectura de datos desde una fuente externa, como el teclado o un archivo. Puedes utilizar la clase Scanner para leer datos desde el teclado o BufferedReader para leer datos desde un archivo. 
 
Por ejemplo, si deseas leer un número entero desde el teclado, puedes usar el siguiente código:

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        System.out.println("El número ingresado es: " + numero);
    }
}
~~~

En este caso, el input es el número entero que el usuario ingresa desde el teclado. 
 
Por otro lado, el output en Java se refiere a cómo se muestran los resultados o mensajes al usuario. Puedes utilizar la clase System.out para imprimir mensajes en la consola. 
 
Por ejemplo, si deseas mostrar un mensaje al usuario, puedes usar el siguiente código:

~~~
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, bienvenido a mi programa.");
    }
}
~~~~

En este caso, el output es el mensaje "Hola, bienvenido a mi programa" que se muestra en la consola. 