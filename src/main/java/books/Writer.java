package books;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Writer {
    String surname;
    String firstName;
    String patronymic;
    String birthdate;
    String birthCountry;
    String language;
}
