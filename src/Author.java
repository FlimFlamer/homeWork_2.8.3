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
    public boolean equals(Object author) {
        if(this.getClass() != author.getClass()){
            return false;}

        Author author2 = (Author) author;
        return authorName.equals(author2.authorName) && authorFamily.equals(author2.authorFamily);
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