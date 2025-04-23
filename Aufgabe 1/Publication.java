// publication klasse
public class Publication {
// attribute
private String title;
private int year;
// konstruktor
public Publication(String title, int year) {
this.title = title;
this.year = year;
}
// gibt infos zurück
public String getInfo() {
return title + ", published in " + year;
}
}
