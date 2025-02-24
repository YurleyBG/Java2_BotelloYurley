
package dia6;


class CuentaAhorro extends CuentaBancaria{
    
    private double tasaInteres;

    public CuentaAhorro(double tasaInteres, String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }
    
    public void aplicarInteres(double saldo){
       
        saldo = saldo + (saldo * tasaInteres / 100);
        
        System.out.println(saldo);
    
    }



}
