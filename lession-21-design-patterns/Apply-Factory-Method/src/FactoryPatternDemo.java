public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();
        Shape circle = shape.getShape("circle");
        circle.draw();


        Shape square = shape.getShape("square");
        square.draw();


        Shape rectangle = shape.getShape("rectangle");
        rectangle.draw();
    }
}