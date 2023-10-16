public class Main {
    public static void main(String[] args) {
        point2D point = new point2D(3,4);
        System.out.println(point);
        point = new point3D(point.getX(), point.getY(), 10);
        System.out.println(point);
    }
}