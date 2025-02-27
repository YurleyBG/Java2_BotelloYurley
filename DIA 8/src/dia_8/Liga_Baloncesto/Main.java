
package dia_8.Liga_Baloncesto;

import java.util.*;
public class Main {
    
    public void menu(){
        System.out.println("________MENU________");
        System.out.println("1. Registrar partido");
        System.out.println("2. Finalizar Partido");
        System.out.println("3. Ver registros de partidos");
        System.out.println("4. Salir");
         System.out.println("------------------");
        
    }
    
    public static void main(String[] args) {
        ArrayList<Partido>Registros=new ArrayList<>();
        Registros.add(new Partido_Liga(1,"los angeles lakers","golden state warriors",false,"27-02-2025"));
        Registros.add(new Partido_PlayOff("Cuartos","chicago bulls","boston celtics",false,"27-02-2025"));
        
        Scanner scan= new Scanner(System.in);
        Main m =new Main();
        boolean bool =true;
        while(bool){
             m.menu();
            System.out.println("Ingrese una opcion: ");
            int opc=scan.nextInt();

            switch(opc){

                case 1:
                    System.out.println("----- REGISTRAE PARTIDO ---");
                    System.out.println("");
                    System.out.println("agregar a clase 1. Partido liga  2.Partido PlayOff  3.Regresar");
                    int opci = scan.nextInt();
                    if(opci==1){
                        scan.nextLine();
                        System.out.println("Ingrese la Jornada del partido:");
                        int Jornada=scan.nextInt();
                        System.out.println("Ingrese el nombre del equipo local:");
                        scan.nextLine();
                        String Nombre_EL=scan.nextLine();
                        System.out.println("Ingrese el nombre del equipo visitante:");
                        String Nombre_EV=scan.nextLine();
                        System.out.println("Ingrese la fecha del partido:");
                        String fecha_p=scan.nextLine();
                        
                        boolean terminado=false;
                        
                        Partido_Liga agregar_PL=new Partido_Liga(Jornada,Nombre_EL,Nombre_EV,terminado,fecha_p);
                        Registros.add(agregar_PL);
                        
                    }
                    else if(opci==2){
                         scan.nextLine();
                        System.out.println("Ingrese la ronda del partido:");
                        String ronda=scan.nextLine();
                        System.out.println("Ingrese el nombre del equipo local:");
                        String Nombre_EL=scan.nextLine();
                        System.out.println("Ingrese el nombre del equipo visitante:");
                        String Nombre_EV=scan.nextLine();
                        System.out.println("Ingrese la fecha del partido:");
                        String fecha_p=scan.nextLine();
                        
                        boolean terminado=false;
                        
                        Partido_PlayOff agregar_PPO=new Partido_PlayOff(ronda,Nombre_EL,Nombre_EV,terminado,fecha_p);
                        Registros.add(agregar_PPO);
                    
                    
                    }
                    else if(opci==3){
                        System.out.println("Regresando...");
                        bool=true;
                        
                    
                    }
                    else{
                    
                        System.out.println("la opcion ingresada no es valida.");
                    
                    }

                break;
                case 2:
                    
                    System.out.println("----- FINALIZAR PARTIDO ------");
                    System.out.println("");
                    System.out.println("Ingrese el nombre del equipo local:");
                    scan.nextLine();
                    String EL=scan.nextLine();
                    System.out.println("Ingrese el nombre del equipo visitante:");
                    String EV=scan.nextLine();
                    boolean partidoEncontrado = false;
                    for(Partido i : Registros ){
                        
                        if(i.getEquipo_local().equalsIgnoreCase(EL)&& i.getEquipo_visitante().equalsIgnoreCase(EV)){
                            partidoEncontrado = true;
                            System.out.println("ingrese los puntos del equipo "+i.getEquipo_local());
                            int cestasEL=scan.nextInt();
                            System.out.println("Ingrese los puntos del equipo "+ i.getEquipo_visitante());
                            scan.nextLine();
                            int cestasEV=scan.nextInt();
                            
                            //actualizar cesta de cada equipo
                            i.setCestas_equipo_local(cestasEL);
                            i.setCestas_equipo_visitante(cestasEV);
                            
                            
                            // Ver el resultado del partido
                            i.Resultados_mostrar();
                            
                            //Muestra el ganador del partido
                            i.ganador_partido();
                        
                        }
                 
                    }
                    if(partidoEncontrado!=true){
                        System.out.println("No hay partido con esos registros.");
                    
                    }
                   
                    
                break; 
                case 3:
                    System.out.println("----- VER REGISTROS PARTIDO ------");
                    System.out.println("");
                    System.out.println("__Opciones__");
                    System.out.println("1.Ver Resultados de partidos finalizados ");
                    System.out.println("2.Ver todo los partidos");
                    System.out.println("3. Regresar");
                    
                    System.out.println("");
                    System.out.println("Ingrese la opcion:");
                    int opcio=scan.nextInt();
                    if(opcio==1){
                        boolean booli =false;
                        for(Partido i : Registros ){
                            if(i.getFinalizado()==true){
                                booli=true;
                                i.Resultados_mostrar();//ver los resultados de los grupos que ya finalizaron
                            }
                        }
                        if(booli!=true){
                            System.out.println("No hay Partidos finalizados");
                        }
                        
                    }
                    else if(opcio==2){
                    
                        for(Partido i : Registros ){
                            System.out.println("");
                            i.Mostrar();// ver todo los grupos

                        }
                    
                    }
                    else if(opcio==3){
                        System.out.println("Regresando...");
                        bool=true;
                        
                    
                    }
                    else{
                    
                        System.out.println("Esta opcion no existe.");
                    }
                    
                break;
                case 4:
                    System.out.println("Haz abandonado el programa. Adios :)");
                    bool=false;
                break;
        
        
            }
        
        }
       
        
    }
  
}
