package repository;

import repository.enums.EStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new HashMap<>();
    private List<Subscriber> subscribers = new ArrayList<>();
    public void addBook(Book book){
        books.put(book.getIsbn(), book);
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void updateBooksStatus(Book book, EStatus status){
        if (books.containsValue(book)){
            if (book instanceof ScienceBook){
                ((ScienceBook) book).setStatus(status);
            }
            else if (book instanceof HistoryBook){
                ((HistoryBook) book).setStatus(status);
            }
            else if (book instanceof NovelBook){
                ((NovelBook) book).setStatus(status);
            }
            else {
                throw new RuntimeException("The book you are looking for is not available in this library");
            }
        }
    }
    public void viewTheBooks(){
        System.out.println("↓ Books In Library ↓");
        for (Book book :books.values()){
            System.out.println("~ " + book.getTitle());
        }
    }
    public void viewTheSubscribers(){
        System.out.println("↓ Subscribers In Library ↓");
        for (Subscriber subscriber : subscribers){
            System.out.println("~ " + subscriber.nickname);
        }
    }
}
