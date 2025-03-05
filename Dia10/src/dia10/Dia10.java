
package dia10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;


public class Dia10 {
    // CONJUNTOS , MAPAS ENEMUERADOS Y EXCEPCIONES 
    // SETS:
    // los sets son una coleccion desordenadas de objectos en la que no se pueden 
    // almacenar valores duplicados

   
    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<>();
        // Agregat elementos al 
        treeSet.add("Manzana");
        treeSet.add("Banana");
        treeSet.add("Naranja");
        treeSet.add("Pera");
         treeSet.add("manzana");
        
        // mostrar elementos del treeSer
        System.out.println("elementos en treeset " +treeSet);
        
        // Iteracion en un arbol 
        //1. Importar "interador " y navegar con ese iterador
        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            
            System.out.println(iterator.next());
        
        
        }
        System.out.println("$$$$$$$$$$$$$$$$$");
        //2.con un for-each
        for (String elemento : treeSet) {
           
            System.out.println(elemento);
        }
        
        
        // obtener el tamaño del conjunto 
        
        int tamaño = treeSet.size();// esta alamcena el numero de elementos del conjunto
        // en la variable tamaño
        System.out.println(tamaño);
        
        // Convetir  el set en un String 
        
        String resultados = treeSet.toString();// Esto almacenado una representacion en 
        //cadena del conjunto de variantes 
        System.out.println(resultados);
        
        // mapas 
        
        // los mapas d som una estructura de datos que me permite guardar informacion de mnera de asociacion de 
        //clave/ valor , muy  parecido a los diccionarios
        
       Map<String, Integer> hashMap = new HashMap<>();

        // Asignar valores al mapa usando el método put()
        hashMap.put("Juan", 25);
        hashMap.put("María", 30);
        hashMap.put("Luis", 28);
        hashMap.put("Ana", 35);

        // Acceder y mostrar los valores del HashMap
        System.out.println("Edad de Juan: " + hashMap.get("Juan"));
        System.out.println("Edad de María: " + hashMap.get("María"));
        System.out.println("Edad de Luis: " + hashMap.get("Luis"));
        System.out.println("Edad de Ana: " + hashMap.get("Ana"));
      
        
        // Interar entre un mapa
        //1. Importando iterator
        
        Iterator<Map.Entry<String, Integer>> iterator2 = hashMap.entrySet().iterator();
        while (iterator2.hasNext()) {
           Map.Entry<String, Integer> entry = iterator2.next();
           String clave = entry.getKey();
           Integer valor = entry.getValue();
           System.out.println("Nombre: " + clave + ", Edad: " + valor);
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
        
        //2. bucle for-each
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String clave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("Nombre: " + clave + ", Edad: " + valor);
        }
        
        // instancia de enumerador
        Pais francia= Pais.FRANCIA;
        String nombre=francia.name(); // devuelve un String con el nombre de la constante francia
        System.out.println(nombre);
        System.out.println(francia.toString()); // vDevueleve un string con el nombre de la constaten (francia)
        System.out.println(francia.ordinal()); //devuelve un entero con la posicion del enum segun esta declarado
        System.out.println(francia.values()); // devueleve un  array que contiene todos los valores del enum
          
        // acceder a las costantes de  la enumeracion
        Pais Elpais= Pais.ESPAÑA;
        
        // obtener informacion del pais 
        String NombrePais=Elpais.getNombre();
        String CapitalPais=Elpais.getCapital();
        
        //Imprimir informacion del pais
        System.out.println("el pais "+ NombrePais);
        System.out.println("la capital "+ CapitalPais);
        
        
        
        // Manejo de excepciones (Try catch)
        
        // en java , el bloque try-catch se usa para manejar  excepciones con el 
        // fin de evitar qe un error detenga abruptamente la ejecucion 
        // del programa
        
        
        try{
            int numero1=10;
            int numero2=0;
            int resultado1=numero1/numero2;
            System.out.println("el resultado es: " + resultado1);
            
        
        
        
        }
        catch(Exception e){
            System.out.println("Error: no se te olvide que no puedes dividir por cero"+ e.getMessage());
        
        }finally{
            System.out.println("Fin del programa");
        }
        
        
        
    }
    
}
