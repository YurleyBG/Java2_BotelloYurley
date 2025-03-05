package SOULD_DIP;

public class SOULD_DIP {
    // creacion de la interfaz  y declaracion de un metodo abstracto
    interface Mensaje {
        void enviar(String mensajito, String destinatario); 
    }

    //  se crean las clases que implementan la interfaz anterior
    static class Email implements Mensaje {
        @Override
        public void enviar(String mensajito, String destinatario) {
            System.out.println("Enviando email a " + destinatario + ": " + mensajito);
        }
    }

    
    static class Sms implements Mensaje {
        @Override
        public void enviar(String mensajito, String destinatario) {
            System.out.println("Enviando SMS a " + destinatario + ": " + mensajito);
        }
    }
    // A traves de notificador se muestran las clase que implemantaron la interfaz mensaje, 
    //porque este no identifica como tal la clase si no que tienen el metodo enviar
    
    static class Notificador {
        private Mensaje formaNoti;

        public Notificador(Mensaje formaNoti) {
            this.formaNoti = formaNoti;
        }

        public void notificarUsuario(String mensajito, String destinatario) {
            formaNoti.enviar(mensajito, destinatario);
        }
    }

    public static void main(String[] args) {
       
        Mensaje email= new Email();
        Notificador notiEmail = new Notificador(email);
        notiEmail.notificarUsuario("Holiiiiiiiii", "yuliB0gmail.com");

        Mensaje sms = new Sms();
        Notificador notiSms = new Notificador(sms);
        notiSms.notificarUsuario("Holiiiiiiii", "+573045673290");
    }
}