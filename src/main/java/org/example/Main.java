package org.example;
import books.Book;
import books.Writer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Writer writer1 = new Writer("Миллер", "Генри", null, "26.12.1891", "США", "Английский");
        Writer writer2 = new Writer("Достоевский", "Фёдор", "Михайлович", "30.10.1821", "Россия", "Русский");
        Writer writer3 = new Writer("Айтматов", "Чингиз", "Торекулович", "12.12.1928", "Кыргызстан", "Русский");
        Writer writer4 = new Writer("Бакман", "Фредерик", null , "02.06.1981", "Швеция", "Шведский");

        Book book1 = new Book("Тропик любви", "Роман, драма", "Английский", "123-456-789", "1936", "Апрель", "Россия, Москва", "2011", 960, writer1);
        Book book2 = new Book("Братья Карамазовы", "Роман", "Русский", "125-478-5456", "1878", "МосКнига", "Россия, Москва", "1880", 500, writer2);
        Book book3 = new Book("Идиот", "Роман, Комедия, Драма", "Русский", "125-478-9999", "1883", "МосИздат", "Россия, Москва", "1985", 450, writer2);
        Book book4 = new Book("Преступление и наказание", "Роман", "Русский", "133-598-988", "1866", "РусскийДом", "Россия, Санкт-Петербург", "2012", 450, writer2);
        Book book5 = new Book("И дольше века длится день...", "Роман, Комедия, Драма", "Русский", "125-858-954", "1980", "Новый мир", "Россия, Москва", "1980", 350, writer3);
        Book book6 = new Book("Белый пароход", "Повесть", "Русский", "127-858-988", "1970", "МосИздат", "Россия, Москва", "1990", 250, writer3);
        Book book7 = new Book("Плаха", "Роман", "Русский", "333-858-988", "1987", "РОСМЭН", "Россия, Москва", "2005", 600, writer3);
        Book book8 = new Book("Вторая жизнь Уве", "Роман", "Английский", "124-589-5454", "2012", "Simon&Schuster", "Нью-йорк", "2012", 555, writer4);
        Book book9 = new Book("Бабушка велела кланяться и просить прощения", "Роман", "Русский", "455-589-5454", "2013", "Синдбад", "Россия, Москва", "2018", 400, writer4);
        Book book10 = new Book("Медвежий угол", "Роман", "Шведский", "485-189-5454", "2016", "Piratförlaget ", "Швеция", "2017", 658, writer4);


//        System.out.println(book1 + "\n");
//        System.out.println(book2 + "\n");
//        System.out.println(book3 + "\n");
//        System.out.println(book4 + "\n");

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);

//        jsonSerialize(bookList);

        jsonDeserialize();


//        for (int i = 0; i<bookList.size(); i++){
//            if(!bookList.get(i).getLanguage().equals("Русский")){
//               bookList.remove(i);
//            }
//        }

//        for (Book element: bookList){
//            if(!element.getLanguage().equals("Русский")){
//                bookList.remove(element);
//            }
//        }
//        System.out.println(bookList);
    }
    public static void jsonDeserialize() throws IOException {

//        StringBuilder result = new StringBuilder();
//
//        try (BufferedReader br = new BufferedReader(new FileReader("D:/Backend/startJavaProject/src/main/resources/jsonFile.txt"))) {
//            String line;
//
//            while((line = br.readLine()) != null) {
//                result.append(line);
//                result.append('\n');
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String jsonString = result.toString();
       // System.out.println(jsonString);

        File file = new File("D:/Backend/startJavaProject/src/main/resources/jsonFile.txt");

        List<Book> booksFromJsonList = new ObjectMapper().readValue(file, new TypeReference<>(){});
        System.out.println(booksFromJsonList);
    }

        public static void jsonSerialize(ArrayList<Book> bookList) throws JsonProcessingException {
            List rusultBookList = bookList.stream()
                    .filter(book -> book.getLanguage().equals("Русский"))
                    .collect(Collectors.toList());

            ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
            String jsonBookList = mapper.writeValueAsString(rusultBookList);
            System.out.println(jsonBookList);
       }

}

