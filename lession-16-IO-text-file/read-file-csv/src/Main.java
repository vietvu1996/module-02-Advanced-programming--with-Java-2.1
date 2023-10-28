import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter file path you want to read:");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();

        readFileCSV reader = new readFileCSV();
        reader.Reader(filePath);
    }
}