import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của 1 phần tử bất kì: ");
        int x = scanner.nextInt();
        try{
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng ");
        }
    }

    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List element of array is: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}