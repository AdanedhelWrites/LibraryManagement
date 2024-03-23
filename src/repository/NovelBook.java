package repository;

import repository.enums.EStatus;

public class NovelBook extends Book{
    private EStatus status;

    public NovelBook(String isbn, String title, String author, int publishedYear) {
        super(isbn, title, author, publishedYear);
        this.status = EStatus.AVAILABLE;
    }

    @Override
    public EStatus getStatus() {
        return status;
    }
    public void setStatus(EStatus status){
        this.status=status;
    }
}
