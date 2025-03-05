
package SOULD_LSP;

 // PRINNCIPIO DE SUSTITUCION LINKOV
//El principio establece que las subclases deben ser sustituibles por sus clases bases.
//O sea la subclase(hijo) pueden heredar las propiedades de la clase principal(padre).
// este principio garantiza que la  herencia se use de manera correcta.

public class vehiculo {
    
    public void acelerar() {
        System.out.println("Vehículo acelerando...");
    }

    public void frenar() {
        System.out.println("Vehículo frenando...");
    }
    

    static class Coche extends vehiculo {
        @Override
        public void acelerar() {
            System.out.println("El Coche esta acelerando.");
        }

        @Override
        public void frenar() {
            System.out.println("El Coche esta frenando.");
        }

    }

    static class Bicicleta extends vehiculo {
        @Override
        public void acelerar() {
            System.out.println("La persona pedalea la bicicleta");
        }

        @Override
        public void frenar() {
            System.out.println("La persona frena la bicicleta");
        }
    }

    
    public static void main(String[] args) {
        vehiculo vehi = new vehiculo();
        vehiculo vehiculo1 = new Coche();
        vehiculo vehiculo2 = new Bicicleta();

        vehiculo1.acelerar();
        vehiculo1.frenar();

        vehiculo2.acelerar();
        vehiculo2.frenar();
    }
    
    
}
