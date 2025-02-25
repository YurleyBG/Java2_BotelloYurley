
package Tarea_Polimorfismo_Herencia;


public class Main_Vehiculos {
    
    
    public static void main(String[] args) {
        Vehiculos vehi =new Vehiculos("Yamaha","Yamaha MT-07");

        vehi.mostrarDetalles();
        
        System.out.println("");
        Vehiculos vehicuM=new Motocicleta("bicilíndrico en paralelo",649,"Negro","Kawasaki","Ninja 650");
        vehicuM.mostrarDetalles();
        
        System.out.println("");
        Vehiculos vehicuC=new Coche("W16 a 72° tetra Turbo ",7993,"Rojo y Negro",1200,"Bugatti","Veyron");
        vehicuC.mostrarDetalles();
    }
    
}
