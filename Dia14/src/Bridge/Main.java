
package Bridge;

//Bridge(puente de la novena)

//separa una bastraccion de su implementacion para que ambas pueden evolucionar independientemente

// ejemplo 
//diferentes formas geometricas que puede ser  dibujados de distintos  maneras(rojo a azul)
public class Main {
    // interfaz para la implementacion
    interface Color {
        void ApplyColor();
    }
    //implementacion concretas
    static class RedColor implements Color{
        public void ApplyColor(){
        
            System.out.println("Aplicando color rojo");
        
        }  
    }
    static class BlueColor implements Color{
        public void ApplyColor(){
        
            System.out.println("Aplicando color Azul");
        
        }  
    }
    //clase base que usa una implementacion
    static abstract class Shape{
        protected Color color;
        public Shape (Color color){
          this.color = color;
         
        }
        abstract void draw();
        
    
    
    }
    //subclase con una implementacion diferente
    static class circle extends Shape {
    
    
        public circle (Color color){
            super(color);
        
        }
        public void draw(){
            System.out.println("Dibujando circulo");
            color.ApplyColor();
        
        }
        
    
    }
    // uso del patron bridege
    public static void main(String[] args) {
        Shape redCircle = new circle(new RedColor());
        Shape blueCircle = new circle(new BlueColor());
        redCircle.draw();
        blueCircle.draw();
    }
    
    
}
