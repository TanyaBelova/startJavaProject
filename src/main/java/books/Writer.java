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

//    public Writer(String surname, String firstName, String patronymic, String birthdate, String birthCountry, String language){
//        this.surname = surname;
//        this.firstName = firstName;
//        this.patronymic = patronymic;
//        this.birthdate = birthdate;
//        this.birthCountry = birthCountry;
//        this.language = language;
//    }

}
