package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese cantidad de numeros de para la serie de Fibonacci: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int primero = 0, segundo = 1;
        
        System.out.println("Esta es la serie de Fibonacci con " + n + " numeros: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.println(primero + " ");
            
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
            
        }
    }
    
}
