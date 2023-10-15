public class Circle {
    private double radius = 0;
    private String color = "black";
    private String fillcolor = "white";

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String fillcolor) {
        this.radius = radius;
        this.color = color;
        this.fillcolor = fillcolor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFillcolor() {
        return fillcolor;
    }

    public void setFillcolor(String fillcolor) {
        this.fillcolor = fillcolor;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCircus(){
        return radius * 2 * Math.PI;
    }
    @Override
    public String toString() {
        return " + radius: " + getRadius() + "\n" +
                " + color: " + getColor() + "\n" + " + fillcolor: "
                + getFillcolor() + "\n";
    }
}