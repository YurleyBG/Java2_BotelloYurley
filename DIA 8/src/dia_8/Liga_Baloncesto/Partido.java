
package dia_8.Liga_Baloncesto;


public class Partido {
    
    
    private String equipo_local;
    private String equipo_visitante;
    private int cestas_equipo_local=0;
    private int cestas_equipo_visitante=0;
    private boolean Finalizado;
    private String Fecha_partido;

    public Partido() {
    }
    
    public Partido(String equipo_local, String equipo_visitante, boolean Finalizado, String Fecha_partido) {
        this.equipo_local = equipo_local;
        this.equipo_visitante = equipo_visitante;
        this.Finalizado = Finalizado;
        this.Fecha_partido = Fecha_partido;
    }

    public String getEquipo_local() {
        return equipo_local;
    }

    public String getEquipo_visitante() {
        return equipo_visitante;
    }

    public int getCestas_equipo_local() {
        return cestas_equipo_local;
    }

    public int getCestas_equipo_visitante() {
        return cestas_equipo_visitante;
    }

    public boolean getFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(boolean Finalizado) {
        this.Finalizado = Finalizado;
    }

    public String getFecha_partido() {
        return Fecha_partido;
    }

    public void setCestas_equipo_local(int cestasEL) {
        this.cestas_equipo_local = cestasEL;
    }

    public void setCestas_equipo_visitante(int cestasEV) {
        this.cestas_equipo_visitante = cestasEV;
    }
    
    


    
    
    public void ganador_partido(){
    
        if(getCestas_equipo_local()>getCestas_equipo_visitante()){
            
            System.out.println("El equipo local es el ganador");
        }
        else {
        
            System.out.println("El equipo Visitante es el ganador");
        }
    
    }
    public void Resultados_mostrar(){
        System.out.println("------------- RESULTADOS ------------");
        System.out.println(getEquipo_local() +" VS "+getEquipo_visitante());
        System.out.println(getCestas_equipo_local()+"                      "+getCestas_equipo_visitante());
        System.out.println("-------------------------------------");
    
    }
    
    public void Mostrar(){
        
        System.out.println("Liga_Baloncesto");
        System.out.println("Equipo local: " + getEquipo_local());
        System.out.println("Equipo Visitante: " + getEquipo_visitante());
        System.out.println("Cestas equipo local: " + getCestas_equipo_local());
        System.out.println("Cestas equipo local: " + getCestas_equipo_visitante());
        System.out.println("Finalizado: " + getFinalizado());
        System.out.println("Fecha: "+ getFecha_partido());
    
    }

   
    
    
}
