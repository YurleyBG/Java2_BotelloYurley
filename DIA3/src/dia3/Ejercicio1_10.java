
package dia3;
import java.util.*;

public class Ejercicio1_10 {
    public static void Menu(){
        System.out.println(" ");
        System.out.println("-------MENU-------");
        System.out.println("1. Números naturales del 1 al N. ");
        System.out.println("2. Números naturales en orden inverso.");
        System.out.println("3. Tablas de multiplicar.");
        System.out.println("4. Tablas de multiplicar en orden inverso.");
        System.out.println("5. Letras del alfabeto de la A a la Z");
        System.out.println("6. letras del alfabeto de la Z a la A");
        System.out.println("7. Números pares entre 1 y 100.");
        System.out.println("8. Números impares entre 1 y 100.");
        System.out.println("9. Suma N números naturales entre 1 y n.");
        System.out.println("10. Suma N números pares entre 1 y n.");
        System.out.println("11. Finalizar");
        System.out.println("-------------------");
    
    
        
    }
    public static void main(String [] args){
        
        boolean booleanito=true;
        while(booleanito){
            Ejercicio1_10 ver =new Ejercicio1_10();
            Scanner scan = new Scanner(System.in);
            ver.Menu();
            System.out.println("Ingrese la opcion que desea: ");
            int opc=scan.nextInt();
            switch(opc){
                case 1:
                    System.out.println("NUMEROS NATURALES HASTA N");
                    System.out.println("");
                    System.out.println("Ingrese la cantidad de numeros naturales que desa imprimir:");
                    int cantidad=scan.nextInt();
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println(i+" ");
                      
                    }
                break;
                case 2:
                      System.out.println("NUMEROS NATURALES HASTA N INVERSOS");
                    System.out.println("");
                    System.out.println("Ingrese la cantidad de numeros naturales que desa imprimir:");
                    int cantidad1=scan.nextInt();
                    scan.nextLine();
                    for (int i = cantidad1; i >= 0; i--) {
                        System.out.println(i+" ");
                      
                    }

                break;
                case 3:
                    System.out.println("TABLA DE MULTIPLICAR INVERSA");
                    System.out.println("");
                    System.out.println("Ingrese el numero del que quiere ver la tabla de multiplicar:");
                    int numerotabla=scan.nextInt();
                    switch(numerotabla){
                        case 1:
                            System.out.println("");
                            for (int i = 1; i < 11; i++) {
                                System.out.println("1*"+i+"="+ 1*i); 
                            }
                        break;
                        case 2:
                            System.out.println("");
                            for (int i = 1; i < 11; i++) {
                                System.out.println("1*"+i+"="+2*i);
                            }
                        break;
                        case 3:
                            System.out.println("");
                            for (int i = 1; i < 11; i++) {
                                System.out.println("1*"+i+"="+3*i);
                                
                            }
                        break;
                        case 4:
                            System.out.println("");
                            for (int i = 1; i < 11; i++) {
                                System.out.println("1*"+i+"="+4*i);
                            }
                        break;
                        case 5:
                            System.out.println("");
                            for (int i = 1; i < 11; i++) {
                                System.out.println("1*"+i+"="+5*i);
                            }
                        break; 
                        case 6: 
                            System.out.println("");
                            for (int i = 1; i < 11; i++) {
                                System.out.println("1*"+i+"="+6*i); 
                            }
                        break;
                        case 7: 
                            System.out.println("");
                            for (int i = 1; i < 11; i++) {
                                System.out.println("1*"+i+"="+7*i);  
                            }
                        break;
                        case 8: 
                            System.out.println("");
                            for (int i = 1; i < 11; i++) {
                                System.out.println("1*"+i+"="+8*i);   
                            }
                        break;
                        case 9: 
                            System.out.println("");
                            for (int i = 1; i < 11; i++) {
                                System.out.println("1*"+i+"="+9*i);   
                            }
                        break;
                    }

                break;
                case 4:
                    System.out.println(" TABLA DE MULTIPLICAR INVERSA ");
                    System.out.println("");
                    System.out.println("Ingrese el numero del que quiere ver la tabla de multiplicar:");
                    int numerotabla1=scan.nextInt();
                    switch(numerotabla1){
                        case 1:
                            System.out.println("");
                            for (int i=10;i>=1; i--) {
                                System.out.println("1*"+i+"="+1*i); 
                            }
                        break;
                        case 2:
                            System.out.println("");
                            for (int i=10;i>=1; i--) {
                                System.out.println("1*"+i+"="+ " "+ 2*i);
                            }
                        break;
                        case 3:
                            System.out.println("");
                            for (int i=10;i>=1; i--) {
                                System.out.println("1*"+i+"="+3*i);
                                
                            }
                        break;
                        case 4:
                            System.out.println("");
                            for (int i=10;i>=1; i--) {
                                System.out.println("1*"+i+"="+4*i);
                            }
                        break;
                        case 5:
                            System.out.println("");
                            for (int i=10;i>=1; i--) {
                                System.out.println("1*"+i+"="+5*i);
                            }
                        break; 
                        case 6: 
                            System.out.println("");
                            for (int i=10;i>=1; i--) {
                                System.out.println("1*"+i+"="+6*i); 
                            }
                        break;
                        case 7: 
                            System.out.println("");
                            for (int i=10;i>=1; i--) {
                                System.out.println("1*"+i+"="+7*i);  
                            }
                        break;
                        case 8: 
                            System.out.println("");
                            for (int i=10;i>=1; i--) {
                                System.out.println("1*"+i+"="+8*i);   
                            }
                        break;
                        case 9: 
                            System.out.println("");
                            for (int i=10;i>=1; i--) {
                                System.out.println("1*"+i+"="+9*i);   
                            }
                        break;
                    }

                break;
                case 5:
                    System.out.println("ABECEDARIO A-Z");
                    System.out.println("");
                    for(char letra='A';letra<='Z';letra++){
                        System.out.println(letra);
                    }

                break;
                case 6:
                    System.out.println("ABECEDARIO INVERSO Z-A");
                    System.out.println("");
                    for(char letra='Z';letra>='A';letra--){
                        System.out.println(letra);
                    }

                break;
                case 7:
                    System.out.println("NUMEROS PARES 1-100");
                    System.out.println("");
                    for (int i = 0; i < 101; i++) {
                       if(i%2==0){
                           System.out.println(i);
                       } 
                    }

                break;
                case 8:
                     System.out.println("NUMEROS IMPARES 1-100");
                    System.out.println("");
                    for (int i = 0; i < 101; i++) {
                       if(i%2!=0){
                           System.out.println(i);
                       } 
                    }


                break;
                case 9:
                    System.out.println(" SUMA NUMEROS NATURALES ");
                    System.out.println("");
                    System.out.println("Ingrese la cantidad de numeros naturales que desa imprimir:");
                    int can=scan.nextInt();
                    System.out.println("Ingrese el numero con el que desea sumar");
                    int n=scan.nextInt();
                    for (int i = 0; i < can; i++) {
                        int suma=n+i ;
                        System.out.println(n+"+"+i+"="+ suma);
                      
                    }

                break;
                case 10:
                    System.out.println(" SUMA NUMEROS NATURALES PARES");
                    System.out.println("");
                    System.out.println("Ingrese la cantidad de numeros naturales que desa imprimir:");
                    int cant=scan.nextInt();
                    System.out.println("Ingrese el numero con el que desea sumar");
                    int n1=scan.nextInt();
                    for (int i = 0; i < cant; i++) {
                        int suma=n1+i;
                        if(i%2==0){
                          
                            System.out.println(n1+"+"+i+"="+ suma);
                        }
                    }

                break;
                case 11:
                    System.out.println("HAZ FINALIZADO ... ADIOSS :)");
                    booleanito=false;
                break;
            
            }
        }
    
    }
    
}
