
package Dia12;


public class solutionEjercicio_2 {
    
    // violaba el principio de responsabilidad unica
    // ya que dentro de transferenciaRealizada realizba dos acciones la de si traferencia es importante
    // y la de enviar correo.

    public void transferenciaRealizada(Transferencia transferencia) {
        if (esTransferenciaImportante(transferencia)) {
            String auditor = obtenerDireccionMailAuditor();
            String mensaje = componerMensajeAviso(transferencia);
            enviarCorreo(auditor, mensaje);
        }
    }

    private boolean esTransferenciaImportante(Transferencia transferencia) {
        return transferencia.getImporte() > 50000;
    }

    private String obtenerDireccionMailAuditor() {
        return "mail-auditor";
    }

    private String componerMensajeAviso(Transferencia transferencia) {
        return "aviso-transferencia-importante";
    }

    private void enviarCorreo(String destinatario, String mensaje) {
        ConexionMail conexionMail = null;
        try {
            conexionMail = ConexionMail.getInstance();
            conexionMail.enviar(new Mail().to(destinatario).withBody(mensaje));
        } finally {
            if (conexionMail != null) {
                conexionMail.cerrar();
            }
        }
    }

    static class ConexionMail {
        private static ConexionMail instance = null;

        private ConexionMail() {}

        public static ConexionMail getInstance() {
            if (instance == null) {
                instance = new ConexionMail();
            }
            return instance;
        }

        public void enviar(Mail mail) {
            System.out.println("Enviando correo a: " + mail.getTo() + " con mensaje: " + mail.getBody());
        }

        public void cerrar() {
            System.out.println("Conexión de correo cerrada.");
        }
    }

    static class Mail {
        private String to;
        private String body;

        public Mail to(String to) {
            this.to = to;
            return this;
        }

        public Mail withBody(String body) {
            this.body = body;
            return this;
        }

        public String getTo() {
            return to;
        }

        public String getBody() {
            return body;
        }
    }

    static class Transferencia {
        private double importe;

        public Transferencia(double importe) {
            this.importe = importe;
        }

        public double getImporte() {
            return importe;
        }
    }
    public static void main(String[] args) {
        solutionEjercicio_2 auditor = new solutionEjercicio_2();
        Transferencia transferencia1 = new Transferencia(80000);
        Transferencia transferencia2 = new Transferencia(40000);

        auditor.transferenciaRealizada(transferencia1);
        auditor.transferenciaRealizada(transferencia2);
    }
    
}
