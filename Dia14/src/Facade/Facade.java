
package Facade;


public class Facade {
    static class amplificar {
        void on(){
            System.out.println("Amplificador encendido");
         
        }
    }
    static class DVDplayer {
        void play(){
            System.out.println("Reproduciendo DVD");
         
        }
    }
    static class HomeTheaterFacade{
        private amplificar amp;
        private DVDplayer dvd;
        
        public HomeTheaterFacade(){
            this.amp=new amplificar();
            this.dvd=new DVDplayer();
        
        }
        public void watchMovie(){
        
            amp.on();
            dvd.play();
        }
        
    }
    public static void main(String[] args) {
        HomeTheaterFacade hometheater = new HomeTheaterFacade();
        hometheater.watchMovie();
        
    }
    
}
