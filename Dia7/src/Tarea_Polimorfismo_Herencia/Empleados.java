
package Tarea_Polimorfismo_Herencia;


public class Empleados {
    private String Nombre;
    private Double Salario;

    public Empleados(){}
    public Empleados(String Nombre, Double Salario) {
        this.Nombre = Nombre;
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public Double getSalario() {
        return Salario;
    }
    
    
    public double calcularBonificacion(){
        
        return  getSalario()* 10/100;
    
    }
    
    
    
}
