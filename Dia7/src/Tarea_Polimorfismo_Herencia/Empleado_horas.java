
package Tarea_Polimorfismo_Herencia;

class Empleado_horas extends  Empleados {
    
    protected int horasTrabajadas;

    public Empleado_horas() {
       
    }

    public Empleado_horas(int horasTrabajadas, String Nombre, Double Salario) {
        super(Nombre, Salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    @Override
    public double calcularBonificacion() {
        
        if(getHorasTrabajadas()>=40){
            double salario_boni1=getSalario()*17/100;
            return salario_boni1;
        }
        else{
            double salario_boni2=getSalario()*10/100;
            return salario_boni2;
        }
       
    }
}
