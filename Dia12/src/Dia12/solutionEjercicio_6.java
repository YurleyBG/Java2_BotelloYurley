
package Dia12;

interface IMailSender{

    void Enviar(solutionEjercicio_6 contacto , String Mensaje);
}

public class solutionEjercicio_6 {
    //solutionEjercicio_6 == Contacto.
    public String Nombre;
    public String CuentaBancaria;
    public String Email;

    public solutionEjercicio_6(String Nombre, String CuentaBancaria, String Email) {
        this.Nombre = Nombre;
        this.CuentaBancaria = CuentaBancaria;
        this.Email = Email;
    }

    @Override
    public String toString() {
         return "Nombre: "+ Nombre +" Email: "+ Email;
    }
    

    static class mensaje implements IMailSender{
        @Override
        public void Enviar(solutionEjercicio_6 contacto, String Mensaje) {
            System.out.println("enviar a "+ contacto+ Mensaje);
            
        }
    
    }
    static class enviar{
        private IMailSender enviandoMensaje;
        
        public enviar(IMailSender enviandoMensaje){
            this.enviandoMensaje=enviandoMensaje; 
        
        }
        public void enviandoMensaje(solutionEjercicio_6 contacto,String Mensaje){
            enviandoMensaje.Enviar(contacto, Mensaje);
        
        }
        
        
    
    
    
    }
    
    
}

