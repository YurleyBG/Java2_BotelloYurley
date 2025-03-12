
package dia16;

import dia16.hilos.pingpong;

public class Dia16 {

   // ejemplo pingpong
    public static void main(String[] args) {
        Thread t1 = new pingpong("p");
        Thread t2 = new pingpong("s");
        t1.start();
        t2.start();
    }
    
}
