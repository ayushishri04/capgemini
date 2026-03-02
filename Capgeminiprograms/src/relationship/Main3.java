package relationship;
class Book {
    String name;

    Book(String name) {
        this.name = name;
    }
}
class Library {
    String libraryName;
    Book[] books;   // has many

    Library(String libraryName, Book[] books) {
        this.libraryName = libraryName;
        this.books = books;
    }

    void show() {
        System.out.println("Library: " + libraryName);
        for (Book b : books) {
            System.out.println(b.name);
        }
    }
}
public class Main3 {
	public static void main(String[] args) {
        Book[] b = { new Book("Java"), new Book("Python"), new Book("C++") };
        Library l = new Library("City Library", b);
        l.show();
	}
}
