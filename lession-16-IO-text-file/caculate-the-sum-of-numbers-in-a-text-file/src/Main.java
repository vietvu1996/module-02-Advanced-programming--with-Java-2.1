import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter file path: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}