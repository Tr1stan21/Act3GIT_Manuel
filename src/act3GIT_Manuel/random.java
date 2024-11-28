package act3GIT_Manuel;

import java.util.Random;
import java.util.Scanner;

public class random { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 30; i++) {  
            int numeroAleatorio = random.nextInt(10) + 1;
            System.out.println(numeroAleatorio);
        }

        int num1 = 0, num2 = 0, num3 = 0;

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

        System.out.print("Introduce el tercer número: ");
        num3 = scanner.nextInt();

        if ((num3 > num1 && num3 < num2) || (num3 > num2 && num3 < num1)) {
            System.out.println("El tercer número " + num3 + " está entre " + num1 + " y " + num2);
        } else {
            System.out.println("El tercer número " + num3 + " no está entre " + num1 + " y " + num2);
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
