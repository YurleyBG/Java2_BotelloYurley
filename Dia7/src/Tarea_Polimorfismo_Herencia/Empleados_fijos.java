
package Tarea_Polimorfismo_Herencia;


class Empleados_fijos extends Empleados{
    
    protected int horasTrabajadas;

    public Empleados_fijos() {
    }

    public Empleados_fijos(int horasTrabajadas, String Nombre, Double Salario) {
        super(Nombre, Salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    

    @Override
    public double calcularBonificacion() {
        if(getHorasTrabajadas()>=40){
           double salario_boni1=getSalario()*20/100;
           return salario_boni1;
        
        }
        else{
            double salario_boni2=getSalario()*12/100;
            return salario_boni2;
            
        }
    }


    
   
    
    
}
