<<<<<<< HEAD

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
=======

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
>>>>>>> 2e2f20ddd12d643119649c0b8951c135bd35468a
