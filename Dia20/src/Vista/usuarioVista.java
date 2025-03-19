
package Vista;
import Modelo.usuario;
import java.util.List;
import java.util.Scanner;

public class usuarioVista {
    public void MostrarUsuario(List<usuario> usuarios ){
    
        System.out.println("Lista de usuarios ");
        for(usuario u : usuarios){
            System.out.println(u);
            
        }
    }
    public usuario agregarUsuario(){
    
        System.out.println("Datos para nuevo usuario");
        System.out.println("Nombre");
        Scanner sc = new Scanner(System.in);
        String Nombre =sc.nextLine();
        System.out.println("Email");
        String Email = sc.nextLine();
        return new usuario(Nombre,Email);
        
    }
    public usuario ActualizarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Datos para nuevo usuario");
        System.out.println("Id: ");
        int idecita = sc.nextInt();
        System.out.println("Nombre");
        sc.nextLine();
        String Nombre =sc.nextLine();
        System.out.println("Email");
        String Email = sc.nextLine();
        return new usuario(idecita,Nombre,Email);
    
    
    }
    public usuario EliminarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Datos para nuevo usuario");
        System.out.println("Id: ");
        int idecita = sc.nextInt();
        return new usuario(idecita);
    
    
    }
    public usuario ListarUsuarioId(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Listar usuario Id");
        System.out.println("Id: ");
        int idecita = sc.nextInt();
        return new usuario(idecita);
        
    
    
    }
    
    
}
