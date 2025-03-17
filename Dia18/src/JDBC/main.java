
package JDBC;

import JDBC.usuarioDAD;
import java.util.List;
public class main {

    public static void main(String[] args) {
        usuarioDAD USUARIOdad = new usuarioDAD();
        //USUARIOdad.insertUsuario("pedro", "pedroGomezcampuslands@gmail.com");
       //USUARIOdad.insertUsuario("valentina", "velntinacampuslands@gmail.com");
        //USUARIOdad.insertUsuario("zully", "zulyampuslands@gmail.com");
        List<String> ListaUsuario =USUARIOdad.obtenerUsuario();
        for (String  usuario :ListaUsuario ) {
           
            System.out.println(usuario);
        }
        
        USUARIOdad.actualizarUsuario(3,"jaime","jaime@campuslands.com");
        ListaUsuario=USUARIOdad.obtenerUsuario();
        System.out.println("#################");
        for (String  usuario :ListaUsuario ) {
           
            System.out.println(usuario);
        }
    }
    
}
