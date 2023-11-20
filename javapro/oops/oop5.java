// Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
class Book 
{
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

class BookCollection 
{
    private Book[] books;
    private int size;

    public BookCollection(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
        } else {
            System.out.println("Collection is full. Cannot add more books.");
        }
    }

    public void removeBook(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i] == book) {
                // Shift elements to remove the book
                for (int j = i; j < size - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[size - 1] = null;
                size--;
                System.out.println("Book removed from the collection.");
                return;
            }
        }
        System.out.println("Book not found in the collection.");
    }

    public void displayBooks() {
        if (size == 0) {
            System.out.println("The collection is empty.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(books[i]);
            }
        }
    }
}

class Check {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection(3);

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        Book book3 = new Book("1984", "George Orwell", "978-0451524935");

        collection.addBook(book1);
        collection.addBook(book2);
        collection.addBook(book3);

        System.out.println("Books in the collection:");
        collection.displayBooks();

        System.out.println("\nRemoving 'The Great Gatsby' from the collection.");
        collection.removeBook(book1);

        System.out.println("\nUpdated list of books in the collection:");
        collection.displayBooks();
    }
}
