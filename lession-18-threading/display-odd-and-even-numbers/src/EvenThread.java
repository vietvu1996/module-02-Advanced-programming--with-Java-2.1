public class EvenThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10 ; i+=2) {
                System.out.println("Even numbers is: " + i);
                Thread.sleep(10);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("My thread is run over");
    }
}
