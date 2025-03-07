
package Abstract;

// Abstract Factory
// familias de objectos realcionados sin especificar sus clases concretas
// se usan cuando hay multiples variantes de productos


// interfacs de productosd

interface Boton {
    void render();
}
interface Ventana {
    void Abrir();
}
interface GUIFactory {
   Boton crearBoton();
   Ventana crearVentana();
   
}

public class main {
    
    static class ButonWindows implements Boton{
        public void render(){
        
            System.out.println("Renderizando boton estilo Windows");
        }
    
    }
    static class VentanaWindows implements Ventana{
        public void Abrir(){
        
            System.out.println("Abriendo ventana estilo Windows");
        }
    
    }
    static class ButonMac implements Boton{
        public void render(){
        
            System.out.println("Renderizando boton estilo mac ");
        }
    
    }
    static class VentanaMac implements Ventana{
        public void Abrir(){
        
            System.out.println("Abriendo ventana estilo mac ");
        }
    
    }
    
    // Factorizacion 
    
    static class WindowsFactory implements GUIFactory{
    
        public  Boton crearBoton(){
        
            return new ButonWindows();
        }
        public  Ventana crearVentana(){
        
            return new VentanaWindows();
        }
    
    
    }
    static class MacFactory implements GUIFactory{
    
        public  Boton crearBoton(){
        
            return new ButonMac();
        }
        public  Ventana crearVentana(){
        
            return new VentanaMac();
        }
    
    
    }
    public static void main(String[] args) {
        GUIFactory factory =new WindowsFactory();
        Boton boton = factory.crearBoton();
        Ventana ventana =factory.crearVentana();
        
        boton.render();
        ventana.Abrir();
    }
    
    
}
