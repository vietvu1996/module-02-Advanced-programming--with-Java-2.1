import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1:");
        int side1 = scanner.nextInt();
        System.out.println("Enter side2: ");
        int side2 = scanner.nextInt();
        System.out.println("Enter side3: ");
        int side3 = scanner.nextInt();

        System.out.println(Calculate(side1, side2, side3));
    }

    public static boolean Calculate(int side1, int side2, int side3)  {
        try {
            if ((side1 > 0 && side2 > 0 && side3 > 0) && ((side1 + side2 > side3) &&
                    (side1 + side3 > side2) && (side2 + side3 > side1)))
                return true;
            else throw new IllegalTriangleException();
        } catch (IllegalTriangleException e) {
            System.out.println(" Xảy ra ngoại lệ: " + e.getMessage());
        }
        return false;
    }
}