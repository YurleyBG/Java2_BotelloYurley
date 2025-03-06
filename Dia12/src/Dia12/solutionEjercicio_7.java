
package Dia12;

import java.util.ArrayList;
import java.util.List;

interface enemy{
    void doction();
    
    void init(List<enemy>enemigo);
}
public class solutionEjercicio_7 {
    // violaba el principio abierto y cerrado ya que se debia modificar el codigo para agregar otro tipo de enemigo
    
    private List<enemy>enemigo=new ArrayList<>();
    private boolean endgame=false;
    
    public solutionEjercicio_7(List<enemy>enemigo){
        this.enemigo=enemigo;
    }
    
    public void run(){
    
        while(!endgame){
            for(enemy e : enemigo){
                e.doction();

            }
            break;
        }
    }
    static class gunEnemy implements enemy{

        @Override
        public void doction() {
            System.out.println("Ataca con pistola");
            
        }

        @Override
        public void init(List<enemy> enemigo) {
            enemigo.add(this);
            
        }
    
    }
    static class KnifeEnemy implements enemy{

        @Override
        public void doction() {
           System.out.println("Ataca con cuchilla"); 
        }

        @Override
        public void init(List<enemy> enemigo) {
            enemigo.add(this);
        }
    }
    public static void main(String[] args) {
        
        List<enemy>enemigoList=new ArrayList<>();
        
        enemigoList.add(new KnifeEnemy());
        enemigoList.add(new gunEnemy());
        
        solutionEjercicio_7 game =new solutionEjercicio_7(enemigoList);
        game.run();
        
        
        
    }
    
    

    
}
