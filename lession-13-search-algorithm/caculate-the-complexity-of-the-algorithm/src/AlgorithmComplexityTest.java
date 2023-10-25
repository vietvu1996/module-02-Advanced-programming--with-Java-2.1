import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();

        int[] Character = new int[255];
        for (int i = 0; i < input.length(); i++) {
            int ascii = input.charAt(i);
            Character[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (Character[j] > max) {
                max = Character[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is: " + character +
                " with a frequency of " + max + " times ");
    }
}