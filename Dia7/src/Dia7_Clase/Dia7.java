
package Dia7_Clase;


public class Dia7 {

   
    public static void main(String[] args) {
        // herencia 

        // es un mecanismo que permite craer nuevos clases a partir de clases existentes .
        // la clase  que se hereda se denomina superclase o clase base donde la nueva clase se conoce
        // como subclase  o clase derivada

        // caracteristicas

        // 1. reutilizacion de codigo las¿ subcase heredan atributos y metodos
        // de la superclase , evitando asi lo duplicacion de codigo

        //2. jerarquia de codigo : permita organizacion y estructura el codigo en una jerarquia logica

        //3. se puede agregar o modificar funcionabilidad en la subclase sin afectar
        // la superclase

        // polimorfismo

        // el polimorfismo permite que un objecto se comporte de diferente manera 
        //segun el contexto . en java esta se traduce en eue una variable 
        //de un tippo de referencia (por ejemplo,
        //la superclase)pueda referenciar objetos d cualquier superclase.


        Perro perro1=new Perro("lucas");
        perro1.HacerSonido();
        perro1.MoverCola();

        // aunque la variable de tipo "Animal" , se invoca el metodo sobreescrito en perro
        Animal MiAnimal=new Perro("firulais");
        MiAnimal.HacerSonido();

        // para acceder a metodos de perro hay que hacer un casting
        if(MiAnimal instanceof Perro){

            Perro miperro=(Perro)MiAnimal;
            miperro.MoverCola();

        }       
    }
    
    
}
