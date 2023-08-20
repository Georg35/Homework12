package homework12;

public class Main {



        public static void main(String[] args) {
            Author author = new Author("Стивен ", "Кинг");
            Book book = new Book("Мёртвая зона", author, 1979);
            System.out.println("Книга - " + book.getTitleBook());
            System.out.println("Автор - " + author.getName() + author.getSurname());
            System.out.println("Год издания - " + book.getYear());
            book.setYear(1980);
            System.out.println("Год переиздания " + book.getYear());

            System.out.println("#########################");

            Author author2 = new Author("Джон ", "Стейнбек");
            Book book2 = new Book("Гроздья Гнева ", author2, 1939);
            System.out.println("Книга - " + book2.getTitleBook());
            System.out.println("Автор - " + author2.getName() + author2.getSurname());
            System.out.println("Год издания - " + book2.getYear());

        }
    }


