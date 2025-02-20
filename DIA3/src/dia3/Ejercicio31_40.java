
package dia3;

import java.util.*;
public class Ejercicio31_40 {
    
    public static void Menu(){
   
        System.out.println("-------MENU-------");
        System.out.println("1. . ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. ");
        System.out.println("8. ");
        System.out.println("9. ");
        System.out.println("10. ");
        System.out.println("11. Finalizar");
        System.out.println("-------------------");
    
    
    
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
                    System.out.println("NUMEROS ENTEROS HASTA N");
                    

                break;
                case 2:

                break;
                case 3:

                break;
                case 4:

                break;
                case 5:

                break;
                case 6:

                break;
                case 7:

                break;
                case 8:

                break;
                case 9:

                break;
                case 10:

                break;
                case 11:

                break;
            
            }
        }
    
    }
    
    
}
