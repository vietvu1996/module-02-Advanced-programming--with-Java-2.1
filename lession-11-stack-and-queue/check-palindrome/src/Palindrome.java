import java.util.Stack;

public class Palindrome {
    public boolean isPalindrome(String input){
        Stack<Character> characterStack = new Stack<>();
        input = input.toLowerCase();
        for (char a: input.toCharArray()) {
            characterStack.push(a);
        }
        int length = characterStack.size();
        for (int i = 0; i < length / 2; i++) {
            if(characterStack.pop() != characterStack.get(i)){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome1(String s){
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
