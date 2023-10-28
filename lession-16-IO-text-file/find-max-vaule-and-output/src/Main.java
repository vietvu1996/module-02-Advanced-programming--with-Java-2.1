import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter file path: ");
        Scanner scanner1 = new Scanner(System.in);
        String path1 = scanner1.nextLine();

        System.out.println("Maxvalue in file path");
        Scanner scanner2 = new Scanner(System.in);
        String path2 = scanner2.nextLine();

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(path1);
        int maxValue = ReadAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile(path2, maxValue);
    }
}