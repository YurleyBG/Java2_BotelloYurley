
package dia3;

import java.util.*;
public class Ejercicio41_45 {
    public static void Menu(){
   
        System.out.println("-------MENU-------");
        System.out.println("1. Números Perfectos del 1 al 10000.. ");
        System.out.println("2.Verificar si un número es un Número Perfecto o no. ");
        System.out.println("3.Números de Armstrong entre 1 y 1000. ");
        System.out.println("4.verificar si un número es un Número de Armstrong o no. ");
        System.out.println("5.factores primos en Java. ");
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
                    System.out.println("NUMERO PERFECTO 1-10000");
                  
                     int numperfe = 10000;
                    int sumita = 0;

                    for (int a = 2; a <= numperfe; a++) {

                        int obtener1 = 1;

                        for (int i = 2; i * i <= a; i++) { 
                            if (a % i == 0) {
                                obtener1 += i;
                                if (i * i != a) {
                                    obtener1 += a / i;
                                }
                            }
                        }

                        if (obtener1 == a) {
                            System.out.println(a);
                            obtener1 += 1; // 
                            sumita += a;
                        }
                    }

                    System.out.println(sumita);
                    
                    

                break;
                case 2:
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
                case 3:

                break;
                case 4:

                break;
                case 5:

                break;
                case 6:

                break;
                
            
            }
        }
    
    }
    
    
}
