public class primeNumber {
    public static void main(String[] args) {
        int number = 100; // Số lượng số nguyên tố cần in ra
        int countPrime = 0; // Biến đếm số nguyên tố
        System.out.print("Prime numbers from 1 to " + number + ": ");

        for (int i = 2; i <= number; i++) {
            int countDivisor = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countDivisor++;
                }
            }

            if (countDivisor == 2) {
                countPrime++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nThere are " + countPrime + " prime numbers from 1 to " + number);
    }
}
