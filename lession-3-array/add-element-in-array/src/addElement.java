import java.util.Arrays;
import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
//        int[] array;
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter array, divide by coma");
//        String strInput = input.nextLine();
//        strInput = strInput.replaceAll(" ", "");
//        String[] strings = strInput.split(",");
        int[] array = new int[8];
        System.out.println("Current array is: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Input add value: ");
        int valueAdd = input.nextInt();
        System.out.println("Input position");
        int position = input.nextInt();
//        int newIndex = 0;
//        int countAppear = count(array, valueAdd);
        int[] arrNew = new int[array.length + 1];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i != position) {
                arrNew[j] = array[i];
            } else {
                arrNew[j] = valueAdd;
                arrNew[j + 1] = array[i];
                j++;
            }
            if (valueAdd != arrNew[j]) {
                    arrNew[arrNew.length-1]= valueAdd;
                }
//        for (int i = 0; i < array.length; i++) {
//            if (position == i){
//                arrNew[newIndex] = valueAdd;
//                newIndex++;
//            }
//                arrNew[newIndex] = array[i];
//                newIndex++;
//                else {
//
//            }
//            for (int j = 0; j < arrNew.length; j++) {
//                if (valueAdd != arrNew[j]) {
//                    valueAdd = arrNew.length - 1;
//                }
//            }
        }
        System.out.println("Your new array");
        for (int num : arrNew) {
            System.out.print(num + " ");
        }
    }

//    public static int count(int[] arr, int value){
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == value) {
//                count++;
//            }
//        }
//        return count;
//    }
}
