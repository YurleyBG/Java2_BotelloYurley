
package SOLID_OCP;

public class bad {
    // open/closed princple (OCP)-principio abierto/cerrado
    // las clases deben estar abiertas para la etension, pero cerrados para la modificacion
    
    class Rectangle{
        public double width;
        public double height;
    
    }
    class AreaCalculator{
        public double calculaterectangleArea(Rectangle rectangle){
            return rectangle.width*rectangle.height;
        }
    }
    
    // ¡que esta mal?Si queremos agregar mas formas (circulo,triangulo), tendriamos que modificar area calculate
    
}
