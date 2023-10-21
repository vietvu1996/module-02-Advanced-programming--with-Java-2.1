public class Test {
    public static void main(String[] args) {
        MyGenericStack<Integer> reverse1 = new MyGenericStack<>();
        Integer[] array = {1,2,3,4,5};
        reverse1.reverse(array);
        System.out.println("Array was reversed is: ");
        for (int num: array) {
            System.out.println(num + " ");
        }
        MyGenericStack<String> reverse2 = new MyGenericStack<>();
        String[] name = {"Kane", "Harry", "Jason", "Peter", "Wendy"};
        reverse2.reverse(name);
        System.out.println("Array was reversed is: ");
        reverse2.printArray(name);
    }
}