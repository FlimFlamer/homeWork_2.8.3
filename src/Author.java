import java.util.Objects;

public class Author {
    private String authorName;
    private String authorFamily;

    public String toString() {
        return "Автор: " + authorName + " " + authorFamily;
    }


    public Author(String authorName, String authorFamily) {
        this.authorName = authorName;
        this.authorFamily = authorFamily;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorFamily, author.authorFamily);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorFamily);
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorFamily() {
        return authorFamily;
    }


}