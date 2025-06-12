import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        // Create outer list
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Initialize rows
        for (int i = 0; i < 3; i++) {
            matrix.add(new ArrayList<>());  // Add empty row
        }

        // Add elements to each row
        matrix.get(0).add(1);
        matrix.get(0).add(2);
        matrix.get(0).add(3);

        matrix.get(1).add(4);
        matrix.get(1).add(5);
        matrix.get(1).add(6);

        matrix.get(2).add(7);
        matrix.get(2).add(8);
        matrix.get(2).add(9);

        // Print the 2D ArrayList
        System.out.println("2D ArrayList (Matrix):");
        for (ArrayList<Integer> row : matrix) {
            System.out.println(row);
        }
    }
}
