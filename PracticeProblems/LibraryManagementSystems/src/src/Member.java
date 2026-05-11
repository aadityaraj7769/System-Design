package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Member {
    private String memberId;
    private String name;
    private List<BookCopy> borrowedCopies;
    private static final int MAX_LIMIT = 5;
    private Library library;

    public Member(String id, String n, Library l) {
        memberId = id;
        name = n;
        library = l;
        borrowedCopies = new ArrayList<>();
    }

    public boolean canBorrow() {
        return borrowedCopies.size() < MAX_LIMIT;
    }

    public String getName() {
        return name;
    }

    public void addBorrowedBook(BookCopy copy) {
        borrowedCopies.add(copy);
        System.out.println("Book copy of book " + copy.getBook().getTitle() + " borrowed");
    }

    public void removeBorrowedBook(BookCopy copy) {
        Iterator<BookCopy> it = borrowedCopies.iterator();
        while(it.hasNext()) {
            BookCopy c = it.next();
            if(c.equals(copy)) {
                it.remove();
                System.out.println("Book copy of book " + copy.getBook().getTitle() + " return");
                return;
            }
        }
    }

    public void borrowBook(Book book) {
        library.borrowBook(this, book);
    }

    public void returnBook(BookCopy copy) {
        library.returnBook(this, copy);
    }

    public List<BookCopy> getBorrowedCopies() {
        return borrowedCopies;
    }
}