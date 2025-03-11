
package Decorator;
// decorator
// añade funcionalidades a un objecto pero matiene su estructura


// ejemplo 
// agrega caracteristicas extras a un cafe
public class Decorator {
    interface Coffe{
        String getDescription();
        double cost();
    }
    static class SimpleCoffe implements Coffe {
    
        public String getDescription(){
            return "Cafe simple";
        
        }
        public double cost(){
            return 5.0;
        
        }
    
    }
    static abstract class CoffeDecorator implements Coffe{
    
        protected Coffe coffe ;
        public CoffeDecorator(Coffe coffe){
             this.coffe=coffe;
        }
        public String getDescription(){
            return coffe.getDescription();
        
        }
        public double cost(){
        
            return coffe.cost();
        }
        
     
    
    }
    static class MilkDecorator extends CoffeDecorator{
    
        public MilkDecorator(Coffe coffe){
        
            super(coffe);
        }
        public String getDescription(){
            return coffe.getDescription()+ ", con leche";
        
        }
        public double cost(){
        
            return coffe.cost()+1.5;
        
        }
    }
    public static void main(String[] args) {
        Coffe myCoffe =new SimpleCoffe();
        System.out.println(myCoffe.getDescription()+" $ " + myCoffe.cost());
        
        myCoffe =new MilkDecorator(myCoffe);
        System.out.println(myCoffe.getDescription()+" $ " + myCoffe.cost());
    }
}
