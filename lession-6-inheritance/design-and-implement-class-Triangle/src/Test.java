import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Triangle triangle = getTriangle();
        System.out.println("Vui lòng nhập màu: ");
        triangle.setColor(scanner.nextLine());
        System.out.println("Có muốn fill tam giác không Y/N");
        String option = scanner.nextLine();
        switch (option){
            case "y" : case "Y":
            break;
            default:
                triangle.setFilled(false);
                break;
        }
        System.out.println("\n \n" + triangle);
    }
    private static Triangle getTriangle(){
        System.out.println("Nhập 3 cạnh: ");
        String input = scanner.nextLine();
        if(!input.matches("^(?:[0-9],){2}[0-9]")) {
            System.out.println("Không hợp lệ");
            System.out.println("Nhập 3 cạnh:");
            input = scanner.nextLine();
        }
        String[] triangle = input.split(",");
        Triangle outTriangle = new Triangle(Double.parseDouble(triangle[0]),
                Double.parseDouble(triangle[1]),
                Double.parseDouble(triangle[2]));
        if(!outTriangle.isValid()){
            System.out.println("Tam giác không hợp lệ");
            outTriangle = getTriangle();
        }
        return outTriangle;
    }
}