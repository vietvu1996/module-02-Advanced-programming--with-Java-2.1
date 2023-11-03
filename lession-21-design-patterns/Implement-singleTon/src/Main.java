public class Main {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        BookBorrower borrower1 = new BookBorrower();
        BookBorrower borrower2 = new BookBorrower();

        borrower1.borrowBook();
        System.out.println("Borrower1 asked to borrow the book");
        System.out.println("Borrower1 Author and Title: ");
        System.out.println(borrower1.getAuthorAndTitle());

        borrower2.borrowBook();
        System.out.println("Borrower2 asked to borrow the book");
        System.out.println("Borrower2 Author and Title: ");
        System.out.println(borrower2.getAuthorAndTitle());

        borrower1.returnBook();
        System.out.println("borrower1 returned the book");

        borrower2.borrowBook();
        System.out.println("borrower2 Author and Title: ");
        System.out.println(borrower1.getAuthorAndTitle());

        System.out.println("END TESTING SINGLETON TESTING");
    }
}