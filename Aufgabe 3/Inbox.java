import java.util.ArrayList;
import java.util.List;

class Inbox {
    private List<Mail> emails = new ArrayList<>();

    // Fügt eine Mail hinzu
    public void addMail(Mail mail) {
        emails.add(mail);
    }

    // Gibt alle Header aus
    public void printHeaders() {
        for (int i = 0; i < emails.size(); i++) {
            Mail mail = emails.get(i);
            String readStatus = mail.isRead() ? "X" : " ";
            System.out.printf("%d: %s | %s | %s | %s%n",
                    i,
                    readStatus,
                    mail.getSubject(),
                    mail.getSender(),
                    mail.getDatetime());
        }
    }

    // Öffnet eine Mail und markiert sie als gelesen
    public void open(int index) {
        if (index >= emails.size()) {
            System.out.println("Ungültiger Index!");
            return;
        }
        Mail mail = emails.get(index);
        mail.print();
        mail.markAsRead();
    }

    // Zählt ungelesene Mails
    public int countUnread() {
        int count = 0;
        for (Mail mail : emails) {
            if (!mail.isRead()) {
                count++;
            }
        }
        return count;
    }
}
