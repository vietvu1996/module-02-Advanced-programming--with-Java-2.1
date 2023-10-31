public class OddThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10 ; i+=2) {
                System.out.println("Odd numbers is: " + i);
                Thread.sleep(15);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("My thread is run over");
    }
}
