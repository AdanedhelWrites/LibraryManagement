import repository.*;

public class LibraryApplication {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new HistoryBook("9789750760716", "Nutuk","M.Kemal Ataturk",1927);
        Book book11 = new HistoryBook("9780713998634", "1776","David McCullough",2005);
        Book book12 = new HistoryBook("9780141032016", "Napoleon the Great","Andrew Roberts",2014);
        Book book13 = new HistoryBook("9780062316097", "Sapiens","Yuval Noah Harari",2011);
        Book book14 = new HistoryBook("9780026203104", "The Guns of August","Barbara W. Tuchman",1962);
        Book book2 = new NovelBook("9780060173227 ","To Kill A Mockingbird", "Harper Lee",1960 );
        Book book21 = new NovelBook("9783311240075 ","My Early Life", "Winston Churchill",1930 );
        Book book22 = new NovelBook("9788420741468 ","Crime and Punishment", "Fyodor Dostoevsky",1866 );
        Book book23 = new NovelBook("9780143124672 ","Moby Dick", "Herman Melville",1851 );
        Book book24 = new NovelBook("9783498046460 ","Lolita", "Vladimir Nabokov",1955 );
        Book book3 = new ScienceBook("9788491990437","Brief Answers to the Big Questions","Stephen Hawking", 2018);
        Book book31 = new ScienceBook("9781419729072","Invisible Women","Caroline Criado Perez", 2019);
        Book book32 = new ScienceBook("9782738110350","The Universe In A Nutshell","Stephen Hawking", 2001);
        Book book33 = new ScienceBook("9788423918164","On the Origin of Species","Charles Darwin", 1859);
        Book book34 = new ScienceBook("9780224052993","The Elegant Universe","Brian Greene", 1999);
        library.addBook(book1);
        library.addBook(book11);
        library.addBook(book12);
        library.addBook(book13);
        library.addBook(book14);
        library.addBook(book2);
        library.addBook(book21);
        library.addBook(book22);
        library.addBook(book23);
        library.addBook(book24);
        library.addBook(book3);
        library.addBook(book31);
        library.addBook(book32);
        library.addBook(book33);
        library.addBook(book34);

        Subscriber subscriber1 = new Subscriber("Adanedhel");
        Subscriber subscriber2 = new Subscriber("Turin Turambar");
        Subscriber subscriber3 = new Subscriber("Dinanor");
        library.addSubscriber(subscriber1);
        library.addSubscriber(subscriber2);
        library.addSubscriber(subscriber3);

        subscriber1.borrowABook(book1);
        subscriber1.viewBorrowedBooks();
        subscriber1.returnABook(book1);
        subscriber1.viewBorrowedBooks();

        library.viewTheBooks();
        library.viewTheSubscribers();


    }
}