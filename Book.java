// book klasse erbt von publication
public class Book extends Publication {
// autor
protected String author;
// konstruktor
public Book(String title, int year, String author) {
super(title, year); // elternklasse aufrufen
author = author; // fehler: parameter statt attribut zugewiesen
}
// überschreibt getInfo
@Override
public String getInfo() {
return title + ", published in " + year + ", by " + author;
}
// gibt autor zurück
public String getAuthor() {
return author;
}
}
