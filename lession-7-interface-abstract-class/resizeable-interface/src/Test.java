public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.0);
        System.out.println("Area and Perimeter before increased percents");
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        double percent = 50;
        circle.resize(percent);
        System.out.println("Area and Perimeter after increased percents");
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2,3);
        System.out.println("Area and Perimeter of rectangle before increase percent");
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        rectangle.resize(percent);
        System.out.println("Area and Perimeter of rectangle after increased percents");
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square square = new Square();
        System.out.println(square);
        square = new Square(2);
        System.out.println("Area and Perimeter of square before increase percent");
        System.out.println(square.getArea());

        square.resize(percent);
        System.out.println("Area and Perimeter of rectangle after increased percents");
        System.out.println(square.getArea());
    }
}
