/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6;

import java.util.*;
public class InventarioTest {
    
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in); 
       
        Producto GI1=new Producto();
        Producto GI2=new Producto("ca1456","cafe",10,5000);
        GI1.setNombre("Arroz");
        GI1.setCodigo("1236ea");
        GI1.setCantidad(30);
        GI1.setPrecio(4000);
        System.out.println("Nombre: "+GI1.getNombre());
        System.out.println("Codigo: " + GI1.getCodigo());
        System.out.println("Cantidad: "+GI1.getCantidad());
        System.out.println("Precio: "+ GI1.getPrecio());
        System.out.println("------------------------");
        System.out.println("Nombre: "+GI2.getNombre());
        System.out.println("Codigo: " + GI2.getCodigo());
        System.out.println("Cantidad: "+GI2.getCantidad());
        System.out.println("Precio: "+ GI2.getPrecio());
        
         System.out.println("");
         System.out.println("----MENU-----");
         System.out.println("1.comprar");
         System.out.println("2.agregar");
         System.out.println("");
         System.out.println("ingrese una la opcion que desea");
         int opc=scan.nextInt();
         if(opc==1){
            System.out.println("ingrese la cantida que va a comprar");
            int can=scan.nextInt();
            GI1.actualizarStoc(can);
            System.out.println(GI1.getCantidad());
         
         }
         else if(opc==2){
             System.out.println("ingrese la cantida que va ingresar");
            int can=scan.nextInt();
            GI1.actualizarStoc(can);
            System.out.println(GI1.getCantidad());
         
        }
        else{
             System.out.println("esta opcion es invalida.");
         
        }
        
        
        
        
        
     
    }
    
}
