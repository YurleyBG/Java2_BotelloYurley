
package Archivo_objeto;


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
    
        return id + ""+ Nombre +" "+ edad;
    }
    
    public static Persona  fromString(String data){
        String [] parts = data.split(",");
        return new Persona(Integer.parseInt(parts[0]),parts[1],Integer.parseInt(parts[2]));
    
    }
}
