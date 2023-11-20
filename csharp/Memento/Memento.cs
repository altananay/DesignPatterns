namespace Memento;

public class Memento
{
    public string Isbn { get; set; }
    public string Title { get; set; }
    public string Author { get; set; }
    public DateTime LastEdited { get; set; }

    public Memento(string isbn, string title, string author, DateTime lastEdited)
    {
        Isbn = isbn;
        Title = title;
        Author = author;
        LastEdited = lastEdited;
    }
}