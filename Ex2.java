package ex1;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Ex2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int M[][];
        int pm = 0;
        int r = 0;
        M = new int [3][4];
        
        System.out.println("Digite los numeros de la matriz");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Matriz ["+(i + 1)+"]["+(j + 1)+"]: ");
                M[i][j] = leer.nextInt();
                if (comprobarprimo(M[i][j])) {
                    int may=M[i][j];
                    pm=may;
                }
                
            }
            
        }    
        
        
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                
                if (pm==M[i][j]) {
                    r++;
                }
                
                System.out.print(M[i][j]+ " ");
            }
            System.out.println("");
        }
        
        
        System.out.println("Se encontraron un total de "+pm+" numeros primos en la matriz");
        System.out.println("Se repite " + r);
        
    }
    
    static boolean comprobarprimo(int num) {
        boolean valido = false;
        int cont=0;
        for (int i = 1; i <= num; i++) {
            if (num % i ==0) {
                cont=cont+1;
            }
        }
        if (cont==2) {
            valido=true;
        }else{
            valido=false;
        }
        return valido;
    }
    
}
