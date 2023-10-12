import java.util.Scanner;

public class sumDiagonals {
    public static void main(String[] args) {
        int rows;
        int columns;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of rows: ");
        rows = input.nextInt();
        System.out.println("Enter size of columns: ");
        columns = input.nextInt();
        System.out.println("Square Matrix is: ");
        double[][] matrix = new double[rows][columns];
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (Math.floor(Math.random() * 10000 / 100));
                System.out.print(matrix[i][j] + " " );
            }
            System.out.println();
        }
        System.out.print("Sum of main diagonals is: ");
        for (int i = 0; i < rows;) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
                i++;
            }
        }
        System.out.println(sum);
    }
}
