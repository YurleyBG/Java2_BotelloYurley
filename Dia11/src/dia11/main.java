
package dia11;


public class main {
    
        //principio solid
        // son un conjunto de cinco principios de diseño en la poo, formulado por robert c. 
        //martin que ayda a crear spftware mas matenibles , escalables y flexible
        
        
        // los cinco principios son los siguientes:
        
        //1.single resposability princicle (SRP)-principio de responsabilidad unica
        // 2. open/closed princple (OCP)-principio abierto/cerrado
        //3. Liskov substitution pi¿rinciple (LSP)-principio de sutitucio liskov
        //4. interfaz segregation principle(ISP)principio de agregacion de interfaz
        //5. dependency inversio principle(ISP)-principio de inversion de dependencias
    
    
    
    static void verificarEdad(int edad){
        if (edad < 18){
            throw new ArithmeticException("Acceso es denegado - Debes ser mayoría de edad.");
        }
        else{
            System.out.println("Acceso autorizado!!!");
        }
    }
    
    public static boolean usarEdad(int edad){
        try{
        verificarEdad(edad);
        return true;
        }
        catch(Exception e){
            System.out.println("El programa tuvo un error: "+e.getMessage());
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(usarEdad(66));
        
    }
  
}
