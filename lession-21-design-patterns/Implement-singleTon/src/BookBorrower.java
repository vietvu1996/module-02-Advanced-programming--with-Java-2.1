public class BookBorrower {
    private BookSingleTon borrowedBook;
    private boolean haveBook = false;

    public void borrowBook(){
        borrowedBook = BookSingleTon.borrowBook();

        haveBook = borrowedBook != null;
    }

    public String getAuthorAndTitle(){
        if(haveBook){
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have book";
    }

    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
