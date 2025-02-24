/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6;


public class classdia6 {
    //Atributo
    private String nombre;
    private int edad;
    
    //constructor
    public classdia6(){};
    
    public classdia6(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre + " Tibu";
    }

    public void setEdad(int edad) {
        if(edad>0){
            this.edad = edad;
        }else {
            System.out.println("la edad no es validad.la eda debe ser mayor a 0");
        
        }
    }
    
    
}
