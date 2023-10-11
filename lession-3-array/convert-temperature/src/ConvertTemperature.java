import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("""
                    Menu.
                    1. Fahrenheit to Celsius
                    2. Celsius to Fahrenheit
                    0. Exit
                    Enter your choice:""");
            choice = input.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Enter celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    return;
            }
        }while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
