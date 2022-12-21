public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Автор", "Первый");
        Author author2 = new Author("Авто", "Второй");
        Book book1 = new Book(author1, "Война миров Том 1", 1907);
        Book book2 = new Book(author2, "Война миров Том 2", 1912);

        book1.setYearPublishing(1902);
        book2.setYearPublishing(1907);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));
    }
}