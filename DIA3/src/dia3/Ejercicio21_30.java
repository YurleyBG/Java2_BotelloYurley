
package dia3;
import java.util.*;

public class Ejercicio21_30 {
    
    public static void Menu(){
   
        System.out.println("-------MENU-------");
        System.out.println("1.Números y la suma de todos los enteros entre 100 y 200 /9. ");
        System.out.println("2. Número binario a decimal");
        System.out.println("3. Número Fuerte o no.");
        System.out.println("4. Hexadecimal a decimal.");
        System.out.println("5. Hexadecimal a octal.");
        System.out.println("6. Hexadecimal a binario.");
        System.out.println("7. decimal a hexadecimal.");
        System.out.println("8. decimal a octal.");
        System.out.println("9. decimal a binario.");
        System.out.println("10. binario a octal.");
        System.out.println("11. Finalizar");
        System.out.println("-------------------");
    
    
        
    
    }
    public static void main(String [] args){
        
        boolean booleanito=true;
        while(booleanito){
            Ejercicio21_30 ver =new Ejercicio21_30();
            Scanner scan = new Scanner(System.in);
            ver.Menu();
            System.out.println("Ingrese la opcion que desea: ");
            int opc=scan.nextInt();
            switch(opc){
                case 1:
                    System.out.println("NUMEROS ENTEROS DEL 100-200 DIVISIBLES EN 9");
                    int result=0;
                    for (int i = 100; i < 200; i++) {
                        if(i%9==0){
                           result=result+i;
                           System.out.print(i+" ");
                        }
                    }
                    System.out.println("el resultado de la suma es: "+result);
                break;
                case 2:
                    int number=0;
                    int potencia=0;
                    int decimal=0;
                    System.out.println("BINARIO A DECIMAL");
                    System.out.println("Ingres el binario a convertir");
                    scan.nextLine();
                    String binario=scan.nextLine();
                    for (int i= binario.length()-1;i >= 0; i--) {
                       char num= binario.charAt(i);
                        number = Character.getNumericValue(num);
                        
                        int calculo=1;
                        for (int j = 0; j < potencia; j++) {
                             calculo*= 2;
                        }
                        decimal += number * calculo;
                        potencia++;
                    }
                    System.out.println("el numero binario era "+ binario +" el decimal es: "+ decimal);

                break;
                case 3:
                   
                    System.out.println("NUMERO FUERTE O NO");
                    System.out.println("Ingresar numero");
                    int num = scan.nextInt();

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
                        System.out.println("Es fuerte");
                    } 
                    else{
                        System.out.println("No es fuerte");
                    }
                    

                break;
                case 4:
                    System.out.println("HEXADECIMAL A DECIMAL");
                    System.out.println("Ingresar numero");
                    scan.nextLine();
                    String nume = scan.nextLine();
                    int d=0;
                    int p = 0;

                    for (int i = nume.length() - 1; i >= 0; i--) {
                        char digito = nume.charAt(i);
                        int valorDigito;

                        if (Character.isDigit(digito)) {
                            valorDigito = Character.getNumericValue(digito);
                        } else {
                            valorDigito = Character.toUpperCase(digito) - 'A' + 10;
                        }
                        System.out.println(valorDigito);
                       
                        int potencia16 = 1;  
                        for (int j = 0; j < p; j++) {
                            potencia16 *= 16; 
                        }
                        d += valorDigito * potencia16;

                        p++;
                    }

                    System.out.println("El numero hexadecimal era " + nume + " el decimal es: " + d);

                break;
                case 5:

                    System.out.println("HEXADECIMAL A OCTAL");
                    System.out.println("Ingresar el hexadecimal a convertir");
                    scan.nextLine();
                    String hexadecimal = scan.nextLine();
                    System.out.println("el hexadecimal es: "+hexadecimal+" el octal es: "+ Integer.toOctalString(Integer.parseInt(hexadecimal,16)));
                break;
                case 6:
                    System.out.println("HEXADECIMAL A BINARIO");
                    System.out.println("Ingresar el hexadecimal a convertir");
                    scan.nextLine();
                    String hexa = scan.nextLine();
                    System.out.println("el hexadecimal es: "+hexa+" el octal es: "+ Integer.toBinaryString(Integer.parseInt(hexa,16)));

                break;
                case 7:
                    System.out.println("DECIMAL A HEXADECIMAL");
                    System.out.println("Ingresar el decimal a convertir");
                    scan.nextLine();
                    int deci = scan.nextInt();
                    System.out.println("el hexadecimal es: "+deci+" el octal es: "+ Integer.toHexString(deci));

                break;
                case 8:
                    System.out.println("DECIMAL A OCTAL");
                    System.out.println("Ingresar el decimal a convertir");
                    scan.nextLine();
                    int decim = scan.nextInt();
                    System.out.println("el hexadecimal es: "+decim+" el octal es: "+ Integer.toOctalString(decim));


                break;
                case 9:
                    System.out.println("DECIMAL A BINARIO");
                    System.out.println("Ingresar el decimal a convertir");
                    scan.nextLine();
                    int DECIMAL = scan.nextInt();
                    System.out.println("el hexadecimal es: "+DECIMAL+" el octal es: "+ Integer.toBinaryString(DECIMAL));


                break;
                case 10:
                    System.out.println("BINARIO A OCTAL");
                    System.out.println("Ingresar el binario a convertir");
                    scan.nextLine();
                    String binario1 = scan.nextLine();
                    System.out.println("el hexadecimal es: "+binario1+" el octal es: "+ Integer.toOctalString(Integer.parseInt(binario1,2)));

                break;
                case 11:
                     System.out.println("HAZ FINALIZADO ... ADIOSS :)");
                    booleanito=false;

                break;
            
            }
        }
    
    }
    
    
}
