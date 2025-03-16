
package CRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
            System.out.println("No se pudo listar los productos porque no hay");
        }
        else{
            for (Producto producto : productos ) {
                System.out.println(producto);
                
            }
        
        }
    
    }
    public static void guardarPersona() {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (Persona p : personas) {
                writer.write(p.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar la persona: " + e.getMessage());
        }
    }
    
    public static void guardarProducto() {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (Producto pro : productos) {
                writer.write(pro.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar el producto: " + e.getMessage());
        }
    }
    
    
    
    public static void agregarPersona(int id, String nombre, int edad) {
        personas.add(new Persona(id, nombre, edad));
        guardarPersona();
    }
    
    
    public static void agregarProductos(int id, String nombre, double precio) {
        productos.add(new Producto(id, nombre, precio));
        guardarProducto();
    }
    
    
    public static void actualizarPersona(int id, String nuevoNombre, int nuevaEdad) {
        for (Persona p : personas) {
            if (p.getId() == id) {
                p.setNombre(nuevoNombre);
                p.setEdad(nuevaEdad);
                guardarPersona();
                return;
            }
        }
        System.out.println("Persona con ID " + id + " no encontrada.");
    }
    public static void actualizarProducto(int id, String nuevoNombre, double nuevoPrecio) {
        for (Producto pro : productos) {
            if (pro.getId() == id) {
                pro.setNombre(nuevoNombre);
                pro.setPrecio(nuevoPrecio);
                guardarPersona();
                return;
            }
        }
        System.out.println("Producto con ID " + id + " no encontrada.");
    }
    
    
    public static void eliminarPersona(int id) {
        personas.removeIf(p -> p.getId() == id);
        guardarPersona();
    }
    
    
    public static void eliminarProducto(int id) {
        productos.removeIf(pro -> pro.getId() == id);
        guardarProducto();
    }
}
