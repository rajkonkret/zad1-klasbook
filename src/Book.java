public class Book {
    private String name;
    private String description;
    private String isbn;
    private String author;
    private String authors;

    public Book(String name, String author, String description, String isbn) {
        this.name = name;
        this.description = description;
        this.isbn = isbn;
        this.author = author;
        this.authors = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public String getIsbn()

    {
        return this.isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddAuthor(String author) {
        this.author = this.authors + ", " + author;
    }
}
