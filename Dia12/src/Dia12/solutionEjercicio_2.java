
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

        public LogicaClientes(List<Cliente> clientes) {
            this.clientes = clientes;
        }

        public List<Cliente> getClientesPorLocalidad(Localidad localidad) {
            List<Cliente> resultado = new ArrayList<>();
            for (Cliente cliente : clientes) {
                if (cliente.getLocalidad() == localidad) {
                    resultado.add(cliente);
                }
            }
            return resultado;
        }

        public List<Cliente> getClientesPorNombre(String nombre) {
            List<Cliente> resultado = new ArrayList<>();
            for (Cliente cliente : clientes) {
                if (cliente.getNombre().equals(nombre)) {
                    resultado.add(cliente);
                }
            }
            return resultado;
        }

        public List<Cliente> getClientesConSaldo() {
            List<Cliente> resultado = new ArrayList<>();
            for (Cliente cliente : clientes) {
                System.out.println(cliente.getSaldo());
                if (cliente.getSaldo() > 0) {
                    resultado.add(cliente);
                }
            }
            return resultado;
        }

        public static void main(String[] args) {

            List<Cliente> clientes = new ArrayList<>(); 
            clientes.add(new Cliente("Juan", Localidad.BAHIA_BLANCA, 100));
            clientes.add(new Cliente("Maria", Localidad.TRES_ARROYOS, 0));
            clientes.add(new Cliente("Pedro", Localidad.BAHIA_BLANCA, 50));

            LogicaClientes logica = new LogicaClientes(clientes);
         

            System.out.println("Clientes en BAHIA_BLANCA: " + logica.getClientesPorLocalidad(Localidad.BAHIA_BLANCA));
            System.out.println("Clientes con saldo: " + logica.getClientesConSaldo());
        }
    }
    
    
}
