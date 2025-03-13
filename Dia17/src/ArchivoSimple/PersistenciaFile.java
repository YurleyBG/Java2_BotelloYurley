
package ArchivoSimple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class PersistenciaFile {
    private static final String Nombre_archivo="./src/ArchivoSimple/data.txt";
    
    
    public static void guardarDatos(String contenido) {
        try{
            FileWriter guardar = new FileWriter(Nombre_archivo);
            guardar.write(contenido);
            System.out.println("Datos fueron guardados de manera correcta");
        
        }catch(IOException e){
            System.out.println("Error al momento de guardar:" + e.getMessage());
        
        }
        
       
    }
    public static void leerDatos(){
        try{
            BufferedReader lector = new BufferedReader(new FileReader(Nombre_archivo));
            String Linea;
            System.out.println("Contenido del archivo");
            while((Linea=lector.readLine())!=null){

                System.out.println(Linea);
            }

        }catch(IOException e){

            System.out.println("Error al momento de guardar:" + e.getMessage());

        }

    }
    public static void main(String[] args) {
        PersistenciaFile.guardarDatos("holeeeeee");
        PersistenciaFile.leerDatos();
    }
    
}
