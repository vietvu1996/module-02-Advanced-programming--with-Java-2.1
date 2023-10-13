public class createFan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSlow() {
        return slow;
    }
    public int getMedium() {
        return medium;
    }
    public int getFast(){
        return fast;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public createFan(){

    }
    public createFan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    @Override
    public String toString() {
        String result = " ";
        if(this.isOn()){
            result += "Fan is on\n";
        }
        else {
            result += "Fan is off\n";
        }
        result += "Speed is: " + this.speed + "\n";
        result += "Radius is: " + this.radius + "\n";
        result += "Color is: " + this.color + "\n";
        return result;
    }
}
