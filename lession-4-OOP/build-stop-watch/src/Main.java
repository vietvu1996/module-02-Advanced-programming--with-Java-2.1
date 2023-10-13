import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var stopWatch = new StopWatch();
        int choice;
        do{
            System.out.println("""
                    Menu:
                    1. Start
                    2. End
                    3. Get Elapsed Time
                    4. Exit""");
            System.out.println("Choose choice in menu: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    stopWatch.start();
                    System.out.println("Stop watch started");
                    break;
                case 2:
                    stopWatch.end();
                    System.out.println("Stop watch end");
                    break;
                case 3:
                    System.out.println("Elapsed Time is: " + stopWatch.getElapsedTime() + " millisecond ");
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}