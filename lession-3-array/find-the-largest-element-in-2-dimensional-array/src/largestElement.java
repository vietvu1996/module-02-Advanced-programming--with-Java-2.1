import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        int rows;
        int columns;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of rows: ");
        rows = input.nextInt();
        System.out.println("Enter size of columns: ");
        columns = input.nextInt();
        double[][] matrix = new double[rows][columns];
        double max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (Math.floor(Math.random()*10000/100));
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
                System.out.print(matrix[i][j] + " " );
            }
            System.out.println();
        }
        System.out.println("The maximum value is: " + max);
    }
}
