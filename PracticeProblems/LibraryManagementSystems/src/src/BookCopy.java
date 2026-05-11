package src;

import static src.BookStatus.*;


public class BookCopy {
    private String copyId;
    private Book book;
    private BookStatus status;

    public BookCopy(String id, Book b) {
        copyId = id;
        book = b;
        status = AVAILABLE;
    }

    public boolean isAvailable() {
        return status == AVAILABLE;
    }

    public void markBorrowed() {
        status = BORROWED;
    }

    public void markAvailable() {
        status = AVAILABLE;
    }

    public Book getBook() {
        return book;
    }

    public src.BookStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }

        BookCopy other = (BookCopy) obj;

        return copyId.equals(other.copyId);
    }

    @Override
    public int hashCode() {
        return copyId.hashCode();
    }
}