package repository;

import repository.enums.EStatus;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements ISubscriber {
    protected String nickname;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Subscriber(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void borrowABook(Book book) {
        borrowedBooks.add(book);
        if (book instanceof ScienceBook){
            ((ScienceBook) book).setStatus(EStatus.BORROWED);
        } else if (book instanceof NovelBook) {
            ((NovelBook) book).setStatus(EStatus.BORROWED);
        }else
            ((HistoryBook) book).setStatus(EStatus.BORROWED);
        System.out.println(book.getTitle() + " is borrowed");
    }

    @Override
    public void returnABook(Book book) {
        borrowedBooks.remove(book);
        if (book instanceof ScienceBook){
            ((ScienceBook) book).setStatus(EStatus.AVAILABLE);
        } else if (book instanceof NovelBook) {
            ((NovelBook) book).setStatus(EStatus.AVAILABLE);
        }else
            ((HistoryBook) book).setStatus(EStatus.AVAILABLE);
        System.out.println(book.getTitle() + " is available for borrow");
    }

    @Override
    public void viewBorrowedBooks() {
        System.out.println("↓ The list of borrowed books is as follows ↓");
        for (Book book : borrowedBooks){
            System.out.println("~ " + book.getTitle());
        }
    }
}
