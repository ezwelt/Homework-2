public class Main {
    public static void main(String[] args) {
        Inbox inbox = new Inbox();

        // Mails erstellen
        Mail mail1 = new Mail("kolleg@hs.de", "Willkommen", "Hallo Student!", "01.10.2025 10:00");
        Mail mail2 = new Mail("prof@hs.de", "Hausaufgabe", "Abgabe morgen!", "02.10.2025 14:30");
        Mail mail3 = new Mail("kommilitone@web.de", "Party", "Hi, kommst du?", "03.10.2025 20:15");

        // Mails zur Inbox hinzufügen
        inbox.addMail(mail1);
        inbox.addMail(mail2);
        inbox.addMail(mail3);

        // Einige als gelesen markieren
        mail2.markAsRead();

        // Header anzeigen
        System.out.println("----- Inbox -----");
        inbox.printHeaders();

        // Ungelesene zählen
        System.out.println("Ungelesene Mails: " + inbox.countUnread());

        // Mails öffnen
        System.out.println("\nÖffne Mail 0:");
        inbox.open(0); // Gültig

        System.out.println("\nÖffne Mail 3:");
        inbox.open(3); // Ungültig

        // Aktualisierte ungelesene Mails
        System.out.println("\nUngelesene Mails nach Öffnen: " + inbox.countUnread());
    }
}