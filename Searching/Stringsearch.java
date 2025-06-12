 package Searching;

import java.util.Scanner;

public class Stringsearch {
    public static void main(String[] args) {
        System.out.print("Enter The String :  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Enter the Character which u want to search : ");
        char ch = sc.next().charAt(0);
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {

            if (ch == str.charAt(i)) {
                System.out.println("Character found at index : " + i);
                found=true;
            }
        }
        if(!found){
            System.out.println("Not in this string ");
        }
    }
}