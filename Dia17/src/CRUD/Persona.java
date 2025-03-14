
package CRUD;


public class Persona {
    private int id ;
    private String Nombre;
    private int edad;

    public Persona(int id, String Nombre, int edad) {
        this.id = id;
        this.Nombre = Nombre;
        this.edad = edad;
    }
    public int getId(){ return id;}
    public String getNombre(){ return Nombre;}
    public int getEdad(){ return edad;}
    
    
    public void setNombre(String Nombre){this.Nombre=Nombre;}
    public void setEdad(int edad){this.edad=edad;}
    
    
    
    @Override 
    public String toString(){
    
        return " P, " + id + ""+ Nombre +" "+ edad;
    }
    
    public static Persona  fromString(String data){
        String [] parts = data.split(",");
        return new Persona(Integer.parseInt(parts[1]),parts[2],Integer.parseInt(parts[3]));
    
    }
    
}
