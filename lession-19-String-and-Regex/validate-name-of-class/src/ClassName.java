import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASS_NAME = "^[CAP]\\d{4,}[GHIK]$";

    public ClassName(){}

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter classname: ");
        String input = scanner.nextLine();
        ClassName classname = new ClassName();
        boolean isValid = classname.validate(input);
        System.out.println("Class name: " + input + " is " + isValid);
    }
}