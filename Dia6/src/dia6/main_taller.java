
package dia6;

import java.util.*;
public class main_taller {
    
    public static void main(String[] args) {
          Scanner scan=new Scanner(System.in); 
        // Implementación de una Clase Empleado 
            
        Empleados e1=new Empleados("yuli",1,2000000);
        e1.setNombre("yurley");
        e1.setSaldo(25000.0);
        e1.mostrarInformacion();
        
        
        //Sistema de Gestión de Inventario
        System.out.println("");
        GestionInventario GI1=new GestionInventario();
        
        GI1.setNombre("Arroz");
        GI1.setCodigo("1236ea");
        GI1.setCantidad(30);
        GI1.setPrecio(4000);
        System.out.println("Nombre: "+GI1.getNombre());
        System.out.println("Codigo: " + GI1.getCodigo());
        System.out.println("Cantidad: "+GI1.getCantidad());
        System.out.println("Precio: "+ GI1.getPrecio());
        System.out.println("ingrese la cantida que modificara el stock");
        int can=scan.nextInt();
        GI1.actualizarStoc(can);
        System.out.println(GI1.getCantidad());
        
     
    }
    
}
