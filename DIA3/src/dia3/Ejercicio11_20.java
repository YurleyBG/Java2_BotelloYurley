
package dia3;

import java.util.*;
public class Ejercicio11_20 {
    
    public static void Menu(){
   
        System.out.println("-------MENU-------");
        System.out.println("1. Suma de todos los números impares entre 1 y n.. ");
        System.out.println("2. Valores ASCII.");
        System.out.println("3. Factorial");
        System.out.println("4. Número elevado a la potencia de otro.");
        System.out.println("5. Invertir los dígitos");
        System.out.println("6. Suma de los dígitos");
        System.out.println("7. Verificar si un número dado es primo o no.");
        System.out.println("8. MCD");
        System.out.println("9. Cantidad de números positivos, negativos y ceros ingresados.");
        System.out.println("10. Número más grande y el más pequeño ingresado.");
        System.out.println("11. Finalizar");
        System.out.println("-------------------");
    
    
        
    
    }
    public static void main(String [] args){
        
        boolean booleanito=true;
        while(booleanito){
            Ejercicio11_20 ver =new Ejercicio11_20();
            Scanner scan = new Scanner(System.in);
            ver.Menu();
            System.out.println("Ingrese la opcion que desea: ");
            int opc=scan.nextInt();
            switch(opc){
                case 1:
                    
                    System.out.println(" SUMA NUMEROS NATURALES IMPARES ");
                    System.out.println("");
                    System.out.println("Ingrese la cantidad de numeros naturales que desea imprimir:");
                    int cant=scan.nextInt();
                    System.out.println("Ingrese el numero con el que desea sumar");
                    int n1=scan.nextInt();
                    for (int i = 0; i < cant; i++) {
                        int suma=n1+i;
                        if(i%2!=0){
                          
                            System.out.println(n1+"+"+i+"="+ suma);
                        }
                    }

                break;
                case 2:
                    System.out.println("    VALORES ASCII ");
                    System.out.println("");
                    for (int i = 0; i <= 255; i++) {
                        char Ascii=(char)i;
                        System.out.println(Ascii);
                        
                    }

                break;
                case 3:
                    System.out.println("  FACTORIAL ");
                    System.out.println("");
                    System.out.println("Ingrese el numero:");
                    int numefacto=scan.nextInt();
                    long result=1;
                    for (int i = 1; i <= numefacto; i++) {
                        result *=i;   
                    }
                    System.out.println(numefacto+"!"+"="+result);
                    
                break;
                case 4: 
                    System.out.println("  CALCULA POTENCIAS ");
                    System.out.println("");
                    System.out.println("Ingrese el numero base");
                    int Nbase=scan.nextInt();
                    System.out.println("Ingrese el numero exponente");
                    int NExponente=scan.nextInt();
                    int resultado=1;
                    for (int i = 1; i <= NExponente; i++) {
                        resultado= resultado*Nbase; 
                    }
                    System.out.println(resultado);

                break;
                case 5:
                    System.out.println("  INVERTIR DIGITOS ");
                    System.out.println("");
                    System.out.println("Ingrese el numero ");
                    scan.nextLine();
                    String N=scan.nextLine();
                    for (int i= N.length()-1;i >= 0; i--) {
                       char num= N.charAt(i);
                       int number = Character.getNumericValue(num);
                       System.out.print(number);
                       
                    }
                    System.out.println("");

                break;
                case 6:
                    System.out.println("  SUMA DE DIGITOS ");
                    System.out.println("");
                    System.out.println("Ingrese el numero ");
                    int resultad=0;
                    scan.nextLine();
                    String numerito=scan.nextLine();
                    for (int i= numerito.length()-1;i >= 0; i--) {
                       char num= numerito.charAt(i);
                       int number = Character.getNumericValue(num);
                       resultad=resultad+number;
                       
                       
                    }
                    System.out.println(resultad);

                break;
                case 7:
                    System.out.println("  PRIMO O NO PRIMO ");
                    System.out.println("");
                    System.out.println("Ingrese el numero ");
                    int p=scan.nextInt();
                    boolean esPrimo=true;
                    for (int i = 2; i*i<=p; i++) {
                        if(p%i==0){
                            esPrimo=false;
                            break;
                        }
                    }
                    if(esPrimo){
                          System.out.println("Es primo");
                    }
                    else {
                        System.out.println("No es primo");
                    }
                  

                break;
                case 8:
                    System.out.println("  MCD ");
                    System.out.println("");
                    System.out.println("Ingresa el primer numero");
                    int num1=scan.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    int num2=scan.nextInt();
                    int num1X=num1;
                    int num2X=num2;
                    while(num2!=0){
                        int residuo=num1%num2;
                        num1=num2;
                        num2=residuo;
                    
                    }
                    System.out.println("El MCD de " + num1X + " y " + num2X + " es: " + num1);

                break;
                case 9:
                    System.out.println("____CANTIDAD POSITIVOS, NEGATIVOS Y CEROS____ ");
                    System.out.println("");
                    int ingnum=0;
                    int positivos=0;
                    int negativos=0; 
                    int ceros=0;
                     
                    String res="";
                    boolean bool=true;
                    while(bool){
                        System.out.println("ingresa un numero");
                        ingnum=scan.nextInt();
                        if (ingnum > 0) {
                            positivos++;
                        } else if (ingnum < 0) {
                            negativos++;
                        } else {
                            ceros++;
                        }
                        System.out.println("Desea segir ingresando si/no");
                        scan.nextLine();
                        res=scan.nextLine();
                        if(res.equalsIgnoreCase("no")){
                            System.out.println("la cantidad de numeros positivos fueron: "+positivos); 
                            System.out.println("la cantidad de numeros negativos fueron: "+negativos);
                            System.out.println("la cantidad de ceros fueron: "+ceros);
                            
                            bool=false;
                        }
                    
                    }
                break;
                case 10:
                    
                    System.out.println("____NUMERO MAYOR Y NUMERO MENOR____ ");                    System.out.println("");
                    int ingnum1=0;
                    String res1="";
                    ArrayList<Integer>numeritos=new ArrayList<>();
                    boolean booleano=true;
                    while(booleano){
                        System.out.println("ingresa un numero");
                        ingnum1=scan.nextInt();
                        
                        numeritos.add(ingnum1);
                        
                        System.out.println("Desea segir ingresando si/no");
                        scan.nextLine();
                        res1=scan.nextLine();
                        if(res1.equalsIgnoreCase("no")){
                            int maxNumero = Collections.max(numeritos);
                            int minNumero = Collections.min(numeritos);
                            System.out.println("el numero menor ingresado es: "+ minNumero);
                            System.out.println("el numero menor ingresado es: "+ maxNumero);
                            booleano=false;
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
