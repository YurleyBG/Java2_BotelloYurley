
package Tarea_Polimorfismo_Herencia;

class Motocicleta extends Vehiculos {
    protected String motor;
    protected int cilindraje;
    protected String Color ;
   

    public Motocicleta() {
    }
    
    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    public Motocicleta(String motor, int cilindraje, String Color, String marca, String modelo) {
        super(marca, modelo);
        this.motor = motor;
        this.cilindraje = cilindraje;
        this.Color = Color;
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


    
    @Override
    public void mostrarDetalles() {
        System.out.println("La motocicleta correspode a la marca "+getMarca()+ " modelo "+ getModelo());
        System.out.println("cuenta con las siguienres caracteristicas");
        System.out.println("Motor: "+getMotor());
        System.out.println("Cilindraje: "+ getCilindraje());
        System.out.println("Color: "+ getColor());
    }
    
    
}
