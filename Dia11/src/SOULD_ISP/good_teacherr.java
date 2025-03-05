
package SOULD_ISP;


public class good_teacherr {
    
    // Ejercicio profesor
    
    interface Workable {
        void work();
    }

    interface eatable {
        void eat();
    }
    
    class human implements Workable, eatable {
        public void work() {
            System.out.println("trabajando");
        }

        public void eat() {
            System.out.println("comiendo");
        }
    }

    class robot implements Workable {
        public void work() {
            System.out.println("Trabajando");
        }
    }
    
}
