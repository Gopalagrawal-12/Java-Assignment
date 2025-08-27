class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 1: Create an array of 3 Book references
        Book[] books = new Book[3];  

        // Edge Case: If we print now without initialization
        System.out.println("Before initialization:");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);  // prints null, since references are not pointing to objects yet
        }

        // Step 2: Initialize each element with a new Book object
        books[0] = new Book("The Pragmatic Programmer", "Andrew Hunt & David Thomas");
        books[1] = new Book("Effective Java", "Joshua Bloch");
        books[2] = new Book("Thinking in Java", "Bruce Eckel");

        // Step 3: Print out the titles of all books
        System.out.println("\nAfter initialization:");
        for (Book b : books) {
            System.out.println(b.title);
        }
    }
}
