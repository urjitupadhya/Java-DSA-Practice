import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.print("Enter The size of Array : ");

        Scanner sc = new Scanner(System.in);
        sc.close();

        int length = sc.nextInt();
        int start = 0;
        int end = length - 1;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
      
            System.out.println(Arrays.toString(arr));
        
    }

}
