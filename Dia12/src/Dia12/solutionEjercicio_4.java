
package Dia12;

import java.util.ArrayList;
import java.util.List;

public class solutionEjercicio_4 {
    // violaba el principio de responsabilidad unica ya que procesar orden se encargaba de varias acciones , procesar ,grabar y notificar
    static class NotificarPorMail {

	private static NotificarPorMail instance;

	private NotificarPorMail() {
	}

	public static NotificarPorMail getInstance() {
		if (instance == null) {
                    instance = new NotificarPorMail();
		}
		return instance;
	}

	public List<Orden> ordenes = new ArrayList<Orden>();

	public void enviarMensajeDeConfirmacion(Orden orden) {
		ordenes.add(orden);
	}

    }
    static class ProcesadorDeOrdenes {

	public Orden procesar(Orden orden) {
            return orden;
	}
    }
    static class grabarOrder{
        private Repositorio repositorio;

        public grabarOrder(Repositorio repositorio) {
            this.repositorio = repositorio;
        }
        
        public boolean grabar(Orden orden) { 
            if (orden.Isvalid() && repositorio.grabar(orden)) {
                return true;
            }
            return false;
	}
    }
    static class notificacion{
            
        public void notificar (Orden orden){
            NotificarPorMail.getInstance().enviarMensajeDeConfirmacion(orden);
        }
    }
    static class Orden {

	public boolean Isvalid() {
            return true;
	}

    }
    static class Repositorio {

	public boolean grabar(Orden orden) {
            return true;
	}

    }
    
}
