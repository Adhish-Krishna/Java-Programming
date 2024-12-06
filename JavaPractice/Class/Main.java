// Problem: Create a Library class that manages a collection of Book objects. Each Book should have attributes like title, author, ISBN, and availability status. Implement methods to add a book, remove a book, search for a book by title or author, and check out or return a book. Ensure that the library cannot have duplicate ISBNs and that the availability status is correctly updated.

// All necessary imports
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

// Creating a class for a book
class Book {
  public String title;
  public String author;
  public String ISBN;
  public boolean isAvailable;

  public Book(String title, String author, String ISBN, boolean isAvailable) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.isAvailable = isAvailable;
  }

  public void PrintBookInfo() {
    System.out.println("Book Info:");
    System.out.println("Name: " + this.title);
    System.out.println("Author: " + this.author);
    System.out.println("ISBN Number: " + this.ISBN);
    System.out.println("Availability: " + this.isAvailable);
  }
}

// Creating a class for the library
class Library {
  HashMap<String, Book> lib = new HashMap<>();

  public void AddBook(String title, String author, String ISBN) {
    if (lib.containsKey(ISBN)) {
      System.out.println("Book Already exists!!");
      return;
    }
    Book book = new Book(title, author, ISBN, true);
    lib.put(ISBN, book);
    System.out.println("Book added successfully");
    book.PrintBookInfo();
  }

  public void Search(String title, String author) {
    boolean found = false;
    for (Book book : lib.values()) {
      if ((title != null && book.title.equals(title)) || (author != null && book.author.equals(author))) {
        book.PrintBookInfo();
        found = true;
      }
    }
    if (!found) {
      System.out.println("Book Not Found!!");
    }
  }

  void Checkout(String title) {
    boolean found = false;
    for (Book book : lib.values()) {
      if (book.title.equals(title)) {
        book.PrintBookInfo();
        book.isAvailable = false;
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Book Not Found!!");
    }
  }

  void Return(String title) {
    boolean found = false;
    for (Book book : lib.values()) {
      if (book.title.equals(title)) {
        book.PrintBookInfo();
        book.isAvailable = true;
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Book Not Found!!");
    }
  }

  public void exportLibrary(String filename) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
      writer.write("Title,Author,ISBN,isAvailable");
      writer.newLine();
      for (Book book : lib.values()) {
        writer.write(book.title + "," + book.author + "," + book.ISBN + "," + book.isAvailable);
        writer.newLine();
      }
      System.out.println("Library exported successfully to " + filename);
    } catch (IOException e) {
      System.out.println("An error occurred while exporting the library: " + e.getMessage());
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Library library = new Library();
    library.AddBook("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
    library.AddBook("1984", "George Orwell", "9780451524935");
    library.AddBook("To Kill a Mockingbird", "Harper Lee", "9780061120084");
    library.AddBook("Pride and Prejudice", "Jane Austen", "9781503290563");
    library.AddBook("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
    library.AddBook("The Hobbit", "J.R.R. Tolkien", "9780547928227");
    library.AddBook("Moby Dick", "Herman Melville", "9781503280786");
    library.AddBook("War and Peace", "Leo Tolstoy", "9781400079988");
    library.AddBook("The Odyssey", "Homer", "9780140268867");
    library.AddBook("Crime and Punishment", "Fyodor Dostoevsky", "9780486415871");
    library.AddBook("The Brothers Karamazov", "Fyodor Dostoevsky", "9780374528379");
    System.out.println("\nSearch\n");
    library.Search("Moby Dick", null);
    System.out.println("\nCheckout\n");
    library.Checkout("Moby Dick");
    System.out.println("\nReturn\n");
    library.Return("Moby Dick");
    library.exportLibrary("Library.csv");
  }
}
