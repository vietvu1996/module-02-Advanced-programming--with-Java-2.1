import java.util.*;

public class Demerging implements Comparator<Student> {
    private final List<Student> males;
    private final List<Student> females;
    List<Student> combined;

    public Demerging() {
        males = new ArrayList<>();
        females = new ArrayList<>();
        combined = new ArrayList<>();
    }

    public void add(Student a1) {
        combined.add(a1);
    }

    public int compare(Student a1, Student a2) {
        int dayCompare = Integer.compare(a1.getDay(), a2.getDay());
        int monthCompare = Integer.compare(a1.getMonth(), a2.getMonth());
        int yearCompare = Integer.compare(a1.getYear(), a2.getYear());

        return yearCompare != 0 ? yearCompare : (monthCompare != 0 ? monthCompare : dayCompare);
    }

    public void sortByDateOfBirth(List<Student> combined) {
        combined.sort(this);
        sortByGender();
    }

    public void sortByGender() {
        for (Student a : combined) {
            (a.getGender().equals("Female") ? females : males).add(a);
        }

        combined.clear();
        combined.addAll(females);
        combined.addAll(males);

        combined.sort((Student e1, Student e2) -> e1.getGender().compareTo(e1.getGender()));
    }
    public void printList(){
        for (Student e: combined) {
            System.out.println(e.getName() + " " + e.getDay() + " " + e.getMonth() + " " + e.getYear());
        }
    }
}
