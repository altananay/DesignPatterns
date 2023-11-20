using Memento;

Book book = new Book();
book.Isbn = "12345";
book.Author = "victor hugo";
book.Title = "sefiller";
book.ShowBook();

Caretaker history = new Caretaker();
history.Memento = book.CreateUndo();

book.Isbn = "456";
book.ShowBook();

book.RestoreFromUndo(history.Memento);
book.ShowBook();