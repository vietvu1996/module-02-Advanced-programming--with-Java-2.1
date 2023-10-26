import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int j : list) {
            System.out.print(j + " ");
        }
        System.out.println();


        System.out.print("List after sorted is: ");
        bubbleSortByStep(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        while (needNextPass) {
            needNextPass = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
            System.out.println("Array may be sorted and next pass not needed");
        }
    }
}