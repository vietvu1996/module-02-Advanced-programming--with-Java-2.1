public class quadraticEquation {
    int a, b, c;
    public quadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    private double getDiscriminant(){
        return Math.pow(b,2) - 4 * a * c;
    }
    private double getRoot1(){
        return (-b + Math.sqrt(Math.pow(b,2)- 4 * a * c))/2 * a;
    }
    private double getRoot2(){
        return (-b - Math.sqrt(Math.pow(b,2)- 4 * a * c))/2 * a;
    }
    private boolean isDeltaEqual0(){
        return (getDiscriminant() == 0);
    }

    private boolean isDeltaLess0(){
        return (getDiscriminant() < 0);
    }
    public void calculateRoot(){
        if (isDeltaLess0()){
            System.out.println("There is no root");
        } else if (isDeltaEqual0()) {
            System.out.println("There is 1 root; root1 = root2 = " + getRoot2());
        } else  {
            System.out.println("Root 1 = " + getRoot1());
            System.out.println("Root 2 = " + getRoot2());
        }
    }
}
