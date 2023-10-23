import java.util.Stack;

public class checkBracket {
    static Stack<Character> bStack = new Stack<>();


    public static boolean CheckBracket(String input) {
        for (char sym : input.toCharArray()) {
            if (sym == '(') bStack.push(sym);
            else if (sym == ')') {
                if (bStack.isEmpty()) {
                    return false;
                }
                char left = bStack.pop();
                if (left != '(') {
                    return false;
                }
            }
        }
        return bStack.isEmpty();
    }
}




