import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array: ");
        String input = scanner.nextLine();
        System.out.println("The maximum of subsequence is: ");
        System.out.println(maximumSub(input));
    }

    public static String maximumSub(String input){
        StringBuilder string = new StringBuilder();
        char result = input.charAt(0);
        string.append(result);
        for (int i = 1; i < input.length(); i++) {
            char j = input.charAt(i);
            if(j > result) {
                string.append(j);
                result = j;
            }
        }
        return string.toString();
    }
}