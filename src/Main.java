
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джеймс", "Клеменс");
        Author author2 = new Author("Джеймс", "Роллинс");

        Book book1 = new Book("Огонь ведьмы", author1, 1998);
        Book book2 = new Book("И пала тьма", author2, 2005);

        System.out.println("Библиотечный справочник (до изменения года):");
        System.out.println(book1);
        System.out.println(book2);

        book1.setPublicationYear(2000);

        System.out.println("\nБиблиотечный справочник (после изменения года у первой книги):");
        System.out.println(book1);
        System.out.println(book2);
    }
}


