import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kiên", 30, "Hà Tĩnh");
        Student student1 = new Student("Nam", 26, "Hà Nội");
        Student student2 = new Student("Anh", 38, "Hà Tĩnh");
        Student student3 = new Student("Tùng", 38, "Hà Tĩnh");

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println("Danh sách sinh viên trước khi sắp xếp");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Danh sách sinh viên sau khi sắp xếp");
        System.out.println(list);

        AgeComparator ageComparator = new AgeComparator();
        list.sort(ageComparator);
        System.out.println("So sánh theo tuổi");
        System.out.println(list);
    }
}