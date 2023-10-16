public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(){

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public double[] getXY(){
        double[] output = {this.x, this.y};
        return output;
    }

    @Override
    public String toString() {
        return "+ position: (" + this.x + "," + this.y + ")" + "\n";
    }
}
