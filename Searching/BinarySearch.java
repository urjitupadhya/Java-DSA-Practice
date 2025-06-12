package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Input array size
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // Declare and initialize the array
        int arr[] = new int[size];

        // target element
        System.out.println("Enter the element which you want to search : ");
        int target = sc.nextInt();

        inputarray(arr);
        int result = binary(arr, target);
        if (result != -1)
            System.out.println(result);
        else
            System.out.println("Element not found ");
    }

    static int binary(int arr[], int target) {
        int n = arr.length;
    
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int index = (start + end) / 2;

            if (arr[index] == target) {
                return index;
            } else if (arr[index] > target) {
                end = index - 1;

            } else {

                start = index + 1;
            }

        }
        return -1;
    }

    static void inputarray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    // static void sortarray(int arr[]) {
    // for (int i = 0; i < arr.length - 1; i++) {

    // for (int j = 0; j < arr.length - 1 - i; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // }
}
