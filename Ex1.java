package ex1;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int M[][];
        int c = 0;
        int num1, num2, num3; 
        M = new int [4][6];
        
        System.out.println("Digite los numeros de la matriz");
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 6; j++){
                System.out.println("Matriz ["+(i + 1)+"]["+(j + 1)+"]: ");
                M[i][j] = leer.nextInt();
                num1 = 0;
                num2 = 1;
                while (num2 + num1 <= 100) {
                    num3 = num1;
                    num1 = num2;
                    num2 = num3 + num1;
                    
                    if (M[i][j] == num2) {
                        c = c + 1;
                    }
                }
                
            }
            
        }
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(M[i][j] + "\t");
            }
            System.out.println("");
        }
            
        
        System.out.println("Los números que coincidieron con la secuencia fibonacci fueron: " + c);
        
    }
    
}
