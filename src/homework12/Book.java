package homework12;

public class Book {

    private String titleBook;
    Author author;
    private int year;


    public Book(String titleBook, Author author, int year) {
        this.titleBook = titleBook;
        author = author;
        this.year = year;

    }
public String getTitleBook() {
        return this.titleBook;
}

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
