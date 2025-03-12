
package dia16;


public class hilos {
    
    static class pingpong extends Thread{
        private String word ;

        public pingpong(String s) {
           word=s;
        }
        public void run (){
        
            for (int i = 0; i <3000; i++) {
                System.out.println(word);
                System.out.flush();
                
            }
        
        }
        
        
    
    }
    
}
