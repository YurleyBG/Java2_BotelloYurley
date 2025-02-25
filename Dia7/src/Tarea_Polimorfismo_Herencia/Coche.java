
package Tarea_Polimorfismo_Herencia;


class Coche extends Vehiculos{
    protected String motor;
    protected int cilindraje;
    protected String Color ;
    protected int Potencia;

    public Coche() {
    }

    public Coche(String motor, int cilindraje, String Color, int Potencia, String marca, String modelo) {
        super(marca, modelo);
        this.motor = motor;
        this.cilindraje = cilindraje;
        this.Color = Color;
        this.Potencia = Potencia;
    }

    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

    public String getMotor() {
        return motor;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public String getColor() {
        return Color;
    }

    public int getPotencia() {
        return Potencia;
    }

   

    
    @Override
    public void mostrarDetalles() {
        
        System.out.println("El coche correspode a la marca "+getMarca()+ " modelo "+ getModelo());
        System.out.println("cuenta con las siguienres caracteristicas");
        System.out.println("Motor: "+getMotor());
        System.out.println("Cilindraje: "+ getCilindraje());
        System.out.println("Color: "+ getColor());
        System.out.println("Potencia: "+ getPotencia());
    }
   
    
    
    
}
