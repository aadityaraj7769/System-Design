package src;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("b1", "t1", "a1", "g1");

        BookCopy b1copy1 = new BookCopy("c1", book1);
        BookCopy b1copy2 = new BookCopy("c2", book1);
        BookCopy b1copy3 = new BookCopy("c3", book1);

        Book book2 = new Book("b2", "t2", "a2", "g2");

        BookCopy b2copy1 = new BookCopy("ca", book2);
        BookCopy b2copy2 = new BookCopy("cb", book2);
        BookCopy b2copy3 = new BookCopy("cc", book2);

        Library library = new Library();

        Librarian librarian = new Librarian("id", "Aditya", library);

        librarian.addBookCopy(b1copy1);
        librarian.addBookCopy(b1copy2);
        librarian.addBookCopy(b1copy3);
        librarian.addBookCopy(b2copy1);
        librarian.addBookCopy(b2copy2);
        librarian.addBookCopy(b2copy3);

        Member member = new Member("ida", "Anshu", library);
        member.borrowBook(book2);
    }
}