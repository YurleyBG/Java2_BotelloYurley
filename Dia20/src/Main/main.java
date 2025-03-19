
package Main;
import Controlador.CtrlUsuario;
import Modelo.UsuarioDAD;
import Vista.usuarioVista;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        UsuarioDAD usuarioDAD = new UsuarioDAD();
        usuarioVista vista =new usuarioVista();
        CtrlUsuario controladorU= new CtrlUsuario(usuarioDAD,vista);
        
        controladorU.iniciar();
        
    }
    
}
