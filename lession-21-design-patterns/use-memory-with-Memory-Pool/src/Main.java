public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();
        System.out.println("Start");
        gun.fireInPool();
        System.out.println("Game Over");
        System.out.println("Tocal bullet created: " + Bullet.count);
    }
}