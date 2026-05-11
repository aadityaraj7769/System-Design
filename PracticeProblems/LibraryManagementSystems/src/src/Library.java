package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import static src.BookStatus.*;


public class Library {
    private List<BookCopy> inventory;

    public Library() {
        inventory = new ArrayList<>();
    }

    private List<BookCopy> searchByEntity(String entity) {
        List<BookCopy> copies = new ArrayList<>();
        for(BookCopy copy: inventory) {
            if(copy.getBook().getTitle().equals(entity)) {
                copies.add(copy);
                System.out.println("BookCopy with title " + entity + " found");
            }
        }
        if(copies.size() == 0) {
            System.out.println("BookCopy with title " + entity + " does not exist");
        }
        return copies;
    }

    public List<BookCopy> searchByTitle(String title) {
        return searchByEntity(title);
    }

    public List<BookCopy> searchByAuthor(String author) {
        return searchByEntity(author);
    }

    public List<BookCopy> searchByGenre(String genre) {
        return searchByEntity(genre);
    }

    public void borrowBook(src.Member member, Book book) {
        if(!member.canBorrow()) {
            System.out.println("Member with memberId has reached its limit");
            return;
        }

        for(BookCopy copy: inventory) {
            if(copy.getBook().equals(book) && copy.getStatus() == AVAILABLE) {
                copy.markBorrowed();
                member.addBorrowedBook(copy);
                System.out.println("Member with name: " + member.getName() + " borrowed book with name: " + copy.getBook().getTitle());
                return;
            }
        }

        System.out.println("Book is not available in inventory");
    }

    public void returnBook(src.Member member, BookCopy copy) {
        boolean hasBorrowed = member.getBorrowedCopies()
                                    .stream()
                                    .anyMatch(c -> c.equals(copy));
        if(!hasBorrowed) {
            System.out.println("BookCopy " + copy.getBook().getTitle() + " is not assigned to member " + member.getName());
            return;
        } 
        copy.markAvailable();
        member.removeBorrowedBook(copy);
        System.out.println("Member with name: " + member.getName() + " returned book with name: " + copy.getBook().getTitle());
    }

    public void addBookCopy(BookCopy copy) {
        inventory.add(copy);
        System.out.println("BookCopy " + copy.getBook().getTitle() + " added");
    }

    public void removeBookCopy(BookCopy copy) {
        Iterator<BookCopy> it = inventory.iterator();
        while(it.hasNext()) {
            BookCopy c = it.next();
            if(c.equals(copy)) {
                it.remove();
                System.out.println("BookCopy " + copy.getBook().getTitle() + " removed");
                return;
            }
        }
    }

}