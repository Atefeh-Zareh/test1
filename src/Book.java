public class Book {
    private String isbn;
    private String bookName;
    private String authorName;
    private String ageGroup;

    public Book() {
    }

    public Book(String isbn, String bookName, String authorName, String ageGroup) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.authorName = authorName;
        this.ageGroup = ageGroup;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", ageGroup='" + ageGroup + '\'' +
                '}';
    }
}
