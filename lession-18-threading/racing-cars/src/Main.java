public class Main {
    public static void main(String[] args) {
        Car carA = new Car("Lamborghini");
        Car carB = new Car("Roll royce");
        Car carC = new Car("Kawasaki");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}