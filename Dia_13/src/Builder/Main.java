
package Builder;

// Builder 
//Se usan para construir objetos complejos paso a paso
//Ess utilcuando hay muchas configuraciones posibles para un objetos.
public class Main {
    
    static class Computadora {
        private String procesador;
        private int ram;
        private boolean TarjetaGrafica;

        private Computadora(Builder builder) {
            this.procesador = builder.procesador;
            this.ram = builder.ram;
            this.TarjetaGrafica = builder.TarjetaGrafica;
        }
        
        public void MostrarConfiguracion(){
            System.out.println("computadora con"+procesador + "Ram"+ ram
            + "GB , Tarjeta grafica "+ TarjetaGrafica);
        }
        
        public static class Builder {
            
            private String procesador;
            private int ram;
            private boolean TarjetaGrafica;

            public Builder setProcesador(String procesador){
                this.procesador=procesador;
                return this;
            
            }
            public Builder setRam(int ram){
                this.ram=ram;
                return this;
            
            }

            public Builder setTarjetaGrafica( boolean tarjetaGrafica) {
              
                this.TarjetaGrafica = tarjetaGrafica;
                return this;
            }
            public Computadora build(){
                return new Computadora(this);
            
            }  
        
        }
       
    }
    public static void main(String[] args) {
        Computadora pc = new Computadora.Builder()
                .setProcesador("intel i7")
                .setRam(16)
                .setTarjetaGrafica(true)
                .build();


        pc.MostrarConfiguracion();

    }


    
    
}
