public class fizzBuzz {
    public static boolean isPositiveInteger(int number) {
        return number > 0;
    }

    public static String fizzBuzzTranslate(int number) {
        if (isPositiveInteger(number)) {
            if (number % 15 == 0) {
                return "FizzBuzz";
            } else if (number % 5 == 0) {
                return "Buzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            } else return "" + number;
        } else throw new RuntimeException("This is not a positive Integer");
    }

    private static String convertNumberToWord(int number) {
        String[] newWord = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        return newWord[number];
    }

    public static String convertNumbersToWord(int number) {
        String numberString = Integer.toString(number);
        StringBuilder result = new StringBuilder();

        if (isPositiveInteger(number) && number < 100) {
            for (int i = 0; i < numberString.length(); i++) {
                int a = Integer.parseInt(String.valueOf(numberString.charAt(i)));

                if (a == 3 || a == 5)
                    result.append(fizzBuzzTranslate(a));
                else {
                    result.append(convertNumberToWord(a));
                }
            }
            return result.toString();
        } else throw new RuntimeException("Not a positive number or number is larger than 100");
    }
}
