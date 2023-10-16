public class Main {
    public static void main(String[] args) {
        Point unknowpoint = new Point(20,30);
        System.out.println(unknowpoint);
        unknowpoint.setXY(10,20);
        System.out.println(unknowpoint);
        unknowpoint = new MoveablePoint(unknowpoint.getX(), unknowpoint.getY(), 10, 20);
        System.out.println(unknowpoint);
        ((MoveablePoint)unknowpoint).move();
        System.out.println(unknowpoint);
        MoveablePoint anotherPoint = new MoveablePoint(20, 20);
        System.out.println(anotherPoint);
        anotherPoint.move();
        System.out.println(anotherPoint);
    }
}