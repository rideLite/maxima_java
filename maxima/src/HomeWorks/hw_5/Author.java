package HomeWorks.hw_5;

public class Author {
    public String authorName;
    public String authorSecondName;

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }

    public Author(String authorName, String authorSecondName) {
        this.authorName = authorName;
        this.authorSecondName = authorSecondName;
    }



    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSecondName='" + authorSecondName + '\'' +
                '}';
    }
}
