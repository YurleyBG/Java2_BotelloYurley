
package Dia12;

import java.util.ArrayList;
import java.util.List;


public class solutionEjercicio_2 {
    public enum Localidad {
        NONE,
        BAHIA_BLANCA,
        TRES_ARROYOS
    }

    public static class Cliente {
        private String nombre;
        private Localidad localidad;
        private float saldo;
       

        public Cliente(String nombre, Localidad localidad, float saldo) {
            this.nombre = nombre;
            this.localidad = localidad;
            this.saldo = saldo;
        }

        
        public String getNombre() {
            return nombre;
        }

        public Localidad getLocalidad() {
            return localidad;
        }

        public float getSaldo() {
            return saldo;
        }
        
        
    }
    

    public static class LogicaClientes {

        private List<Cliente> clientes;

      
        public List<Cliente> getClientesPorLocalidad(Localidad localidad) {
            
        }

        public List<Cliente> getClientesPorNombre(String nombre) {
            
        }

        public List<Cliente> getClientesConSaldo() {
          
        }

        public static void main(String[] args) {

          
        }
    }
    
    
}
