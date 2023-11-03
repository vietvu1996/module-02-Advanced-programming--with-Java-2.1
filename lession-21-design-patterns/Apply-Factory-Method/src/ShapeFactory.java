public class ShapeFactory {
    public Shape getShape(String shape){
        if("circle".equals(shape)){
            return new Circle();
        } else if ("square".equals(shape)) {
            return new Square();
        } else if ("rectangle".equals(shape)) {
            return new Rectangle();
        }
        return null;
    }
}
