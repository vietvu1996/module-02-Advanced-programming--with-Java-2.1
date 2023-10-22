public class PalindromeTest {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String input = "redder";
        boolean isPalindrome = palindrome.isPalindrome(input);
        if(isPalindrome){
            System.out.println("This string is Palindrome");
        }
        else {
            System.out.println("This string is not Palindrome");
        }
    }
}