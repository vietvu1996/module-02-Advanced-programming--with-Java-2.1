public class point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public point2D(){

    }

    public point2D(float x, float y) {
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
        return new double[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "(" + getX() + " ," + getY() + ")" + "\n";
    }
}
