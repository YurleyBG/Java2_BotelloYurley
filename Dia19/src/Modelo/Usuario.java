
package Modelo;


public class Usuario {
    private int id;
    private String Nombre;
    private String Email;
    public Usuario(){}
    public Usuario(int id, String Nombre, String Email) {
        this.id = id;
        this.Nombre = Nombre;
        this.Email = Email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
     
     
     
    
}
