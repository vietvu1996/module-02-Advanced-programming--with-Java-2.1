public class ManageStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Giang", "Nữ", "1/1/2001");
        Student s2 = new Student("Huy", "Nam", "23/12/1992");
        Student s3 = new Student("Thảo", "Nữ", "5/10/1999");
        Student s4 = new Student("Hiếu", "Nam", "5/10/2001");
        Student s5 = new Student("Việt", "Nam", "1/11/1996");

        Demerging list = new Demerging();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.sortByDateOfBirth(list.combined);
        list.printList();
    }
}