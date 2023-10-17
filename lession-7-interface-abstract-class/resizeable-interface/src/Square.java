public class Square extends Rectangle implements Resizeable {
    private double side = 1;

    public Square(){

    }
    public Square(double side){
        this.side = side;
    }

    public Square(double width, double length, double side) {
        super(width, length);
        this.side = side;
    }

    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side * side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        side *= percent/200;
    }
}
