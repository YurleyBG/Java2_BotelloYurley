package Concurrencia_Java;

import java.util.Random;

public class Ejercicio_1 {

    static class Vehiculo extends Thread {
        private String nombre;
        private int pista;

        public Vehiculo(String nombre, int pista) {
            this.nombre = nombre;
            this.pista = pista;
        }

        @Override
        public void run() {
            try {
                System.out.println(nombre + " entrando en la pista " + pista);
                Random random = new Random();
                int tiempoPrueba = random.nextInt(5000) + 2000; 
                Thread.sleep(tiempoPrueba);
                System.out.println(nombre + " completó la prueba en la pista " + pista + " en "
                        + (tiempoPrueba / 1000) + " segundos.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(nombre + " fue interrumpido en la pista " + pista);
            }
        }
    }

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Vehículo 1", 1);
        Vehiculo vehiculo2 = new Vehiculo("Vehículo 2", 2);
        Vehiculo vehiculo3 = new Vehiculo("Vehículo 3", 3);

        vehiculo1.start();
        vehiculo2.start();
        vehiculo3.start();
    }
}