import java.util.Stack;

public class ConvertToBinary<E> {
    private Stack<Integer> stack = new Stack<>();

    public int convertDecimalToBinary(int decimal) {
        while (decimal != 0) {
            stack.push(decimal % 2);
            decimal /= 2;
        }
        int binary = 0;
        while (!stack.isEmpty()) {
            binary = (binary * 10 + stack.pop());
        }
        return binary;
    }

    public int convertBinaryToDecimal(long binary) {
        int decimal = 0;
        int n = 0;

        while (binary != 0) {
            long temp = binary % 10;
            decimal += (int) (temp * Math.pow(2, n));
            binary /= 10;
            n++;
        }
        return decimal;
    }

    public String convertDecimalToHexadecimal(long numberInput){
        StringBuilder hexadecimal = new StringBuilder();
        String hexDigits = "0123456789ABCDEF";
        while (numberInput != 0){
            int remainder = (int) (numberInput % 16);
            hexadecimal.append(hexDigits.charAt(remainder));
            numberInput /= 16;
        }
        return hexadecimal.toString();
    }

    public int convertHexadecimalToDecimal(String hexadecimal){
        int decimal = 0;
        int n = 0;
        String hexDigits = "0123456789ABCDEF";
        for (int i = hexadecimal.length() - 1; i >= 0 ; i--) {
            int remainder = hexDigits.indexOf(hexadecimal.charAt(i));
            decimal += (int) (remainder * Math.pow(16, n));
            n++;
        }
        return decimal;
    }
}
