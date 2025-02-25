
package Tarea_Polimorfismo_Herencia;


public class Vehiculos {
    private String marca;
    private String modelo;
    
    
    public Vehiculos(){}
    public Vehiculos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    public void mostrarDetalles(){
        
        System.out.println("La marca es "+ getMarca()+" y el modelo es "+ getModelo());
        
    
    }

   
    
}
