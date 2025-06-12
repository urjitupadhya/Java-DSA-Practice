package loops;
import java.util.Scanner;
public class Alphabetcasecheck {
    public static void main(String[] args){
        Scanner Alpha=new Scanner(System.in);
        Alpha.close();
        String uru=Alpha.nextLine(); // It will Accept full line with spaces
               for (int i =0;i<uru.length();i++){
                char ch =uru.charAt(i);
        if(ch>='a' &&  ch<='z')
  {
              System.out.println("Character at " + i +" is in Lower case " );
    }
else if(ch>='A' &&  ch<='Z')
  {

       System.out.println("Character at " +i+"  Upper case ");
  }
else { 
  System.out.println("Character at " + i + " is not an alphabet letter.");
       
}}
}
}
