public class point3D extends point2D {
    private float z = 0.0f;

    public point3D(){

    }
    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public double[] getXYZ() {
        double[] output = {getX(), getY(), this.z};
        return output;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + this.z + ")" + "\n";
    }
}
