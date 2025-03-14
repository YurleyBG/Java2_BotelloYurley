
package CRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class CrudTXT {
    private static String archivo ="./src/CRUD/data.txt";
    private static List<Persona> personas = new ArrayList<>();
    private static List<Producto> productos = new ArrayList<>();
    
    
    public static void cargarDatos(){
    
        personas.clear();
        productos.clear();
        try{
            BufferedReader reader = new BufferedReader (new FileReader(archivo));
            String  Linea ;
            while((Linea=reader.readLine())!=null){
                if (Linea.startsWith("P,")){
                    personas.add(Persona.fromString(Linea));
                
                }
                else if (Linea.startsWith("PR,")){
                    productos.add(Producto.fromString(Linea));
                
                }
            }
        
        }catch(Exception e){
            System.out.println("No se puede cargar el archivo . se procede a crear uno nuevo");}        
    
    }
    public static void ListarPersonas(){
    
        if (personas.isEmpty()){
            System.out.println("No se pudo listar la persona porque no hay");
        }
        else{
            for (Persona persona : personas ) {
                System.out.println(persona);
                
            }
        
        }
    
    }
    public static void ListarProductos(){
    
        if (productos.isEmpty()){
            System.out.println("No se pudo listar la persona porque no hay");
        }
        else{
            for (Producto producto : productos ) {
                System.out.println(producto);
                
            }
        
        }
    
    }
    
}
