public class Run {
    //    Zadanie1 Stwórz klasę Book zawierającą: name, description, isbn.
//    Do danej książki powinno byćmożliwe dodawanie wielu autorów oraz głównego autora.
    public static void main(String[] args) {
        Book book = new Book("Test", "Jan","testowa", "$#$_444_");
        System.out.println(book.getAuthor());
        book.setAuthor("Nowak");
        System.out.println(book.getAuthor());
        book.setAddAuthor("Kowalski");
        System.out.println(book.getAuthor());
        Book book1 = new Book("Gra","Zenek","o grze","7654381901");
        System.out.println(book1.getAuthor());
        System.out.println(book1.getIsbn());
    }
}
