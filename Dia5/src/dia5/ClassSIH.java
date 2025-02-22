
package dia5;


public class ClassSIH {
    // class`personal medico
    
    class personal{
        int id;
        String nombre1;
        String nombre2;
        String apellido1 ;
        String apellido2;
        String Pila;
        String Titulo;
        String Fecha_vinculacion;


        public personal(int id ,String Nombre1,String Nombre2, String apellido1, String apellido2,
        String pila, String titulo, String Fecha_v){
            this.id=id;
            this.nombre1=Nombre1;
            this.nombre2=Nombre2;
            this.apellido1=apellido1;
            this.apellido2=apellido2;
            this.Pila=pila;
            this.Titulo=titulo;
            this.Fecha_vinculacion=Fecha_v;
        }
        public personal(int id,String nombre1,String nombre2, String apellido1, String apellido2){
            this.id=id;
            this.nombre1=nombre1;
            this.nombre2=nombre2;
            this.apellido1=apellido1;
            this.apellido2=apellido2;
           
        }
        

        @Override
        public String toString() {
            return "personal{" + "id=" + id + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", Pila=" + Pila + ", Titulo=" + Titulo + ", Fecha_vinculacion=" + Fecha_vinculacion + '}';
        }
    
    
    
    }
    // class pacientes
    class Paciente extends personal{
        int id;
        int edad;
        String fecha_nacimiento;
        String Fecha_ingreso;
        
        public Paciente( int id ,String nombre1,String nombre2, String apellido1, String apellido2, int edad,String fecha_nacimiento, String Fecha_ingreso){
            
            super(id,nombre1,nombre2,apellido1,apellido2);
            this.edad=edad;
            this.fecha_nacimiento= fecha_nacimiento;
            this.Fecha_ingreso=Fecha_ingreso;
        }

        @Override
        public String toString() {
            return "Paciente{" + "edad=" + edad + ", fecha_nacimiento=" + fecha_nacimiento + ", Fecha_ingreso=" + Fecha_ingreso + '}';
        }

        
    }
    
    // class relacion de Hospital y Personal
    class Hospita_personal{
        int id;
        int id_hospital;
        int id_personal;
        
        
        public Hospita_personal(int id , int id_hospital,int id_personal){
            this.id=id;
            this.id_hospital=id_hospital;
            this.id_personal=id_personal;
    
        }

        @Override
        public String toString() {
            return "Hospita_personal{" + "id=" + id + ", id_hospital=" + id_hospital + ", id_personal=" + id_personal + '}';
        }
      
    }
    // class  hospital
    class hospital{
        int id;
        String Nombre;
        String Ubicacion;

        public hospital(int id , String nombre,String Ubicacion){
            this.id=id;
            this.Nombre=nombre;
            this.Ubicacion=Ubicacion;

        }
        @Override
        public String toString() {
            return "ClassSIH{" + "id=" + id + ", Nombre=" + Nombre + ", Ubicacion=" + Ubicacion + '}';
        }
        

    }
    
    // class relacion entre personal y departamento
    class departamento_Personal{
    
        int id ;
        int id_departamento;
        int id_personal;
        double salario;
        String Fecha_vinculacion;
        
        public departamento_Personal(int id, int id_departamento, int id_personal,double salario,String fecha_V) {
        
            this.id=id;
            this.id_departamento=id_departamento;
            this.id_personal=id_personal;
            this.salario=salario;
            this.Fecha_vinculacion=fecha_V;
        
        }

        @Override
        public String toString() {
            return "departamento_Personal{" + "id=" + id + ", id_departamento=" + id_departamento + ", id_personal=" + id_personal + ", salario=" + salario + ", Fecha_vinculacion=" + Fecha_vinculacion + '}';
        }
    
    }
    
    // class departamento
    class departamento{
    
        int id ;
        String departamento;
        
        public departamento(int id,String departamento) {
        
            this.id=id;
            this.departamento=departamento;
          
        }

        @Override
        public String toString() {
            return "departamento{" + "id=" + id + ", departamento=" + departamento + '}';
        }
        
    }
    
    
    // class diagnostico
    class diagnosticos{
    
        int id ;
        int id_paciente;
        int id_personal;
        int codigo_cie10;
        String descripcion;
        String fecha;
        int id_pabellon;
        
        
        public diagnosticos(int id,int id_paciente,int id_personal, int codigo_cie10,String descripcion,String fecha,int id_pabellon) {
        
            this.id=id;
            this.id_paciente=id_paciente;
            this.id_personal=id_personal;
            this.codigo_cie10=codigo_cie10;
            this.descripcion=descripcion;
            this.fecha=fecha;
            this.id_pabellon=id_pabellon;
          
        }

        @Override
        public String toString() {
            return "diagnoticos{" + "id=" + id + ", id_paciente=" + id_paciente + ", id_personal=" + id_personal + ", codigo_cie10=" + codigo_cie10 + ", descripcion=" + descripcion + ", fecha=" + fecha + '}';
        }

       
        
    }
    
    // class relacion entre personal y diagnostico
    class pers_equipo_diag{


        int id ;
        int id_Medico;
        int id_medico_junior;
        int id_equipo;
        
        public pers_equipo_diag(int id, int id_Medico,int id_medico_junior, int id_equipo){
            this.id=id;
            this.id_Medico=id_Medico;
            this.id_medico_junior=id_medico_junior;
            this.id_equipo=id_equipo;
            
        
        }

        @Override
        public String toString() {
            return "pers_equipo_diag{" + "id=" + id + ", id_Medico=" + id_Medico + ", id_medico_junior=" + id_medico_junior + ", id_equipo=" + id_equipo + '}';
        }

    }
    
    // class equipo
    class equipo{


        int id ;
        String Nombre_equipo;
        String fecha_inicio;
        int id_diagnostico;
        
        public equipo(int id, String Nombre_equipo,int id_diagnostico,String fecha_inicio){
            this.id=id;
            this.Nombre_equipo=Nombre_equipo;
            this.fecha_inicio=fecha_inicio;
            this.id_diagnostico=id_diagnostico;
        }

        @Override
        public String toString() {
            return "equipo{" + "id=" + id + ", Nombre_equipo=" + Nombre_equipo + ", fecha_inicio=" + fecha_inicio + ", id_diagnostico=" + id_diagnostico + '}';
        }

       
    }

    // class pabellom
    class pabellon{
    
        int id ;
        String nombre;
        String estado;
        String ubicacion;
        int capacidad;
        public pabellon(int id, String nombre,String estado,String ubicacion,int capacidad){
            this.id=id;
            this.nombre=nombre;
            this.estado=estado;
            this.ubicacion=ubicacion;
            this.capacidad=capacidad;
        }

        @Override
        public String toString() {
            return "pabellon{" + "id=" + id + ", nombre=" + nombre + ", estado=" + estado + ", ubicacion=" + ubicacion + ", capacidad=" + capacidad + '}';
        }
        
        
    
    }
    
}
