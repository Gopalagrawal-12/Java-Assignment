class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];  

       

        books[0] = new Book("c++", "Andrew ");
        books[1] = new Book("Java", "Peter");
        books[2] = new Book("Gaming in python", "Bruce");

        for (Book b : books) {
            System.out.println(b.title);
        }
    }
}
