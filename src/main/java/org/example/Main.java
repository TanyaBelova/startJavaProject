package org.example;
import books.Book;
import books.Writer;

import java.util.Arrays;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Writer writer1 = new Writer("Миллер", "Генри", null, "26.12.1891", "США", "Английский");
        Writer writer2 = new Writer("Достоевский", "Фёдор", "Михайлович", "30.10.1821", "Россия", "Русский");
        Writer writer3 = new Writer("Айтматов", "Чингиз", "Торекулович", "12.12.1928", "Кыргызстан", "Русский");
        Writer writer4 = new Writer("Бакман", "Фредерик", null , "02.06.1981", "Швеция", "Шведский");

        Book book1 = new Book("Тропик любви", "Роман, драма", "Русский", "123-456-789", "1936", "Апрель", "Россия, Москва", "2011", 960, writer1);
        Book book2 = new Book("Братья Карамазовы", "Роман", "Русский", "125-478-5456", "1878", "МосКнига", "Россия, Москва", "1880", 500, writer2);
        Book book3 = new Book("Идиот", "Роман, Комедия, Драма", "Русский", "125-478-9999", "1883", "МосИздат", "Россия, Москва", "1985", 450, writer2);
        Book book4 = new Book("И дольше века длится день...", "Роман, Комедия, Драма", "Русский", "125-858-954", "1980", "Новый мир", "Россия, Москва", "1980", 350, writer3);
        Book book5 = new Book("Вторая жизнь Уве", "Роман", "Английский", "124-589-5454", "2012", "Simon&Schuster", "Нью-йорк", "2012", 555, writer4);

        System.out.println(book1 + "\n");
        System.out.println(book2 + "\n");
        System.out.println(book3 + "\n");
        System.out.println(book4 + "\n");
    }
}

