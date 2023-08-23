package homework12;

import java.util.Objects;

public class Author {

    private String name;
    private String surname;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return "Автор - " + this.name + this.surname;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Author author = (Author) obj;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
