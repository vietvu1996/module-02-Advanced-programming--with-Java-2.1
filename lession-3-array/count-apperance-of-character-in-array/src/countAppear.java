import java.util.Scanner;

public class countAppear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words");
        String strInput = scanner.nextLine();
        strInput = strInput.replaceAll(" ", "");
        String[] strings = strInput.split(",");
        String[] array = new String[strings.length];
        System.out.println("Current array is: ");
        for (int i = 0; i < strings.length; i++) {
            array[i] = String.valueOf(strings[i]);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Input a word to find: ");
        String wordFind = scanner.nextLine();
        int count = 0;
        System.out.println("Times appearance of word is: ");
        for (int i = 0; i < strings.length; i++) {
            if(wordFind.equals(array[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
