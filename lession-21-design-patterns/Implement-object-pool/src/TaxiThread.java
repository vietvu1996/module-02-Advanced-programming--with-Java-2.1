import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TaxiThread implements Runnable {
    private final TaxiPool taxipool;

    public TaxiThread(TaxiPool taxipool){
        this.taxipool = taxipool;
    }

    @Override
    public void run() {
        takeATaxi();
    }

    private int randInt(){
        return new Random().nextInt((1500 - 1000) + 1) + 1000;
    }

    public void takeATaxi(){
        try {
            System.out.println("New Client" + Thread.currentThread().getName());
            Taxi taxi = taxipool.getTaxi();
            TimeUnit.MICROSECONDS.sleep(randInt());
            taxipool.release(taxi);
            System.out.println("Served the client: " + Thread.currentThread().getName());
        }
        catch (InterruptedException | TaxiNotFoundException e){
            System.out.println(">>> Rejected the client: " + Thread.currentThread().getName());
        }
    }
}
