/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dia7_Clase;

class Perro extends Animal {
    //Atributos
    private String raza;
    private int edad;
    private String sexo;

    public Perro() {
    }
    
    public Perro(String nombre_cientifico) {
        super(nombre_cientifico);
    }

    public Perro(String raza, int edad, String sexo) {
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Perro(String raza, int edad, String sexo, String nombre_cientifico, String especie, String habita, boolean tienePelo, int cantPata) {
        super(nombre_cientifico, especie, habita, tienePelo, cantPata);
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    @Override
    public void HacerSonido() {
       
        System.out.println("el perro "+nombre_cientifico+" dice !guauuuuuu!");
    }
    
    public void MoverCola() {
       
        System.out.println("el perro "+nombre_cientifico+" mueve la cola");
    }
    
}