package src;

public class Librarian {
    private String employeeId;
    private String name;
    private src.Library library;

    public Librarian(String id, String n, Library l) {
        employeeId = id;
        name = n;
        library = l;
    }

    public void addBookCopy(BookCopy copy) {
        library.addBookCopy(copy);
    }

    public void removeBookCopy(BookCopy copy) {
        library.removeBookCopy(copy);
    }

}