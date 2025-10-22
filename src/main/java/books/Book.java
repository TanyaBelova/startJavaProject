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

