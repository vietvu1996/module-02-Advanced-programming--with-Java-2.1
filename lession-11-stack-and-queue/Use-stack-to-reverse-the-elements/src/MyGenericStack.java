import java.util.Stack;

public class MyGenericStack<E> {
    Stack<E> stack = new Stack<>();
    Stack<E> wstack = new Stack<>();

    public void reverse(E[] array){
        for (E element: array){
            stack.push(element);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }
    public void printArray(E[] array){
        StringBuilder a = new StringBuilder();
        a.append("[");
        for (int i = 0; i < array.length; i++) {
            a.append(array[i]);
            if (i < array.length - 1)
                a.append(", ");
        }
        a.append("]");
        System.out.println(a);
    }
}