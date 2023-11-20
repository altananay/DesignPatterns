package main;

public class Main {
  public static void main(String[] args) {
    Book book = new Book();
    book.setIsbn("12345");
    book.setTitle("sefiller");
    book.setAuthor("victor hugo");
    System.out.println(book);

    Caretaker caretaker = new Caretaker();
    caretaker.setMemento(book.createUndo());

    book.setIsbn("1");
    System.out.println(book);

    book.restoreFromUndo(caretaker.getMemento());
    System.out.println(book);

  }
}
