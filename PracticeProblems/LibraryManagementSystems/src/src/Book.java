package src;

public class Book {
  private String bookId;
  private String title;
  private String author;
  private String genre;

  public Book(String id, String t, String a, String g) {
    bookId = id;
    title = t;
    author = a;
    genre = g;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getGenre() {
    return genre;
  }

  @Override
  public boolean equals(Object obj) {

    if(this == obj) {
        return true;
    }

    if(obj == null || getClass() != obj.getClass()) {
        return false;
    }

    Book other = (Book) obj;

    return bookId.equals(other.bookId);
  }

  @Override
  public int hashCode() {
    return bookId.hashCode();
  }

}
