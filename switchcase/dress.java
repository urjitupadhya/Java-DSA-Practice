package switchcase;
import java.util.Scanner;

public class dress {
    public static void main(String[] args) {
        System.out.print("Enter the dress purchased by Urjit Don: ");
        Scanner dressScanner = new Scanner(System.in);
        String dress = dressScanner.nextLine();

        switch (dress) {
            case "Blue":
                System.out.println("You looked sharp in the blue outfit.");
                break;

            case "dusriblue":
                System.out.println("That other blue one was decent, but not exceptional.");
                break;

            case "pinkshirt":
                System.out.println("The pink shirt actually suited you well!");
                break;

            case "vohvali":
                System.out.println("That one looked stylish too.");
                break;

            default:
                System.out.println("Today’s choice was bold and unique!");
        }

        dressScanner.close();
    }
}
