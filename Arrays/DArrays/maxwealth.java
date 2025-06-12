package DArrays;

import java.util.Arrays;
import java.util.Scanner;

public class maxwealth {
public static void main(String[] args) {
      System.out.print("Enter The Number of Customer  : ");
      Scanner var1 = new Scanner(System.in);
      int customer = var1.nextInt();
      System.out.print("Enter The Accounts by customer : ");
      Scanner var3 = new Scanner(System.in);
      int Accounts = var3.nextInt();
      int[][] bank = new int[customer][Accounts];
      System.out.println("Enter The Elements of 2-D Arrays : ");
for(int i=0;i<customer;i++){
    for(int j=0;j<Accounts;j++){
        bank[i][j]=var1.nextInt();
    }
}

int max=Integer.MIN_VALUE;
// System.out.println("[");
for(int i=0;i<customer;i++){
    int sum=0;
  
    for(int j =0;j<Accounts;j++)
    sum+=bank[i][j];



if (sum >max){
     max=sum;
    }
}
System.out.println("SUM IS : "+ max);
}
}
