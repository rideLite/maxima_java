package HomeWorks.hw_5;

public class Book  extends Author{
    private String bookName;
    private Author author;
    private int publicationYear;


    public Book(String authorName, String authorSecondName, String bookName, int publicationYear) {
        super(authorName, authorSecondName);
        this.bookName = bookName;
        this.authorName = authorName;
        this.authorSecondName = authorSecondName;

//        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }



    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + authorName + " "+ authorSecondName+
                ", publicationYear=" + publicationYear +
                '}';
    }
}
