
package hilos.explicacion_3;


public class main {
    public static void main(String[] args) {
        PinPongsincronizado p1= new PinPongsincronizado("h");
        PinPongsincronizado p2= new PinPongsincronizado("o");
        PinPongsincronizado p3= new PinPongsincronizado("l");
        PinPongsincronizado p4= new PinPongsincronizado("a");
        p1.start();
        p2.start(); 
        p3.start();
        p4.start();  
    }
   
    
}
