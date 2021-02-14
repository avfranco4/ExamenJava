package ex1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ex {
    
    private static int n;
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num = 2;
        int c = 0;
        
        System.out.println("Ingrese el limite del vector");
        n = leer.nextInt();
        
        System.out.println("\n Ingrese los elementos del vector");
        
        int[] A = new int [n];
        
        for(int i = 0; i< n; i++){
            
            System.out.println("Ingrese el elemnto A["+ (i + 1) +"] = ");    
            A[i] = leer.nextInt();
            
        }
        
        for(int i = 0; i< n; i++){
         System.out.print(A[i]+"\t");   
        }
        
        c = buscarVector(A, num);
        System.out.println("\nEl numero "+num+" se ha encontrado "+c+" veces en el vector");
        
    }
    
    public static int buscarVector(int[] B, int num){
        int c = 0;
       
        
        for (int i = 0; i < n; i++){
            
            if (B[i] == num){
                c = c + 1;
            }
            
        }
        
        return c;
        
    }
    
}
