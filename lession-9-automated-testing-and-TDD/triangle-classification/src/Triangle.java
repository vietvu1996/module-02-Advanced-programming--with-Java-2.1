public class Triangle {
    private static boolean isTriangle(double side1, double side2, double side3) {
        return (side1 > 0 && side2 > 0 && side3 > 0) && ((side1 + side2 > side3) && (side1 + side3 > side2)
                && (side2 + side3 > side1));
    }
    public static String triangleClassifier(double side1, double side2, double side3){
        if(isTriangle(side1,side2,side3)){
            if(side1 == side2 && side2 == side3){
                return "equilateral triangle";
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                return "isosceles triangle";
            }
            else {
                return "Normal Triangle";
            }
        }
        else {
            throw new RuntimeException("It's not a triangle dude!");
        }
    }
}
