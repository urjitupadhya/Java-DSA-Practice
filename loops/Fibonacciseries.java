package loops;
import java.util.Scanner;

public class Fibonacciseries {
public static void main (String [] args ){
    System.out.print("Enter The Number Upto which You Want Series : ");
    Scanner Number=new Scanner(System.in);
    Number.close();
 int num=Number.nextInt();
   int a=0;
   int b=1;
   int next =a+b;
 while (next <num){
System.out.println(next +" " );
a=b;
b=next;
next=a+b;
 }
 
 
 
 
 
}

// Scanner.close();
    
}
