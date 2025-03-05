
package SOULD_SRP;


public class bad {
    //1.single resposability princicle (SRP)-principio de responsabilidad unica
    //una clase debe tener una unica razon para cambiar
    //, es decir , debe encargarse e una sola responsabilidad
    class Report {
    
        public void generateReport(){
            //generar un informe
    
        }
        public void SaveTpFile(String filename){
            // guardar el informe en un archivo(violacion de srp)
        
        }
        // ¡que esta mal? la clasee report tiene dos  responabulidaes
        //generar el informe y guardarlo en un archivo
        
        
    }
    
}
