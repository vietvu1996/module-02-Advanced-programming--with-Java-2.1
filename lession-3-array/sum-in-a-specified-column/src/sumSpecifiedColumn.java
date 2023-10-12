import java.util.Scanner;

public class sumSpecifiedColumn {
    public static void main(String[] args) {
        int rows;
        int column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        column = scanner.nextInt();
        double[][] matrix = new double[rows][column];
        System.out.println("The matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = Math.floor(Math.random()* 10000)/100;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Enter the column index to sum: ");
        int columnIndex = scanner.nextInt();
        if(columnIndex > column){
            System.out.println("Invalid column index. Please enter a column index less than " + column);
            return;
        }
        else {
            double sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][columnIndex - 1];
            }
            System.out.println("Sum of the elements in column " + columnIndex + " is " + sum);
        }
    }
}
