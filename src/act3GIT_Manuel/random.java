package act3GIT_Manuel;

import java.util.Random;
import java.util.Scanner;

public class random {  
    
    public static void main(String[] args) {
        Random random = new Random();
        
       
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = random.nextInt(10) + 1;
            System.out.println(numeroAleatorio);
        }
        
        Scanner scanner = new Scanner(System.in);
        
        int num1 = 0, num2 = 0;
      
        while (true) {
            System.out.print("Introduce el primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = scanner.nextInt();

            if (num1 != num2) {
                break;
            } else {
                System.out.println("Los números deben ser distintos. Inténtalo de nuevo.");
            }
        }
        
       
        imprimirNumerosEntre(num1, num2);

        scanner.close();
    }
    
    
    public static void imprimirNumerosEntre(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i < b; i += 7) {
            System.out.println(i);
        }
    }
}
