
package dia_8;


public class Dia_8 {

    
    public static void main(String[] args) {
        // Estructura de datos 
        // Estructura de datos  es una forma organizada de almacenar , gestionar
        //y manipular datos para que  pueda ser utilizadas de manera eficiente

        
        
        // Arreglos 
        // un arreglo es una estructura de datos que posibilita la 
        //agrupacion de elementos del mismo tipo en una sola variable.
        int[] arreglit;
        // un arreglo se debe inicializar para que tenga un espacio de memoria
        
        int[] arreglito2= new int [5];
        arreglito2[0]=0;
        System.out.println(arreglito2[0]);
        System.out.println(arreglito2.length);
        
        for (int i = 0; i < arreglito2.length; i++) {
            System.out.println(arreglito2[i]);
            
        }
        
        // Matriz 
        // son arreglos multidimensionales donde en java
        //se crea comunmente los de dos dimensiones
        int cantidadFila=3;
        int cantidadcol=2;
        int [][] matriz= new int [cantidadFila][cantidadcol];
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[1][0]=3;
        matriz[1][1]=4;
        matriz[2][0]=5;
        matriz[2][1]=6;
        
        for (int i = 0; i < cantidadFila; i++) {
            for (int j = 0; j < cantidadcol; j++) {
                System.out.println(matriz[i][j]);
                
            }
            
        }
    }
    
}
