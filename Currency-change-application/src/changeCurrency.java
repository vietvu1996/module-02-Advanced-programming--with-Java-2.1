import java.util.Scanner;

public class changeCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd;
        double vnd = 23000;
        System.out.println("Mời bạn nhập số đô la: ") ;
        usd = scanner.nextDouble();
        double change = usd * vnd;
        System.out.println("Số tiền sau khi đổi là: " + change);
    }
}
