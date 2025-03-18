
package labda;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class main {
    public static void main(String[] args) {
        //funciones lambdas
        //las funciones lambdas son funciones o metodos en java que se representaran de manera
        //manera anonima , pues se definen en line donde se vayan a utilizar ,dichas funciones pueden
        // recibir cero o mas argumentos y devolver uno o ningun valor de retorno.

        // la sintaxis 
        //(parameros)-> {cuerpo de la funcion}
        /*/
        parametros : son los valores de entradas de la funcion 
        operador -> : separa los parametros de la implementacion
        Cuerpo de la funcion : es el codigo que se ejecutara

        las expresiones lambdas solo funcionan con interfaces funcionales , es decir, 
        interfaces que tienen un unico metodo abstracto.
        algunas interfaces funcionales predefinidas
        en java. util.function  incluyen

        fUCTION <T,R> recibe un argumento y devuelve un resultado 
        conssumer <T> recibe un aargumento y no devuleve nada
        supplier t no recibe argumentos pero devuelve un resultado
        predicate recibe un argumento y devuelve true a false


        consumer es una interfaz funcional que representa una operacion que un solo argumento de entrada y no devuelve ningun resultado
        la interfaz consumer se utiliza comunmente para realizar acciones secundarias sobre un objeto como imprimirlo en la consola
        agregarla a una coleccion a cualquier otra operacion que no requiera devolver un vlaor.

        */
        // cracion de un consumer <String> usando una expresion lambda

       // Creación de un Consumer<String> usando una expresión lambda
        Consumer<String> consumidor =  saludo -> {
            // Se declara una variable local llamada lenguaje
            String lenguaje = "Java";

            // Se imprime el saludo concatenado con una cadena adicional
            System.out.println(saludo + " Bienvenid@ a " + lenguaje + "!");
        };
        consumidor.accept("Hola pepe");
        // Se invoca el método accept del Consumer con un argumento "Hola Pepe"


        // Creación de un BiConsumer<String, String> usando una expresión lambda
        BiConsumer<String, String> consumidor2 = (nombre, saludo) -> {
            // Se declara una variable local llamada lenguaje
            String lenguaje = "Java";

            // Se imprime el saludo, nombre y una cadena adicional
            System.out.println(saludo + " " + nombre + " Bienvenid@ a " + lenguaje + "!");
        };

        // Se invoca el método accept del BiConsumer con dos argumentos "Pepe" y "Hola"
        consumidor2.accept("Pepe", "Hola");
        
        /*
        a interfaz funcional Supplier<T> pertenece al paquete java.util.function y 
        se utiliza para representar un proveedor de resultados. 
        Esta interfaz no toma ningún argumento y produce un resultado de tipo T. 
        Es decir, se utiliza cuando se necesita generar o proporcionar un valor, 
        pero no se tiene ningún argumento para hacerlo. 
        Se puede pensar en ello como una fábrica que suministra datos.
       
        */
        // Supplier que suministra un número aleatorio entre 1 y 100
        Supplier<Integer> generadorAleatorio = () -> new Random().nextInt(100) + 1;

        // Obtener el resultado del Supplier
        int numeroAleatorio = generadorAleatorio.get();

        System.out.println("Número aleatorio: " + numeroAleatorio);
        
        
        Function<String, Integer> sizeOf = (String s) -> {
            return s.length();
        };
        String mensaje = "holiissss";
        int longitud =sizeOf.apply(mensaje);
        
        System.out.println("Longitud del mensaje "+ longitud);
        
        /*
            la interfaz funcional predicate <T> pertenece al paquete java.util.function
            para retornar un valor booleano : true or false 
        */
        Predicate<Integer> esPar = numero -> numero % 2==0;
        System.out.println("¿4 es par ?" + esPar.test(4));
        System.out.println("¿7 es par ?" + esPar.test(7));
    }
    

    
}
