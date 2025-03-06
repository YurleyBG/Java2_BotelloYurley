
package Dia12;

interface IOad_Lectura {
    
    Object[] GetAll();
    Object GetById(Object id);
}

interface  IOad_Modificacion{
    void Insert(Object entity);
    void Update(Object id, Object entity);
    void Delete(Object id);

}

public class solutioEjercicio_5 {
    
    // violaba el principio de principio de segregacion de interfaz ya que FacturaOadDatosReadOnly
    // debia utilizar todos lo metodo que tenia la interfaz Ioad Aunque no fuera necesarios.
    
    static class FacturaOadDatosReadOnly implements IOad_Lectura {

        public Object[] GetAll() {
            // Obtener todas las facturas
            return null;

        }
        public Object GetById(Object id) {
             // Obtener factura por ID
             return null;
        }
    }
    
}
