
package Controlador;
    import Vista.usuarioVista;
    import java.util.Scanner;
    import Modelo.usuario;
    import Modelo.UsuarioDAD;
    import Vista.usuarioVista;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class CtrlUsuario {
    private UsuarioDAD usuariodad;
    private usuarioVista VistaUsuario;
    private usuario Usuario;
    private Scanner scanner;

    public CtrlUsuario(UsuarioDAD usuariodad, usuarioVista VistaUsuario) {
        this.usuariodad = usuariodad;
        this.VistaUsuario = VistaUsuario;
        this.scanner = scanner= new Scanner(System.in);
    }

    public void iniciar() throws SQLException{
    
        while(true){
        
            System.out.println("Menu principal");
            System.out.println("1.crear usuario");
            System.out.println("2.Actualizar Usuario");
            System.out.println("3.Eliminar Usuario");
            System.out.println("4.listar Usuario id");
            System.out.println("5.listar Todos los Usuarios ");
            System.out.println(": ");
            int opcion =scanner.nextInt();
            switch(opcion){
            
                case 1:
                    usuario nuevoUsuario=VistaUsuario.agregarUsuario();
                    usuariodad.insertUsuario(nuevoUsuario);
                    System.out.println("Usuario agregado");
                    
                break;
                case 2: 
                    usuario UsuarioActualizado=VistaUsuario.ActualizarUsuario();
                    usuariodad.actualizarUsuario(UsuarioActualizado);
                    System.out.println("Usuario Actualizado");
                    
                break;
                case 3: 
                    usuario UsuarioEliminar=VistaUsuario.EliminarUsuario();
                    usuariodad.EliminarUsuarioID(UsuarioEliminar);
                    System.out.println("Usuario Eliminado");
                    
                break;
                case 4: 
                    System.out.println("----Listar Usuario ID -------");
                    System.out.println(" ");
                    List<String> ListaUsuario2 = new ArrayList<>();
                    usuario usuarioId=VistaUsuario.ListarUsuarioId();
                    
                    ListaUsuario2=usuariodad.obtenerUsuarioID(usuarioId);
                    for (String  usuario :ListaUsuario2 ) {
                        System.out.println(usuario);
                    }     
                    System.out.println("Usuario Listado");
                    
                break;
                case 5:
                    System.out.println("______Lista Usuarios______");
                    System.out.println(" ");
                    List<String> ListaUsuario = new ArrayList<>();
                    ListaUsuario=usuariodad.obtenerUsuario();
                    for (String  usuario :ListaUsuario ) {
                        System.out.println(usuario);
                    }     
                    System.out.println("Usuario Listado");
                    
                break;
            
            }
        
        
        
        
        }
    
    
    
    
    
    
    }
    
    
    
    
}
