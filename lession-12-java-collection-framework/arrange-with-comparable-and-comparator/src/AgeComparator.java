import java.util.Comparator;

public class AgeComparator implements Comparator <Student> {
    @Override
    public int compare(Student a1, Student a2){
        if(a1.getAge() < a2.getAge()){
            return 1;
        } else if (a1.getAge().equals(a2.getAge())) {
            return 0;
        }
        return -1;
//        if(!a1.getName().equals(a2.getName())){
//            return a1.getName().compareTo(a2.getName());
//        }
//        return a1.getAge().compareTo(a2.getAge());
    }
}
