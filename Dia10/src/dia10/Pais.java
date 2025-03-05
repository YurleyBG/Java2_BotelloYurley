
package dia10;


public enum Pais {
   
    // enumeradores 
    // u enumerador es una clase especial que restrige la creacion de objectos
    // definidos en su implementacion
    
    ESPAÑA("españa","madrid"),
    FRANCIA("francia","paris"),
    ITALIA("italia","roma"),
    ALEMANIA("alemania","berlin"),
    REINO_UNIDO("reino unido","lodres");
    
    private String nombre;
    private String capital;

    private Pais(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    
    
    
   
    
}
