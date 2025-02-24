
package dia6;

import java.util.*;
public class InventarioTest {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); 
       
        Producto GI1=new Producto();
        ArrayList<Producto>producticos=new ArrayList<>();
        producticos.add(new Producto("c3245A","Cafe",30,10000));
        producticos.add(new Producto("c3345A","panela",20,8000));
        producticos.add(new Producto("c3445A","Arroz",40,4000));
        for (Producto i :producticos) {
            System.out.println("");
            System.out.println("Cosdigo: "+i.getCodigo());
            System.out.println("Nombre: "+i.getNombre());
            System.out.println("Cantidad: "+i.getCantidad());
            System.out.println("Precio: "+i.getPrecio());
           
        }
        System.out.println("");
        System.out.println("----MENU-----");
        System.out.println("1.comprar");
        System.out.println("2.agregar");
        System.out.println("");
        System.out.println("ingrese una la opcion que desea");
        int opc=scan.nextInt();
        if(opc==1){
            scan.nextLine();
            System.out.println("ingrese el codigo del producto");
            String Code=scan.nextLine();
            for (Producto i :producticos) {
                if(Code.equalsIgnoreCase(i.getCodigo())){
                    
                    System.out.println("ingrese la cantidad que va a comprar(en numeros negativos)");
                    int can=scan.nextInt();
                    i.actualizarStoc(can);
                    System.out.println(i.getCantidad());
                    
                    System.out.println("----------------");
                    System.out.println("Nombre: "+i.getNombre());
                    System.out.println("Cantidad: "+i.getCantidad());
                    System.out.println("Precio: "+i.getPrecio()*can*-1);
                }
            }    

        }
        else if(opc==2){
           scan.nextLine();
           System.out.println("ingrese el codigo del producto");
           String Code=scan.nextLine();
            for (Producto i :producticos) {
                if(Code.equalsIgnoreCase(i.getCodigo())){
                    System.out.println("ingrese la cantida que va ingresar");
                    int can=scan.nextInt();
                    i.actualizarStoc(can);
                    System.out.println(i.getCantidad());
                    
                    System.out.println("----------------");
                    System.out.println("Nombre: "+i.getNombre());
                    System.out.println("Cantidad: "+i.getCantidad());
                   
                    
                }
            } 
           

        }
        else{
             System.out.println("esta opcion es invalida.");
         
        }
   
    }
    
}
