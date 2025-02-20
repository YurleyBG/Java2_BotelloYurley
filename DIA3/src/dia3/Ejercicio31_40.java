
package dia3;

import java.util.*;
public class Ejercicio31_40 {
    
    public static void Menu(){
   
        System.out.println("-------MENU-------");
        System.out.println("1. binario a decimal.. ");
        System.out.println("2. binario a hexadecimal.");
        System.out.println("3. octal a binario.");
        System.out.println("4. octal a decimal.");
        System.out.println("5. octal a hexadecimal");
        System.out.println("6. Complemento de 1");
        System.out.println("7. Complemento de 2");
        System.out.println("8. Fibonacci");
        System.out.println("9. Números Fuertes del 1 al 100000.");
        System.out.println("10. Números Perfectos del 1 al 10000.");
        System.out.println("11. Finalizar");
        System.out.println("-------------------");
    
    
    
    }
    public static Boolean verificarFuerte(int num){
    
        int sum = 0;
        int guardar = num;

        while (guardar > 0) {
            int digito = guardar % 10;
            long factorialDigito = 1;
            for (int i = 1; i <= digito; i++) {
                factorialDigito *= i;
            }

            sum += factorialDigito;
            guardar /= 10;
        }

        if(sum==num){
           return true;
        } 
        else{
            return false;
        }
    
    
    }
    public static void main(String [] args){
        
        boolean booleanito=true;
        while(booleanito){
            Ejercicio31_40 ver =new Ejercicio31_40();
            Scanner scan = new Scanner(System.in);
            ver.Menu();
            System.out.println("Ingrese la opcion que desea: ");
            int opc=scan.nextInt();
            switch(opc){
                case 1:
                    System.out.println("BINARIO A DECIMAL");
                    System.out.println("Ingresar el binario a convertir");
                    scan.nextLine();
                    String binario1 = scan.nextLine();
                    System.out.println("el hexadecimal es: "+binario1+" el octal es: "+ Integer.parseInt(binario1,2));
                    

                break;
                case 2:
                    System.out.println("BINARIO A HEXADECIMAL");
                    System.out.println("Ingresar el binario a convertir");
                    scan.nextLine();
                    String binario2 = scan.nextLine();
                    System.out.println("el hexadecimal es: "+binario2+" el octal es: "+ Integer.toHexString(Integer.parseInt(binario2,2)));

                break;
                case 3:
                    System.out.println("OCTAL A BINARIO");
                    System.out.println("Ingresar el octal a convertir");
                    scan.nextLine();
                    String OCTAL1 = scan.nextLine();
                    System.out.println("el hexadecimal es: "+OCTAL1+" el octal es: "+ Integer.toBinaryString(Integer.parseInt(OCTAL1,8)));

                break;
                case 4:
                    System.out.println("OCTAL A DECIMAL");
                    System.out.println("Ingresar el octal a convertir");
                    scan.nextLine();
                    String OCTAL2 = scan.nextLine();
                    System.out.println("el hexadecimal es: "+OCTAL2+" el octal es: "+ Integer.toBinaryString(Integer.parseInt(OCTAL2,8)));

                break;
                case 5:
                    System.out.println("OCTAL A HEXADECIMAL");
                    System.out.println("Ingresar el octal a convertir");
                    scan.nextLine();
                    String OCTAL3 = scan.nextLine();
                    System.out.println("el hexadecimal es: "+OCTAL3+" el octal es: "+ Integer.toHexString(Integer.parseInt(OCTAL3,8)));

                break;
                case 6:
                    System.out.println("COMPLEMENTO 1");
                    System.out.println("Ingresar el numero ");
                    int comple= scan.nextInt();
                    System.out.println("el complemento de 1 es: "+~comple);

                break;
                case 7:
                     System.out.println("COMPLEMENTO 2");
                    System.out.println("Ingresar el numero ");
                    scan.nextLine();
                    String comple1= scan.nextLine();
                    String e="";
                    for (int i = 0; i < comple1.length(); i++) {
                       
                       if(comple1.charAt(i)=='0'){
                           e+='1';
                       }else e+='0';
                       
                    }
                    int guardar=Integer.parseInt(e)+1;
                    System.out.println(Integer.toBinaryString(guardar));

                break;
                case 8:
                    System.out.println("FIBONACCI");

                break;
                case 9:
                     System.out.println("NUMERO FUERTE 1-10000");
                     for (int i = 1; i < 100000; i++) {
                        if(verificarFuerte(i)==true){
                            System.out.println(i);
                        }
                        
                    }

                break;
                case 10:
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
                case 11:
                    System.out.println("HAZ FINALIZADO ... ADIOSS :)");
                    booleanito=false;

                break;
            
            }
        }
    
    }
    
    
}
