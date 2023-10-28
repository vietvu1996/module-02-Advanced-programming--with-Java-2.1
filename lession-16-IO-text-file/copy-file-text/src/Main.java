import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter file path you want to copy: ");
        Scanner scanner1 = new Scanner(System.in);
        String sourceFilePath = scanner1.nextLine();

        System.out.println("Enter file path you want to write: ");
        Scanner scanner2 = new Scanner(System.in);
        String targetFilePath = scanner2.nextLine();

        copyfileText copyfile = new copyfileText();
        copyfile.copyFile(sourceFilePath, targetFilePath);
        copyfile.copyFileText(sourceFilePath, targetFilePath);
    }
}