
package Dia7_Clase;


public class Animal {

    
    
    // Atributos
    protected String nombre_cientifico;
    protected String especie;
    protected String habita;
    protected boolean tienePelo;
    protected int cantPata;

    
    // constructores vacios y compuestos
    public Animal(){}
    
    public Animal(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }
    public Animal(String nombre_cientifico, String especie, String habita, boolean tienePelo, int cantPata) {
        this.nombre_cientifico = nombre_cientifico;
        this.especie = especie;
        this.habita = habita;
        this.tienePelo = tienePelo;
        this.cantPata = cantPata;
    }
    //metodo para todos los animales
    public void HacerSonido(){
    
        System.out.println("el animalito hace un sonido");
    
    
    }
}