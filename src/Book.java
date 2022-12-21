import java.util.Objects;

public class Book {
    private String bookName;
    private int yearPublishing;

    private Author author;




    public Book(Author author, String bookName, int yearPublishing) {
        this.author = author;
        this.bookName = bookName;
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString(){
        return author.toString() + " Произведение: " + bookName + " год издания: " + yearPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearPublishing, author);
    }

    public String getBookName() {
        return bookName;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public Author getAuthor() {
        return author;
    }


}