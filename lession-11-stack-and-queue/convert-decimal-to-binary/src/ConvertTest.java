public class ConvertTest {
    public static void main(String[] args) {
        ConvertToBinary<Integer> a = new ConvertToBinary<>();
        System.out.println(a.convertDecimalToBinary(10));
        System.out.println(a.convertBinaryToDecimal(1000));
        System.out.println(a.convertDecimalToHexadecimal(10));
        System.out.println(a.convertHexadecimalToDecimal("B"));
    }
}