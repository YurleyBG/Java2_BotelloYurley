<<<<<<< HEAD

package Adapter;

// Adapter 

// convierte la interfaz de una clase en otra interfaz espaerda por el cliente
//permite que clase incompatibles trabajan juntas.


// Contacto
//Supongamos que tenemos un sistema antiguo que usa Volt!20 y 
//queremos adaptarlos a un sistema moderno que usa 


public class main {
    
    // interfaz esperada por el cliente
    interface Volt12{
        int getVolt12();

    }
    static class Volt120{
        int getVolt120(){
             return 120;
        }

    }
    static class VoltAdapter implements Volt12{
     
        private Volt120 volt120;

        public VoltAdapter(Volt120 volt120) {
            this.volt120=volt120;
        }
        @Override
        public int getVolt12(){
            return volt120.getVolt120()/10;
        }
        public static void main(String[] args) {
           
            Volt120 oldSystem =new Volt120();
            Volt12 adapterSystem = new VoltAdapter(oldSystem);
            System.out.println("Voltajeadaptada "+ adapterSystem.getVolt12()+ "V");
        }
    }
    
}
=======

package Adapter;

// Adapter 

// convierte la interfaz de una clase en otra interfaz espaerda por el cliente
//permite que clase incompatibles trabajan juntas.


// Contacto
//Supongamos que tenemos un sistema antiguo que usa Volt!20 y 
//queremos adaptarlos a un sistema moderno que usa 


public class main {
    
    // interfaz esperada por el cliente
    interface Volt12{
        int getVolt12();

    }
    static class Volt120{
        int getVolt120(){
             return 120;
        }

    }
    static class VoltAdapter implements Volt12{
     
        private Volt120 volt120;

        public VoltAdapter(Volt120 volt120) {
            this.volt120=volt120;
        }
        @Override
        public int getVolt12(){
            return volt120.getVolt120()/10;
        }
        public static void main(String[] args) {
           
            Volt120 oldSystem =new Volt120();
            Volt12 adapterSystem = new VoltAdapter(oldSystem);
            System.out.println("Voltajeadaptada "+ adapterSystem.getVolt12()+ "V");
        }
    }
    
}
>>>>>>> 2e2f20ddd12d643119649c0b8951c135bd35468a
