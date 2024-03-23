package repository;

public interface ISubscriber {
    public void borrowABook(Book book);
    public void returnABook(Book book);
    public void viewBorrowedBooks();
}
