import java.util.Scanner;
public class day1{
    public static void main (String[] args ){
        
        System.out.print("Enter the Integer : ");
        Scanner input=new Scanner(System.in);
        System.out.println(input.nextLine());

        System.out.print("Enter the String : ");
        String name=input.nextLine();
        System.out.println(name);


        System.out.println("Enter the floating number : ");
        float num=input.nextFloat();
         System.out.println(num);

 
          input.close();

    }

}