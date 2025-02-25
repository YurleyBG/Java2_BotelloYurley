
package Tarea_Polimorfismo_Herencia;

import java.util.ArrayList;


public class Main_empleado {
    
    public static void main(String[] args) {
     
        ArrayList<Empleados>empleados=new ArrayList<>();
        empleados.add(new Empleados_fijos(30,"juan",160000.0));
        empleados.add(new Empleado_horas(50,"alex",130000.0));
        empleados.add(new Empleado_horas(20,"pedrito",130000.0));
        empleados.add(new Empleados_fijos(50,"sofia",150000.0));
        
        System.out.println("");
        for(Empleados i : empleados){
            if(i instanceof Empleados_fijos){
                Empleados_fijos EF = (Empleados_fijos) i;
                double obt_salario=EF.calcularBonificacion();
                double New_salario=EF.getSalario()+obt_salario;
                System.out.println("El empleado que recibio la bonificacion fue "+ EF.getNombre()+" ahora su salario es de "+ New_salario+"y su bonificacion fue de "+obt_salario);
               
            
            }
            else if (i instanceof Empleado_horas){
                Empleado_horas EH = (Empleado_horas) i;
                double obt_salario=EH.calcularBonificacion();
                double New_salario=EH.getSalario()+obt_salario;
                System.out.println("El empleado que recibio la bonificacion fue "+ EH.getNombre()+" ahora su salario es de "+New_salario +" y su bonificacion fue de "+obt_salario);
            
            
            }
        
        
        }
        
        
        
    }
    
}
