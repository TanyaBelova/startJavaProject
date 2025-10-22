package books;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Writer {
    String surname;
    String firstName;
    String patronymic;
    String birthdate;
    String birthCountry;
    String language;
}
