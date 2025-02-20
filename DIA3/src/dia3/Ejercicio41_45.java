
package dia3;

import java.util.*;
public class Ejercicio41_45 {
    public static void Menu(){
   
        System.out.println("-------MENU-------");
        System.out.println("1.Verificar si un número es un Número Perfecto o no. ");
        System.out.println("2.Números de Armstrong entre 1 y 1000. ");
        System.out.println("3.verificar si un número es un Número de Armstrong o no. ");
        System.out.println("4.factores primos en Java. ");
         System.out.println("5.Numero fuerte o no");
        System.out.println("6. Finalizar");
        System.out.println("-------------------");
    
    
    
    }
    public static void main(String [] args){
        
        boolean booleanito=true;
        while(booleanito){
            Ejercicio41_45 ver =new Ejercicio41_45();
            Scanner scan = new Scanner(System.in);
            ver.Menu();
            System.out.println("Ingrese la opcion que desea: ");
            int opc=scan.nextInt();
            switch(opc){
                case 1:
                    System.out.println("NUMERO PERFECTO O NO");
                    System.out.println("Ingresar numero");
                    int num = scan.nextInt();
                    int obtener=0;
                    for (int i = 1; i < num; i++) {
                        if(num%i==0){
                            obtener+=i; 
                        }
                        
                    }
                    if(obtener==num){
                        System.out.println("Es perfecto");
                    }
                    else{
                        System.out.println("No es perfecto");
                    }
                    
                    

                break;
                case 2:
                    System.out.println("ARMSTRONG 1 Y 10000");

                break;
                case 3:
                    System.out.println("ARMSTRONG O NO");

                break;
                case 4:
                    System.out.println("FACTORES PRIMOS");
                    System.out.println("ingrese el numero:");
                    int numes=scan.nextInt();
                    int num11=2;
                    while(numes!=1){
                        while(numes%num11==0){
                            System.out.println(num11);
                            numes/=num11;
                        
                        }
                        num11++;
                    }

                break;
                case 5:
                    System.out.println("NUMERO FUERTE O NO");
                    System.out.println("Ingresar numero");
                    int numrr = scan.nextInt();

                    int sum = 0;
                    int guardar = numrr;

                    while (guardar > 0) {
                        int digito = guardar % 10;
                        long factorialDigito = 1;
                        for (int i = 1; i <= digito; i++) {
                            factorialDigito *= i;
                        }

                        sum += factorialDigito;
                        guardar /= 10;
                    }

                    if(sum==numrr){
                        System.out.println("Es fuerte");
                    } 
                    else{
                        System.out.println("No es fuerte");
                    }
                    
                    
                break;
                case 6:
                    
                    System.out.println("HAZ FINALIZADO ... ADIOSS :)");
                    booleanito=false;
                break;
                
            
            }
        }
    
    }
    
    
}
