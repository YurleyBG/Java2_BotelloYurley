/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concurrencia_Java;

import java.util.Random;
public class Ejercicio_2 {
    
    static class Orden extends Thread {
        private int numeroOrden;

        public Orden(int numeroOrden) {
            this.numeroOrden = numeroOrden;
        }

        @Override
        public void run() {
            try {
                System.out.println("Procesando orden #" + numeroOrden + "...");
                Random random = new Random();
                int tiempoProcesamiento = random.nextInt(3000) + 1000; // 
                Thread.sleep(tiempoProcesamiento);
                System.out.println("Orden #" + numeroOrden + " completada en " + (tiempoProcesamiento / 1000) + " segundos.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Orden #" + numeroOrden + " fue interrumpida.");
            }
        }
    }

    public static void main(String[] args) {
        int numOrdenes = 5; 

        for (int i = 1; i <= numOrdenes; i++) {
            Thread hiloOrden = new Thread(new Orden(i));
            hiloOrden.start();
            
        }
    }
}
    

