public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Printing number: " + i + " " + Thread.currentThread().hashCode());
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("My thread interrupted");
        }
        System.out.println("My Thread run is over");
    }
}
