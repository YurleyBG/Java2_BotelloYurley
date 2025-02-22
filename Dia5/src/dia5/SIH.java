
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
import java.util.*;

public class SIH {
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
        
        
        
        
    }
}
