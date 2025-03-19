
package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioCrud;
import Vista.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
        

public class CtrlUsuario implements ActionListener {
    private final Usuario modelo;
    private final UsuarioCrud consultas;
    private final vista JframeVista ;
    
    public CtrlUsuario(Usuario modelo,UsuarioCrud consultas,vista JframeVista) {
        this.consultas = consultas;
        this.modelo = modelo;
        this.JframeVista = JframeVista;
        this.JframeVista.btnAgregar.addActionListener(this);
        this.JframeVista.btnActualizar.addActionListener(this);
        this.JframeVista.btnEliminar.addActionListener(this);
        this.JframeVista.btnLimpiar.addActionListener(this);
        this.JframeVista.btnBuscar.addActionListener(this);
        this.JframeVista.botonBuscarID.addActionListener(this);
    }
    public void iniciar() {
        JframeVista.setTitle("Usuarios");
        JframeVista.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == JframeVista.btnAgregar) {
            modelo.setNombre(JframeVista.TextNombre.getText());
            modelo.setEmail(JframeVista.TextEmail.getText());
            String datos=consultas.insertUsuario(modelo.getNombre(),modelo.getEmail());

            if (datos.equalsIgnoreCase("agregado")) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } 
            else if (datos.equalsIgnoreCase("fallo")){
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
           
        }

        if (e.getSource() == JframeVista.btnActualizar) {
            
            modelo.setNombre(JframeVista.TextNombre.getText());
            modelo.setEmail(JframeVista.TextEmail.getText());
            modelo.setId(Integer.parseInt (JframeVista.TextId.getText()));
            
           int idecita =modelo.getId();
           String name= modelo.getNombre();
           String email =modelo.getEmail();
       
           String datos1=consultas.actualizarUsuario(idecita, name, email);
            if (datos1.equalsIgnoreCase("agregado")) {
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                limpiar();
            } 
            else if (datos1.equalsIgnoreCase("fallo")){
                JOptionPane.showMessageDialog(null, "Error al Actualizar");
                limpiar();
            }
           
            
        }

        if (e.getSource() == JframeVista.btnEliminar) {
          
            modelo.setId(Integer.parseInt (JframeVista.TextId.getText()));
            
            int idecita =modelo.getId();
            String resultado=consultas.EliminarUsuarioID(idecita);
            String datos1=resultado;
            if (datos1.equalsIgnoreCase("agregado")) {
                JOptionPane.showMessageDialog(null, "Accion ejecutada");
                limpiar();
            } 
            else if (datos1.equalsIgnoreCase("fallo")){
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                limpiar();
            }
            
            
           
        }

        if (e.getSource() == JframeVista.btnBuscar) {
            JframeVista.TextoArea1.setText("");
            List<String> result=consultas.obtenerUsuario();
            if (result.isEmpty()) {
                JOptionPane.showMessageDialog(null, "usuario no encontrado");
                limpiar();
            } 
            else {
                for(String usuarios : result){
                    JframeVista.TextoArea1.append(usuarios + "\n");
               
                }
                limpiar();
                
           }
            
        }
        if (e.getSource() == JframeVista.botonBuscarID) {
            
            modelo.setId(Integer.parseInt(JframeVista.TextId.getText()));
            try {
                if(consultas.obtenerUsuarioID(modelo)){
                    JframeVista.TextoArea1.setText(modelo.getNombre());
                    JframeVista.TextoArea1.setText(modelo.getEmail());
                }
                else{
                    JOptionPane.showMessageDialog(null, "usuario no encontrado");
                    limpiar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CtrlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

        if (e.getSource() == JframeVista.btnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        JframeVista.TextId.setText(" ");
        JframeVista.TextNombre.setText(" ");
        JframeVista.TextEmail.setText(" ");
        

    }

   
    
}
