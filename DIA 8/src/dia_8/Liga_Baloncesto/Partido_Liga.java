
package dia_8.Liga_Baloncesto;


public class Partido_Liga extends Partido {

   
    protected String ganador;
    protected int jornada;

    public Partido_Liga() {
    }

    public Partido_Liga(int jornada, String equipo_local, String equipo_visitante, boolean Finalizado, String Fecha_partido) {
        super(equipo_local, equipo_visitante, Finalizado, Fecha_partido);
        this.jornada = jornada;
    }

    public int getJornada() {
        return jornada;
    }

   

    public String getGanador() {
        return ganador;
    }
    
    
    @Override
    public void ganador_partido() {
      
        
        if(getCestas_equipo_local()>getCestas_equipo_visitante()){
            setFinalizado(true);
            this.ganador=getEquipo_local();
            System.out.println("EL EQUIPO GANDOR ES  "+ getGanador());
        }
        else if(getCestas_equipo_local()==getCestas_equipo_visitante()){
            setFinalizado(true);
            System.out.println("El juego entre "+getEquipo_local()+" y "+ getEquipo_visitante()+" termino en empate."); 
            
        }
        else {
            setFinalizado(true);
            this.ganador=getEquipo_visitante();
            System.out.println("EL EQUIPO GANDOR ES  "+ getGanador());   
        }
         
    }
    @Override
    public void Mostrar(){
        
        System.out.println("Liga_Baloncesto");
        System.out.println("");
        System.out.println("Jornada: "+ getJornada());
        System.out.println("Equipo local: " + getEquipo_local());
        System.out.println("Equipo Visitante: " + getEquipo_visitante());
        System.out.println("Cestas equipo local: " + getCestas_equipo_local());
        System.out.println("Cestas equipo local: " + getCestas_equipo_visitante());
        System.out.println("Finalizado: " + getFinalizado());
        System.out.println("Fecha: "+ getFecha_partido());
        System.out.println("Ganador: "+ getGanador());
    
    }

   

    
  
}
