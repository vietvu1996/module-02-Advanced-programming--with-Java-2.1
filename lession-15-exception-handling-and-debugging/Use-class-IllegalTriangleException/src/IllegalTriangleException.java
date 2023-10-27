public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super();
    }
    @Override
    public String getMessage() {
        return "Your enter is wrong! ";
    }
}
