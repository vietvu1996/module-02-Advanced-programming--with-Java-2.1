

public class addArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        System.out.println("Current array 1 is: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.floor(Math.random() * 20);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int[] array2 = new int[5];
        System.out.println("Current array 2 is: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) Math.floor(Math.random() * 20);
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println("Current array 3 is: ");
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < (array1.length+ array2.length); i++) {
           if(i >= array1.length){
               array3[i]=array2[i- array1.length];
           }
           else {
               array3[i]=array1[i];
           }
            System.out.print(array3[i]+ " ");
        }
        }
    }
