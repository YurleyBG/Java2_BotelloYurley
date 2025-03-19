
package Modelo;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;


public class UsuarioDAD {
      //jdbc:mysql://host:puerto/basededatos
    private String url="jdbc:mysql://bngmrpw0qth6vmcgckz1-mysql.services.clever-cloud.com:3306/bngmrpw0qth6vmcgckz1";
    private String usuario="ugmucovf3k3vozgk";
    private String password="uwcgRHABIvraHnEXvbB8";
    
    private Connection conectar() throws SQLException{
        return DriverManager.getConnection(url, usuario, password);
    
    
    }
    // crear (Insert)
    public void insertUsuario(usuario user){
        String sql =" insert into usuarios(nombre,email) values(?,?)";
        try{
            Connection conexionInterna=conectar();
            PreparedStatement solicitud =conexionInterna.prepareStatement(sql);
            solicitud.setString(1, user.getNombre());
            solicitud.setString(2, user.getEmail());
            solicitud.executeUpdate();
            System.out.println("usuario ingreasado de manera exitosa");
        
        }catch(SQLException e){
        
            e.printStackTrace();
        }
    }
    //leer (SELECT)
    //select * from ususarios;
    public List<String> obtenerUsuario(){
        String sql =" select * from usuarios";
        List<String> ListaUsuario = new ArrayList<>();
        try{
            Connection conexionInterna=conectar();
            PreparedStatement solicitud =conexionInterna.prepareStatement(sql);
            ResultSet resultado = solicitud.executeQuery();
            while(resultado.next()){
                ListaUsuario.add(resultado.getInt("id")
                        + " - "+ resultado.getString("nombre")+ " - " 
                                +resultado.getString("email"));
            }
            
        }catch(SQLException e){
        
            e.printStackTrace();
        }
        return ListaUsuario;
       
    }
    //Actualizar(update
    public void actualizarUsuario(usuario user){
        String sql =" update usuarios set nombre=?,email=? where id=?";
        try{
            Connection conexionInterna=conectar();
            PreparedStatement solicitud =conexionInterna.prepareStatement(sql);
            solicitud.setString(1, user.getNombre());
            solicitud.setString(2, user.getEmail());
            solicitud.setInt(3, user.getId());
            int filas=solicitud.executeUpdate();
            if(filas>0){
                 System.out.println("usuario actualizado correctamente");
            }else{
            
                System.out.println("no se puede actualizar el usuario con la id "+user.getId() );
            
            }
           
        
        }catch(SQLException e){
        
            e.printStackTrace();
        }
    
    }
    // eliminar (Delete)
    public List<String> EliminarUsuarioID( usuario user ){
        String sql =" delete from usuarios where id=?";
        List<String> ListaUsuario = new ArrayList<>();
        try{
            Connection conexionInterna=conectar();
            PreparedStatement solicitud =conexionInterna.prepareStatement(sql);
            solicitud.setInt(1,user.getId());
            int filasEliminada=solicitud.executeUpdate();
            
            
        }catch(SQLException e){
        
            e.printStackTrace();
        }
        return ListaUsuario;
       
    }
    
    
    
    //leer por id (SELECT)
    //select * from ususarios;
    public List<String> obtenerUsuarioID( usuario user ){
            String sql =" select * from usuarios where id=?";
            List<String> ListaUsuario = new ArrayList<>();
            try{
                Connection conexionInterna=conectar();
                PreparedStatement solicitud =conexionInterna.prepareStatement(sql);
                solicitud.setInt(1,user.getId());
                ResultSet ver=solicitud.executeQuery();
                while(ver.next()){
                    ListaUsuario.add(ver.getInt("id")
                            + " - "+ ver.getString("nombre")+ " - " 
                                    +ver.getString("email"));
                }

            }catch(SQLException e){

                e.printStackTrace();
            }
            return ListaUsuario;

        }

  
    
    
}
