public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberGenerator());
        Thread t2 = new Thread(new NumberGenerator());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("My Thread is running");
        t1.start();
        t2.start();
    }
}