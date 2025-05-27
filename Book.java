public class Book {
    String bookName;
    String author;
    String publisher;
    int price;
    String yearOfPublished;

    public Book(String b, String a, String p, int pr, String y) {
        bookName = b;
        author = a;
        publisher = p;
        price = pr;
        yearOfPublished = y;
    }

    public void displayBook() {
        System.out.println("Book Details:");
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: ₹" + price);
        System.out.println("Year of Published: " + yearOfPublished);
    }
}
