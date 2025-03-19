
package CrudUsuario;
import Controlador.CtrlUsuario;
import Modelo.Usuario;
import Modelo.UsuarioCrud;
import Vista.vista;

public class main {
    public static void main(String[] args) {
        Usuario usua = new Usuario();
        UsuarioCrud usuaCrud = new UsuarioCrud();
        vista frm = new vista();

        CtrlUsuario ctrl = new CtrlUsuario(usua, usuaCrud, frm);
        ctrl.iniciar();
        frm.setVisible(true);
    }
}
