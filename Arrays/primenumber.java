import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        System.out.print("Enter the Number which you want to check : ");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        sc.close();

        if (isPrime(numb)) {
            System.out.println(numb + " is a Prime Number.");
        } else {
            System.out.println(numb + " is Not a Prime Number.");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;  }
}
