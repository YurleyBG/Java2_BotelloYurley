
package dia6;


public class Producto {
    
    
     private String codigo;
    private String nombre;
    private int Cantidad;
    private double precio;

    public Producto(){};
    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        if(cantidad>0){
            this.Cantidad = cantidad;
        }
        else{
            System.out.println("la cantidad no puede ser negativa");
        }
    }

    public double getPrecio() {
        
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio>0){
            this.precio = precio;
        }
        else{
            System.out.println("el precio no puede ser menor a 0");
        
        }
        
    }
    
    public void actualizarStoc(int cantidad){
        
        if(cantidad>0){
            Cantidad=Cantidad+cantidad;
        }
        else{
            Cantidad+=cantidad;
        }
    
    }
    
    
}
