
package CRUD;

import static CRUD.CrudTXT.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        cargarDatos();

        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean bool =true;
        while(bool){
        
            System.out.println("\n--- CRUD ---");
            System.out.println("1. Agregar Persona/Producto");
            System.out.println("2. Listar Persona/Producto");
            System.out.println("3. Actualizar Persona/Producto");
            System.out.println("4. Eliminar Persona/Producto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
  
            
            switch(opcion){
                
                case 1:
                    System.out.println("--------AGREGAR-----------");
                    System.out.println("");
                    System.out.println("\n--- Opciones ---");
                    System.out.println("1. Persona");
                    System.out.println("2. Producto");
                    System.out.println("3. Regresar");
                    System.out.println("___________________");
                    System.out.println("Elige una opcion: ");
                    int opc = sc.nextInt();
                    switch(opc){
                        case 1:
                            System.out.print("Ingrese la id: ");
                            int id = sc.nextInt();
                            sc.nextLine(); 
                            System.out.print(" ingrese el Nombre: ");
                            String nombre = sc.nextLine();
                            System.out.print("ingrese la Edad: ");
                            int edad = sc.nextInt();
                            agregarPersona(id, nombre, edad);
                            guardarPersona();
                        break;
                        case 2:
                            System.out.print("Ingrese la id: ");
                            int idP = sc.nextInt();
                            sc.nextLine();
                            System.out.print(" ingrese el Nombre: ");
                            String nombreP = sc.nextLine();
                            System.out.print("ingrese el precio: ");
                            double precio = sc.nextDouble();
                            agregarProductos(idP, nombreP, precio);
                            guardarProducto();
                        break;
                        case 3:
                            System.out.println("Regresando ....");
                            bool=true;
                        break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                break;
                case 2:
                    System.out.println("-----------LISTAR----------");
                    System.out.println("");
                    System.out.println("\n--- Opciones ---");
                    System.out.println("1. Persona");
                    System.out.println("2. Producto");
                    System.out.println("3. Regresar");
                    System.out.println("___________________");
                    System.out.println("Elige una opcion: ");
                    int opc0 = sc.nextInt();
                    switch(opc0){
                        case 1:
                            ListarPersonas();
                        break;
                        case 2:
                            ListarProductos();
                        break;
                        case 3:
                            System.out.println("Regresando ....");
                            bool=true;
                        break;
                        default:
                            System.out.println("Opción no válida.");
                    
                    }
                break;
                case 3:
                    System.out.println("---------ACTUALIZAR-----------");
                    System.out.println("");
                    System.out.println("\n--- Opciones ---");
                    System.out.println("1. Persona");
                    System.out.println("2. Producto");
                    System.out.println("3. Regresar");
                    System.out.println("___________________");
                    System.out.println("Elige una opcion: ");
                    int opc1 = sc.nextInt();
                    switch(opc1){
                        case 1:
                            System.out.print("ingrese el id de la persona a actualizar: ");
                            int idActualizar = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Nuevo nombre: ");
                            String nuevoNombre = sc.nextLine();
                            System.out.print("Nueva edad: ");
                            int nuevaEdad = sc.nextInt();
                            actualizarPersona(idActualizar, nuevoNombre, nuevaEdad);
                            guardarPersona();
                        break;
                        case 2:
                            System.out.print("ingrese el id de la persona a actualizar: ");
                            int idActualizar1 = sc.nextInt();
                            sc.nextLine();
                            System.out.print(" ingrese el Nuevo nombre: ");
                            String nuevoNombre1 = sc.nextLine();
                            System.out.print("ingrese la Nueva edad: ");
                            double precio = sc.nextDouble();
                            actualizarProducto(idActualizar1, nuevoNombre1, precio);
                            guardarProducto();
                        break;
                        case 3:
                            System.out.println("Regresando ....");
                            bool=true;
                        break;
                        default:
                            System.out.println("Opción no válida.");
                    
                    
                    
                    }
                break;
                case 4:
                    System.out.println("---------ELIMINAR-----------");
                    System.out.println("");
                    System.out.println("\n--- Opciones ---");
                    System.out.println("1. Persona");
                    System.out.println("2. Producto");
                    System.out.println("3. Regresar");
                    System.out.println("___________________");
                    System.out.println("Elige una opcion: ");
                    int opc2 = sc.nextInt();
                    switch(opc2){
                        case 1:
                            System.out.print("ingrese la id de la persona a eliminar: ");
                            int idEliminar = sc.nextInt();
                            eliminarPersona(idEliminar);
                            guardarPersona();
                        break;
                        case 2:
                            System.out.print("ingrese la id de la persona a eliminar: ");
                            int idEliminar1 = sc.nextInt();
                            eliminarProducto(idEliminar1);
                            guardarProducto();
                        break;
                        case 3:
                            System.out.println("Regresando ....");
                            bool=true;
                        break;
                        default:
                            System.out.println("Opción no válida.");
                    
                    
                    
                    }
                break;
                case 5:
                    System.out.println("Haz abandonado el programa :)");
                    bool=false;
                break;
                default:
                    System.out.println("Opción no válida.");
           
            
            
            }
        
        
        
        }
        
    }
   
}
