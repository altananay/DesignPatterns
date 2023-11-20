namespace Memento;

public class Book
{
    private string _title;
    private string _author;
    private string _isbn;
    private DateTime _lastEdited;

    public string Title
    {
        get { return _title; }
        set
        {
            _title = value;
            SetLastEdited();
        }
    }
    public string Author
    {
        get { return _author; }
        set
        {
            _author = value;
            SetLastEdited();
        }
    }
    public string Isbn
    {
        get { return _isbn; }
        set
        {
            _isbn = value;
            SetLastEdited();
        }
    }

    private void SetLastEdited()
    {
        _lastEdited = DateTime.UtcNow;
    }

    public Memento CreateUndo()
    {
        return new Memento(_isbn, _title, _author, _lastEdited);
    }

    public void RestoreFromUndo(Memento memento)
    {
        _title = memento.Title;
        _author = memento.Author;
        _lastEdited = memento.LastEdited;
        _isbn = memento.Isbn;
    }

    public void ShowBook()
    {
        Console.WriteLine("{0}, {1}, {2},  edited: {3}", _isbn, _author, _title, _lastEdited);
    }
}