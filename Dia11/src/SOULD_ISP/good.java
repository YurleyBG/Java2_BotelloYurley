package SOULD_ISP;


// PRINCIPIO DE SEGREGACION DE INTERFAZ

//no se debe forzar a utilizar a interfacez que no van a usar.
// en otras palabras es mejor crea pequeñas intefacez para mayor flexibilidad y entendimiento.

public class good {
    // creacion de interfaces pequeñas 
    public  interface RecursoCargable {
        void cargar();
    }

    public interface RecursoGuardable {
        void guardar();
    }
    
    // al tener unterfacez pequeñas  las nyevas clases no se veran ela obligacion de utilizar
    //algo que no usan lo que pasaria si tuvieramos una interfaz mas grande.
    
    
    public static class ConfiguracionUsuario implements RecursoCargable, RecursoGuardable {
        public void cargar() {
            System.out.println("Configuracion usuario cargada");
        }

        public void guardar() {
            System.out.println("Configuracion usuario almacenada");
        }
    }

    public static class ConfiguracionHoraria implements RecursoCargable {
        public void cargar() {
            System.out.println("Configuracion horaria cargada");
        }
    }
    public static void main(String[] args) {
        
        ConfiguracionUsuario configUsuario = new ConfiguracionUsuario();
        ConfiguracionHoraria configHoraria = new ConfiguracionHoraria();

        RecursoCargable recurso1 = configUsuario;
        recurso1.cargar();

        RecursoCargable recurso2 = configHoraria;
        recurso2.cargar();

        RecursoGuardable recurso3 = configUsuario;
        recurso3.guardar();
        
    }
    
    
    
    
    
}
