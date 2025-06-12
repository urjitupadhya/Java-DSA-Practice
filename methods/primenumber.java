package methods;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        System.out.println("Hello Guys!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberr = sc.nextInt();
        sc.close();
        checkPrime(numberr);
    }

    static void checkPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
