
package Modelo;
 //Modelo
 // el modelo representa los datos y la logica de acceso a la BBDD

public class usuario {
    private int id;
    private String Nombre;
    private String Email;
    
    public usuario(){}
    public usuario(int id) {
        this.id = id;
       
    } 
    public usuario(int id, String Nombre, String Email) {
        this.id = id;
        this.Nombre = Nombre;
        this.Email = Email;
    } 
    public usuario(String Nombre, String Email) {
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

    @Override
    public String toString() {
        return "usuario{" + "id=" + id + ", Nombre=" + Nombre + ", Email=" + Email + '}';
    }
    
    
    
}
