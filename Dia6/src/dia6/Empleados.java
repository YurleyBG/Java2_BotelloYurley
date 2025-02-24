
package dia6;


public class Empleados {
    private String nombre;
    private int id;
    private double saldo;

    public Empleados(){}
    
    public Empleados(String nombre, int id, double saldo) {
        this.nombre = nombre;
        this.id = id;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        
        if(saldo>0){
             this.saldo = saldo;
        }
        else{
            System.out.println("el saldo no debe ser negativo");
        
        }
       
    }
    public void mostrarInformacion(){
        System.out.println("id: "+ id );
        System.out.println("nombre: "+ nombre);
        System.out.println("saldo:"+ saldo);
    
    }
    
}
