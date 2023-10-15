public class Cylinder extends Circle  {
    private double height = 0;

    public Cylinder(){

    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, String fillcolor, double height) {
        super(radius, color, fillcolor);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getCircus() * height;
    }
    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString() + " + height: " + getHeight() + "\n" ;
    }
}
