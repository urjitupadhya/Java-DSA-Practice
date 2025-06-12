//find the number with Even number of digit 
package Searching;
import java.util.Scanner;

public class EvenDigitNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int evenDigitCount = 0;

        // Count numbers with even digits
        for (int num : arr) {
            if (isEvenDigits(num)) {
                evenDigitCount++;
            }
        }

        System.out.println("Numbers with even number of digits: " + evenDigitCount);
    }

    // Method to check if a number has even digits
    static boolean isEvenDigits(int num) {
        int digits = String.valueOf(Math.abs(num)).length();
        return digits % 2 == 0;
    }



static void  findnumber(int nums[]){
    int count=0;

}

// count number of digits •in a number
static int digits(int num) {
int count = 0;
while (num > 0) {
count++ ;
num = num / 10;}
return count;


    }}