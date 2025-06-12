package loops;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        num.close();
        int Numb = num.nextInt();
        int reverse = 0;
        while (Numb > 0) {
            int digit = Numb % 10;
            Numb = Numb / 10;
            reverse = reverse * 10 + digit;

        }
        System.out.println(reverse);
    }

}
