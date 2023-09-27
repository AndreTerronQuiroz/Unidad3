package numeroimparopar;


import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Por favor, ingrese un numero entero: ");
        
        
        int numero = scanner.nextInt();

        
        scanner.close();

        
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
    }
}
