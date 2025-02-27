
package dia5;
import dia5.ClassSIH.Hospita_personal;
import dia5.ClassSIH.diagnosticos;
import dia5.ClassSIH.Paciente;
import dia5.ClassSIH.departamento;
import dia5.ClassSIH.departamento_Personal;
import dia5.ClassSIH.equipo;
import dia5.ClassSIH.hospital;
import dia5.ClassSIH.pabellon;
import dia5.ClassSIH.pers_equipo_diag;
import dia5.ClassSIH.personal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SIH {
    public static void menu(){
    
        System.out.println("______MENU________");
        System.out.println("1.Registrar");
        System.out.println("2.Eliminar");
        System.out.println("3.Actualizar");
        System.out.println("4.Ver");
        System.out.println("5.Salir");
        System.out.println("__________________");
     
    }
    public static void main(String[] args) {
        ClassSIH sih = new ClassSIH();
        
        
        List<personal> listaPersonal = new ArrayList<>();
        listaPersonal.add(sih.new personal(1, "Juan", "Carlos", "Perez", "Rodriguez", "12345", "Cardiologo", "2023-01-15"));
        listaPersonal.add(sih.new personal(2, "Maria", "", "Lopez", "Garcia", "67890", "medico junior", "2024-02-20"));
        
        System.out.println(listaPersonal);
       
        List<Paciente> listaPacientes = new ArrayList<>();
        listaPacientes.add(sih.new Paciente(1, "Ana", "", "Perez", "Rodriguez", 30, "1993-05-15", "2024-03-08"));
        listaPacientes.add(sih.new Paciente(2, "Luis", "Maria", "Gonzalez", "Diaz", 25, "1998-12-20", "2024-04-12"));
        
        System.out.println(listaPacientes);
        
        List<departamento> listaDepartamentos = new ArrayList<>();
        listaDepartamentos.add(sih.new departamento(1, "Cardiología"));
        listaDepartamentos.add(sih.new departamento(2, "Enfermeria"));
        
        System.out.println(listaDepartamentos);
        
        List<diagnosticos> listaDiagnosticos = new ArrayList<>();
        listaDiagnosticos.add(sih.new diagnosticos(1, 101, 1, 123, "Infarto de miocardio", "2024-03-10", 1));
        listaDiagnosticos.add(sih.new diagnosticos(2, 102, 2, 456, "Accidente cerebrovascular", "2024-03-15", 2));
        
        System.out.println(listaDiagnosticos);
        
        List<pers_equipo_diag> listaPersEquipoDiag = new ArrayList<>();
        listaPersEquipoDiag.add(sih.new pers_equipo_diag(1, 1, 2, 1));

        System.out.println(listaPersEquipoDiag);
        
        List<equipo> listaEquipos = new ArrayList<>();
        listaEquipos.add(sih.new equipo(1, "Electrocardiógrafo", 1, "2024-03-10"));
        listaEquipos.add(sih.new equipo(2, "Resonancia magnética", 2, "2024-03-15"));
        
        System.out.println(listaEquipos);
        
        List<Hospita_personal> listaHospitaPersonal = new ArrayList<>();
        listaHospitaPersonal.add(sih.new Hospita_personal(1, 1, 1));
        listaHospitaPersonal.add(sih.new Hospita_personal(2, 2, 2));
        
        System.out.println(listaHospitaPersonal);
         
        List<departamento_Personal> listaDepartamentoPersonal = new ArrayList<>();
        listaDepartamentoPersonal.add(sih.new departamento_Personal(1, 1, 1, 2000.0, "2024-03-10"));
        listaDepartamentoPersonal.add(sih.new departamento_Personal(2, 2, 2, 2500.0, "2024-03-15"));

        System.out.println(listaDepartamentoPersonal);
        
        List<pabellon> listaPabellones = new ArrayList<>();
        listaPabellones.add(sih.new pabellon(1, "Pabellón A", "Disponible", "Planta baja", 20));
        listaPabellones.add(sih.new pabellon(2, "Pabellón B", "Ocupado", "Planta alta", 15));

        System.out.println(listaPabellones);
        
        List<hospital> listaHospitales = new ArrayList<>();
        listaHospitales.add(sih.new hospital(1, "Hospital Central", "Bogota"));
        listaHospitales.add(sih.new hospital(2, "Hospital Regional", "Cucuta"));

        System.out.println(listaHospitales);
        
        boolean bool=true;
        while(bool){
            Paciente pacienteactu=null;
            Scanner scan=new Scanner(System.in);
            SIH SISINTHOS=new SIH(); 
            
            SISINTHOS.menu();
            System.out.println("Ingrese la opcion que desea:");
            
            int opc=scan.nextInt();
            switch(opc){
                
                case 1:
                    System.out.println("Registrar Paciente");
                    LocalDate fechaActual = LocalDate.now();
                    String date = fechaActual.format(DateTimeFormatter.ISO_DATE);
                    System.out.println("Registrar_Paciente");
                    System.out.println("");
                    System.out.println("ingrese el id");
                    int idpaciente=scan.nextInt();
                    System.out.println("ingrese el nombre1");
                    scan.nextLine();
                    String nom1=scan.nextLine();
                    System.out.println("ingrese el nombre2");
                    String nom2=scan.nextLine();
                    System.out.println("ingrese el apellido1");
                    String ape1=scan.nextLine();
                    System.out.println("ingrese el apellido2");
                    String ape2=scan.nextLine();
                    System.out.println("ingrese la fecha de macimiento");
                    String fNacime=scan.nextLine();
                    String año = "";
                    int añonum = 0;

                    for (int i = fNacime.length() - 4; i < fNacime.length(); i++) {
                        año += fNacime.charAt(i);
                        añonum=Integer.parseInt(año);
                    }
                    int edad1=2025-añonum;
                    Paciente p = sih.new Paciente(idpaciente, nom1, nom2, ape1, ape2, edad1, fNacime, date);
                    listaPacientes.add(p);
                            
                  
                    
                break;
                case 2:
                    
                    System.out.println("Eliminar paciente");
                    System.out.println("Ingresar la id del paciente a eliminar");
                    int iddelete=scan.nextInt();
                    for (int i = listaPacientes.size() - 1; i >= 0; i--) {
                        if (listaPacientes.get(i).id == iddelete) {
                            listaPacientes.remove(i);
                            break; 
                        }
                    }
                break;
                case 3:
                    System.out.println("Ingrese la id del paciente");
                    int id=scan.nextInt();
                    for (Paciente pacientico: listaPacientes) {
                        if (pacientico.id == id) {
                            pacienteactu = pacientico;
                            break;
                        }
                    }
                    System.out.println("Actualizar paciente ");
                    System.out.println("1.nombre1");
                    System.out.println("2.nombre2");
                    System.out.println("3.Regresar");
                    System.out.println("");
                    System.out.println("Ingrese la opcion");
                    int opcactu=scan.nextInt();
                    switch(opcactu){
                        
                        case 1:
                            scan.nextLine();
                            System.out.println("Actualizar Nombre1");
                            System.out.println("Ingrese el nombre nuevo :");
                            String newNombre1 = scan.nextLine();
                            pacienteactu.nombre1 = newNombre1;
                            System.out.println("nombre1 actualizado: ");
                        break;
                        case 2:
                            scan.nextLine();
                            System.out.println("Actualizar Nombre2");
                            System.out.println("Ingrese el nombre nuevo :");
                            String newNombre2 = scan.nextLine();
                            pacienteactu.nombre2 = newNombre2;
                            System.out.println("nombre2 actualizado ");
                             
                        break;
                        case 3:
                            System.out.println("Regresando...");
                            bool=true;
                        break;
                  
                    }
                break;
                case 4:
                    System.out.println("Ver paciente");
                    for(Paciente i : listaPacientes){
                        StringBuilder concatconcer = new StringBuilder();
                        concatconcer.append("----------------------\n")
                        .append("id: ").append(i.id).append("\n")
                        .append("Nombre1: ").append(i.nombre1).append("\n")
                        .append("Nombre2: ").append(i.nombre2).append("\n")
                        .append("Apellido1: ").append(i.apellido1).append("\n")
                        .append("Apellido2: ").append(i.apellido2).append("\n")
                        .append("Edad: ").append(i.edad).append("\n")
                        .append("Fecha_nacimiento: ").append(i.fecha_nacimiento).append("\n")
                        .append("Fecha_ingreso: ").append(i.Fecha_ingreso).append("\n");
                        
                      System.out.println(concatconcer); 
                    
                    }
                    
                break;
                case 5:
                    System.out.println("Has abandonado el programa adios ;)");
                    bool=false;
                break;
            
            
            }
            
        
        }
        
        
    }
}
