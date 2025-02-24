
package dia6;


public class Main_CuentaBancaria {
    
    public static void main(String[] args) {
        CuentaAhorro ca =new CuentaAhorro(17,"132425AV",20000000);
        System.out.println(ca.getSaldo());
        ca.depositar(2500000);
        System.out.println(ca.getSaldo());
        ca.retirar(9000000);
        System.out.println(ca.getSaldo());
        //aplicacion del interes
        ca.aplicarInteres(ca.getSaldo());
       
    }
    
}
