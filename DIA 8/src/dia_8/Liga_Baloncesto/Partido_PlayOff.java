
package dia_8.Liga_Baloncesto;


public class Partido_PlayOff extends Partido {

    
    protected String ganador;
    protected String ronda;
    
    public Partido_PlayOff(){};

    public Partido_PlayOff(String ronda, String equipo_local, String equipo_visitante, boolean Finalizado, String Fecha_partido) {
        super(equipo_local, equipo_visitante, Finalizado, Fecha_partido);
        this.ronda = ronda;
    }


    public String getGanador() {
        return ganador;
    }

    public String getRonda() {
        return ronda;
    }
    
    
    @Override
    public void ganador_partido() {
        
        if(getCestas_equipo_local()>getCestas_equipo_visitante()){
            setFinalizado(true);
            this.ganador=getEquipo_local();
            System.out.println("El equipo "+ getGanador()+"es el ganador");
        }
        else if(getCestas_equipo_local()==getCestas_equipo_visitante()){
            this.ganador=getEquipo_visitante();
            System.out.println("Es un empate, el partido continuara.");
        }
        else {
            setFinalizado(true);
            this.ganador=getEquipo_visitante();
            System.out.println("El equipo "+ getGanador()+"es el ganador");   
        }
         
    }
    @Override
    public void Mostrar(){
        
        System.out.println("Liga_Baloncesto");
        System.out.println(" ");
        System.out.println("Ronda: "+ getRonda());
        System.out.println("Equipo local: " + getEquipo_local());
        System.out.println("Equipo Visitante: " + getEquipo_visitante());
        System.out.println("Cestas equipo local: " + getCestas_equipo_local());
        System.out.println("Cestas equipo local: " + getCestas_equipo_visitante());
        System.out.println("Finalizado: " + getFinalizado());
        System.out.println("Fecha: "+ getFecha_partido());
        System.out.println("Ganador: "+ getGanador());
    
    }

 
    
}
