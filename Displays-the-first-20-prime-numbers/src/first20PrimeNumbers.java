import java.util.Scanner;

public class first20PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố: ");
        int numbers = input.nextInt();
        short count = 0;
        int currNum = 2;
        String result = "";
        while(count < numbers){
            boolean isPrimeNumber = true;
            for (int i = 2; i <= Math.sqrt(currNum) ; i++) {
                if(currNum % i == 0){
                    isPrimeNumber = false;
                    break;
                }
            }
            if(isPrimeNumber){
                result += currNum + " ";
                count++;
            }
            currNum++;
        }
        System.out.println(result);
    }
}

