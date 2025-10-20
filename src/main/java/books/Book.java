package books;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    String name;
    String genre;
    String language;
    String ISBN;
    String creationYear;
    String editionName;
    String editionLocation;
    String editionYear;
    int pageAmount;
    Writer writer;

//    public Book(String name, String genre, String language, String isbn, String creationYear, String editionName, String editionLocation, String editionYear, int pageAmount, Writer writer) {
//        this.name = name;
//        this.genre = genre;
//        this.language = language;
//        this.ISBN = isbn;
//        this.creationYear = creationYear;
//        this.editionName = editionName;
//        this.editionLocation = editionLocation;
//        this.editionYear = editionYear;
//        this.pageAmount = pageAmount;
//        this.writer = writer;
//    }


//    public static void showBook(Book book){
//        System.out.println("Наименование: " + book.name);
//        System.out.println("Жанр: " + book.genre);
//        System.out.println("Язык: " + book.language);
//        System.out.println("ISBN: " + book.ISBN);
//        System.out.println("Год: " + book.creationYear);
//        System.out.println("Издание: " + book.editionName);
//        System.out.println("Страна издательства: " + book.editionLocation);
//        System.out.println("Год издания: " + book.editionYear);
//        System.out.println("Количество страниц: " + book.pageAmount);
//        System.out.println("Автор: " + book.writer.surname + " " + book.writer.firstName + " " + book.writer.patronymic);
//    }
//}


    @Override
    public String toString() {
        return "Наименование:" + name + '\n' +
                "Жанр:" + genre + '\n' +
                "Язык:" + language + '\n' +
                "ISBN:" + ISBN + '\n' +
                "Год:" + creationYear + '\n' +
                "Издание:" + editionName + '\n' +
                "Страна издательства:" + editionLocation + '\n' +
                "Год издания:" + editionYear + '\n' +
                "Автор: " + writer.surname + ' ' + writer.firstName + ' ' + writer.patronymic;
    }
}

