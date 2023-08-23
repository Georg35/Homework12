package homework12;

import java.time.Year;
import java.util.Objects;

public class Book {

    private String titleBook;
    Author author;
    private int year;


    public Book(String titleBook, Author author, int year) {
        this.titleBook = titleBook;
        author = author;
        if (year < 0) {
            throw new IllegalArgumentException("Год издания не может быть отрицательным");
        }
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

    public String toString() {
        return "Книга - " + this.titleBook + " Год издания - " + this.year;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return year == book.year && Objects.equals(titleBook, book.titleBook) && Objects.equals(author, book.author);
    }

    public int hashCode() {
       return Objects.hash(titleBook, author, year);
    }
}
