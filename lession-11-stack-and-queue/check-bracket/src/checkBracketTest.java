public class checkBracketTest {
    public static void main(String[] args) {
        String input1 = "s * (s – a) * (s – b) * (s – c)";
        String input2 = "()((())(()";
        System.out.println("Input1 is valid: " + checkBracket.CheckBracket(input1));
        System.out.println("Input2 is valid: " + checkBracket.CheckBracket(input2));
    }
}