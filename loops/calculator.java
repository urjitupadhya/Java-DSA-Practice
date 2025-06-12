package loops;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        System.out.print("Enter The Number 1 : ");
        Scanner num1 = new Scanner(System.in);
        num1.close();
        int numbe = num1.nextInt();

        System.out.print("Enter The Number 2 : ");
        Scanner num2 = new Scanner(System.in);
        num2.close();
        int number = num2.nextInt();

        System.out.print("Enter The operator : ");
        Scanner operatorr = new Scanner(System.in);
        operatorr.close();
        String opp = operatorr.next();

        int ans = 0;
        boolean valid = true;

        if (opp.equals("+")) {
            ans = numbe + number;
        }
        if (opp.equals("-")) {
            ans = numbe - number;
        }
        if (opp.equals("*")) {
            ans = numbe * number;
        }
        if (opp.equals("/")) {
            ans = numbe / number;
        }
        if (valid)
            System.out.println(ans);
    }
}
