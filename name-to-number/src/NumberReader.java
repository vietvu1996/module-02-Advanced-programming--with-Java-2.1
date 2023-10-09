import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập các số: ");
        String num = scanner.nextLine();
        int numLength = num.length();
        String result = "";
        String[] number = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] unit = {"", "", "hundred", "thousand"};

        for (int i = numLength; i > 0; i--) {
            int x = Integer.parseInt(String.valueOf(num.charAt(numLength - i)));
            if (i == 2) {
                if (x == 1) {
                    result += number[Integer.parseInt(num.substring(numLength - 2))];
                    break;
                } else {
                    result += tens[x] + " ";
                }
            } else {
                result += number[x] + " " + unit[i - 1] + " ";
            }
        }
        System.out.println(result);
    }
    }