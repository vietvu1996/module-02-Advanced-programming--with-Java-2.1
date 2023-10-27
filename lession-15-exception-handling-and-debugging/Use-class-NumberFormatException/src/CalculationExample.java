import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        CalculationExample calculate = new CalculationExample();
        calculate.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum of x + y: " + a);
            System.out.println("Difference of x - y: " + b);
            System.out.println("Product of x * y: " + c);
            System.out.println("Quotient of x / y: " + d);
        } catch (ArithmeticException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}