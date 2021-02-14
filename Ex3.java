package ex1;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ex3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int [][]M;
        int n;
        int nr = 0;
        int col = 0;
        int fil = 0;
        
        System.out.println("Digite el limite de la matriz");
        n=leer.nextInt();
        M = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Matriz ["+(i + 1)+"]["+(j + 1)+"]: ");
                M[i][j] = leer.nextInt();  
            }    
        } 
        
        
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                
                    System.out.print(M[i][j] + "\t");    
            }
            System.out.println("");
        }
        
        System.out.print("Los numeros que no se repiten son: ");
        
        while(fil<n && col<n){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(M[fil][col]==M[i][j]){
                        nr++;
                    }
                }
            }
            if(nr==1){
                System.out.print(M[fil][col]+" ");
            }
            if(fil<n && col==n-1){
                fil++;
            }
            if(col<n-1){
                col++;
            }else{
                col=0;
            }
            nr=0;
        }
        
        System.out.println("");
        
    }    
    
    
        
    
}
