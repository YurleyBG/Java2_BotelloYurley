
package Singleton;

// Singleton
// garantiza que solohaya una instancia de una clase en todo el proyecto.


public class main {
    
    static class Singleton {
        private static Singleton instancie;
        private Singleton(){};
        
        public static Singleton getInstance(){
        
        if(instancie==null){
        
            instancie=new Singleton();
        }
        return instancie;
        
        
        }
        public void MostrarMensaje(){
        
            System.out.println("Instancia unica de Singleton");
        }
    }
   
    public static void main(String[] args) {
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance(); 
        
        singleton1.MostrarMensaje();
        
        System.out.println(singleton1==singleton2);//true misma 
        
    }
    
}
