
package hilos;

class interruptorexception {
    public static void main(String[] args) {
        Explicacion_2 counter1 = new Explicacion_2();
        Explicacion_2 counter2 = new Explicacion_2(); 


        counter1.start();
        counter2.start();
        
        
        System.out.println("valor del contador final 1: " +counter1.value());
        System.out.println("valor del contador final 2: " +counter2.value());
    }
    
   
}
