
package ejercicionumerosazar;

import java.util.Scanner;


public class Ejercicionumerosazar {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dim;
        
        System.out.println("Ingresse la dimension de la matriz");
        dim = leer.nextInt();
        
        int matrizA[][] =new int[10][10];
        int matrizB[][] =new int[10][10];
        
                llenar_matriz(matrizA,dim);
                llenar_matriz(matrizB,dim);
                
                mostrar_matriz(matrizA,dim);
                mostrar_matriz(matrizB,dim);
                
                sumar_matriz(matrizA, matrizB, dim);
                
    }
    
    public static void llenar_matriz(int [][] matriz, int dim){
    
        int columna;
        int fila;
    
        for(fila=0;fila<dim;fila++); 
            
            for(columna=0;columna<dim;columna++){
                matriz[fila][columna]= (int)(Math.random()*10+1);
                            
            }
    }
    public static void mostrar_matriz(int [][] matriz, int dim){
    
        int columna;
        int fila;
        
        System.out.println("MATRIZ");
        for(fila=0;fila<dim;fila++); 
            
            for(columna=0;columna<dim;columna++){
                System.out.print(matriz[fila][columna] + " ; ");
                            
            }
            System.out.println("");
            System.out.println("");
    }
    public static void sumar_matriz(int[][] a, int[][] b, int dim){
    
        int[][] r= new int[dim][dim];
        int f, c;
        
        for(f=0;f<dim;f++){
        
            for(c=0;c<dim;c++){
            
                r[c][f]=a[f][c]+b[f][c];
            }
        
        }
        
        mostrar_matriz(r,dim);
    
    }
}   
    



