package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.print("Enter The Size of Array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] Arrays = new int[size];
        for (int i = 0; i < size; i++) {
            Arrays[i] = sc.nextInt();
        }

        System.out.print("Enter the number For Searching : ");
        Scanner ssc = new Scanner(System.in);
        int num = ssc.nextInt();
        int index=0;
        boolean found = false;
        for(int i=0;i<size;i++)
{
if(Arrays[i]==num){
    found=true;
    System.out.println("Element is found  at "+ i );
}
}

if(!found){
    System.out.println("Element is not Found.....");
}

}
}// sc.close(); 
