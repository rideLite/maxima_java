package HomeWorks.hw_5;


/**
 * 5. Базовые понятия ООП (классы, объекты)
 * ТЕКСТ ЗАДАНИЯ
 * 1.    Создайте класс Book, который будет содержать в себе данные о названии, авторе и годе публикации книги.
 * Убедитесь, что типы полей класса Book выбраны правильно: это String, Author (да, полями класса могут быть и наши собственные типы), Integer
 * 2.    Создайте класс Author, который содержит в себе данные об имени и фамилии автора
 * 3.    Напишите конструкторы для обоих классов, заполняющие все поля.
 * 4.    Создайте геттеры для всех полей автора и всех полей книги.
 * 5.    Пропишите реализацию метода toString() в обоих классах
 * 6.    Создайте сеттер для поля «Год публикации» у книги.
 * 7.    В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух)
 * и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
 * Метод main не должен находиться в классах Book и Author.
 * 8.    В том же методе Main измените год публикации одной из книг с помощью сеттера.
 * В добавок создайте два метода, принимающие в качестве параметра примитив и объект, изменяющие внутри себя эти параметры.
 * Выведите в консоль значения соответствующих примитива/объекта до вызова метода, внутри метода после изменения,
 * и после выполнения метода - чтобы увидеть разницу между передачей этих объектов в метод.
 * Вспомните механизм передачи параметров по значению и по ссылке (по значению ссылки)
 */
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джоан", "Роулинг");
        Author author2 = new Author("Самуил", "Маршак");



        Book book1 = new Book("Гарри потный", author1, 3001);
        System.out.println(book1);
        Book book2 = new Book("Тихая сказка", author2, 1955);
        System.out.println(book2);
        book1.setPublicationYear(2001); // меняю год публикации
        System.out.println(book1);

        changeBookName(book1);
        System.out.println(book1);

        String someString = "qwerty";
        System.out.println(someString);
        changeSomeString(someString);
        System.out.println(someString);


    }

    public static String changeSomeString(String someString) {
        someString = "wasd";
        System.out.println("IN METHOD : " + someString);
        return someString;
    }

    public static void changeBookName(Book book1) {
        book1.setBookName("Гарри Поттер");
        System.out.println("IN METHOD : " + book1);
    }
}
