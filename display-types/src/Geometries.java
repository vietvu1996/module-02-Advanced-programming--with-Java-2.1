import java.util.Scanner;

public class Geometries {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        String star = "*";
        String result = "";
        System.out.println("""
                Menu:
                1. Print the rectangle
                2. Print the square triangle
                3. Print isosceles triangle
                4. Exit
                Enter your choice:""");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print(star + " ");
                    }
                    System.out.println();
                }
            case 2:
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(star + " ");
                    }
                    System.out.println();
                }
                for (int i = 6; i >= 0; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(star + " ");
                    }
                    System.out.println();
                }
            case 3:
                for (int i = 0; i < 6; i++) {
                    for (int k = 0; k < 6 - i; k++) {
                        result += " ";
                    }
                    for (int j = i; j > 0; j--) {
                        result += star + " ";
                    }
                    result += "\n";
                }
                System.out.println(result);
            case 4:
                return;
        }
    }
}