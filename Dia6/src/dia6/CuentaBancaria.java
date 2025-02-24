
package dia6;


public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public CuentaBancaria(){}
    
    // No voy a crear un setter para el numero de cuenta
    // Razon: para que no se modifique despues de haberse creado
    
    // getter para el saldo
    public double getSaldo(){
        return saldo;
    
    }
    // setter´personalizado para "saldo"
    public void depositar (double cantidad){
    
        if (cantidad>0){
            saldo=saldo + cantidad;
            System.out.println("el deposito fue realizado");
        }
        else {
            System.out.println("la cantidad a depositar debe ser positivo");
        
        }
    
    }
    // metodo para retirra platica con validacion
    public void retirar(double cantidad){
    
           if(cantidad>0 && cantidad<=saldo){
               
                saldo=saldo - cantidad;
                System.out.println("el retiro fue realizado");
               
           }
           else if(cantidad>saldo){
               System.out.println("No tienes fondos suficientes");
           }
           else{
               System.out.println("la cantidad a retirar debe ser positiva");
           }
    }
  
}
