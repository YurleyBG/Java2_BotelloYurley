
package Factory;

interface Producto{

    void user();

}
class ProductoA implements Producto {
    
    public void user(){
        System.out.println("Usando Producto A");

    }
}
class ProductoB implements Producto {

    public void user(){
        System.out.println("Usando Producto B");

    }
}

public class main {
    
    //Factory Method
    //Este patrón define una interfaz para crear objetos, pero permite a las subclases decidir qué 
    // clase concreta instanciar. Se usa para evitar la creación directa de objetos con new.
    // Interfaz Producto
    
    class Factory {
    
        public static Producto crearProducto(String tipo){
            
            if (tipo.equalsIgnoreCase("A")){
            
                return new ProductoA();
            
            }
            else if (tipo.equalsIgnoreCase("B")){
                
                return new ProductoB();
            
            }
            throw new IllegalArgumentException("Tipo desconocido");
        
        }
    }
    public static void main(String[] args) {
        Producto p1=Factory.crearProducto("A");
        p1.user();
        
        Producto p2= Factory.crearProducto("B");
        p2.user();
    }
    
    
    
    
}

