public class Main {
    public static void main(String[] args) {
        createFan fan1 = new createFan(3,true,10,"yellow");
        createFan fan2 = new createFan(2,false, 5, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}