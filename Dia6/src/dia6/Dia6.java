/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia6;

/**
 *
 * @author Uniminuto Tibu
 */
public class Dia6 {

    
    public static void main(String[] args) {
        classdia6 p1 =new classdia6();
        p1.setEdad(18);
        p1.setNombre("alejandra");
        System.out.println( p1.getNombre());
        System.out.println( p1.getEdad());
        
        CuentaBancaria c1 =new CuentaBancaria("hghjgjh",10000000);
        System.out.println(c1.getSaldo());
        c1.depositar(2500000);
        System.out.println(c1.getSaldo());
        c1.retirar(9000000);
        System.out.println(c1.getSaldo());
    }
    
}
