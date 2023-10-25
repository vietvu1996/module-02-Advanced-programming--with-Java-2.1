import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static int binarySearch(int[] list, int value){
        int left = 0;
        int right = list.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(list[mid] == value){
                return mid;
            } else if (value < list[mid]) {
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }
}
