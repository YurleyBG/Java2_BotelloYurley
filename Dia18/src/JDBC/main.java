
package JDBC;
import java.util.*;
import JDBC.usuarioDAD;
import java.util.List;
public class main {

    public static void main(String[] args) {
        usuarioDAD USUARIOdad = new usuarioDAD();
        Scanner scan =new Scanner(System.in);
        boolean bool= true;
        while(bool){
            System.out.println("-----MENU------");
            System.out.println("1. ver");
            System.out.println("2.actualizar");
            System.out.println("3.agregar");
            System.out.println("4.eliminar");
            System.out.println("5.ver por id");
            System.out.println("6. salir ");
            
            System.out.println("Ingrese una opcion");
            int opc=scan.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("______VER USUARIOS_____");
                    System.out.println("");
                    List<String> ListaUsuario =USUARIOdad.obtenerUsuario();
                    for (String  usuario :ListaUsuario ) {

                        System.out.println(usuario);
                    }
                    bool=false;
                break;
                case 2:
                    System.out.println("_____ACTUALIZAR USUARIO ______");
                    System.out.println("");
                    System.out.println("ingrese la id del usuario ");
                    scan.nextLine();
                    int idecita1=scan.nextInt();
                    System.out.println("ingrese el nombre del usuario ");
                    String nombre=scan.nextLine();
                    System.out.println("ingrese el email del usuario ");
                    String email=scan.nextLine();
                    USUARIOdad.actualizarUsuario(idecita1,nombre, email); 
                    bool=false;
                    
                break;
                case 3:
                    System.out.println("_____AGREGAR USUARIO ______");
                    System.out.println("");
                    System.out.println("ingrese el nombre nuevo del usuario ");
                    scan.nextLine();
                    String nombre1=scan.nextLine();
                    System.out.println("ingrese el email nuevo del usuario ");
                    String email1=scan.nextLine();
                    USUARIOdad.insertUsuario(nombre1, email1);
                     bool=false;
                    
                break;
                case 4:
                    System.out.println("_____ELIMINAR USUARIO ______");
                    System.out.println("");
                    System.out.println("ingrese la id del usuario a eliminar");
                    int idecita=scan.nextInt();
                    List<String> ListaUsuario1 =USUARIOdad.obtenerUsuario();
                    ListaUsuario1=USUARIOdad.EliminarUsuarioID(idecita);
                     bool=false;
                break;
                case 5:
                    List<String> ListaUsuario2 =USUARIOdad.obtenerUsuario();
                    System.out.println("_____VER USUARIO ID ______");
                    System.out.println("");
                    System.out.println("ingrese la id del usuario a ver");
                    int ide=scan.nextInt();
                    ListaUsuario2=USUARIOdad.obtenerUsuarioID(ide);
                    for (String  usuario :ListaUsuario2 ) {
                        System.out.println(usuario);
                    }
                     bool=false;
                break;
                case 6:
                    
                    System.out.println("haz abandonado el programa :(");
                    bool=false;
                break;
            
            }
        
        
        
        }
          

    }
    
}
