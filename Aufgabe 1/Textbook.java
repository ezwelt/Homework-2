// textbook klasse erbt von book
public class Textbook extends Book {
// fachgebiet
private String subject;
// konstruktor
public Textbook(String title, int year, String author, String subject) {
super(title, year, author);
this.subject = subject;
}
// getInfo überschreiben
@Override
public String getInfo() {
return title + ", published in " + year + ", by " + author + "Subject: " + subject;
}
// gibt fachgebiet zurück
public String getSubject() {
return this.subject; // unnötiges this
}
}
