
package Prototype;

// prototype
//se usaapara clonar objetos sin acoplar al codigo a sus clases concretas 
// java proporciona cloneables para esto

public class prototype {
    
    static class Persona implements Cloneable {
    
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        
        public void mostrarinfo(){
            System.out.println("Persona: "+ nombre+ "Edad " +edad);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone(); 
        }
        
        
        
        public static void main(String[] args) {
            try{
            
                Persona p1= new Persona ("juna",25);
                Persona p2 = (Persona) p1.clone();
                
                p1.mostrarinfo();
                p2.mostrarinfo();
            }
            catch(CloneNotSupportedException e){
            
                e.printStackTrace();
            
            }
        }
        
    
    
    }
    
}
