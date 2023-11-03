public class Main {
    public static final int NUMBER_OF_CLIENT = 8;

    public static void main(String[] args) {
        TaxiPool taxipool = new TaxiPool();
        for (int i = 1; i < NUMBER_OF_CLIENT; i++) {
            Runnable client = new TaxiThread(taxipool);
            Thread thread = new Thread(client);
            thread.start();
        }
    }
}