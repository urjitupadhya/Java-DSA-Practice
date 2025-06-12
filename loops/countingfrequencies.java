package loops;
import java.util.Scanner;
public class countingfrequencies {
public static void main (String[] args){
    System.out.print("Enter the Number :  ");
    Scanner Num=new Scanner(System.in);
    Num.close();
    int num=Num.nextInt();
    int [] freq =new int[10];
    while(num>0)
{
int digit =num%10;
freq[digit]++;
num/=10;
}

System.out.println("Digital Frequencies : ");
  for (int i = 0; i < 10; i++) {
   if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i] + " time(s)");
     } } }
}


