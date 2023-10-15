public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        System.out.println("Circle");
        System.out.println(circle.toString());
        System.out.println("Area of circle is: " + circle.getArea());
        System.out.println("Perimeter of circle is: " + circle.getCircus());
        System.out.println();

        Cylinder cylinder = new Cylinder(15,20);
        System.out.println("Cylinder");
        System.out.println(cylinder.toString());
        System.out.println("Area of cylinder is: " + cylinder.getArea());
        System.out.println("Volume of cylinder is: " + cylinder.getVolume());
    }
}
