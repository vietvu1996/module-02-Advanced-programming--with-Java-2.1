import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array:");
        int input = scanner.nextInt();

        int[] array = new int[input];
        for (int i = 0; i < input; i++) {
            System.out.println("Enter value: ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Array after sorted is: ");
        for (int i = 0; i < input; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.println(binarySearch(array, 0, input - 1, 2));
        System.out.println(binarySearch(array, 0, input - 1, 7));
        System.out.println(binarySearch(array, 0, input - 1, 10));
        System.out.println(binarySearch(array, 0, input - 1, 13));
        System.out.println(binarySearch(array, 0, input - 1, 5));
    }

    public static int binarySearch(int[] array, int left, int right, int value){
        int middle;
       while (left <= right){
            middle = (left + right) / 2;
            if(value == array[middle]) return middle;
            else if (value > array[middle]) {
                left = middle + 1;
            }
            else right = middle - 1;
       }
       return -1;
    }
}