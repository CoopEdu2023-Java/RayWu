package unit1;

import java.util.Scanner;

class PrimeFactorization {
    public static void primeFactorize(int number) {
        if (number <= 1) {
            System.out.println("Input must be a positive integer greater than 1.");
            return;
        }

        System.out.print(number + " = ");

        // Divide out all factors of 2
        while (number % 2 == 0) {
            System.out.print(2);
            number /= 2;
            if (number > 1) System.out.print(" * ");
        }

        // Divide out odd factors from 3 onward
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i);
                number /= i;
                if (number > 1) System.out.print(" * ");
            }
        }

        // If number is still greater than 2, then it's prime
        if (number > 2) {
            System.out.print(number);
        }

        System.out.println(); // New line for cleaner output
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        primeFactorize(number);
    }
}
