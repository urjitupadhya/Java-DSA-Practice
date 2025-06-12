package Searching;
import java.util.Scanner;

public class Searcintwod {
    public static void main(String[] args) {
        System.out.print("Enter The rows for matrix : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.print("Enter The Colunmns for matrix : ");
        int Colunmns = sc.nextInt();
        int[][] arr = new int[rows][Colunmns];
        System.out.println("Enter The Elements of rows and columns : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < Colunmns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

System.out.print("Enter the Elements for search : ");
int element=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < Colunmns; j++) {
                System.out.print("  " + arr[i][j]);

            }
            System.out.println();
        }
        boolean flag=false;
     for (int i = 0; i < rows; i++) {
            for (int j = 0; j < Colunmns; j++) {
               if( arr[i][j]==element){
                System.out.println("Element found at : "+i +"  "+ j);
                flag=true;
               }

            }
        }
        if(!flag){
            System.out.println("Element not found ");

        }
    }

}
