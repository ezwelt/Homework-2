// Mail-Klasse
class Mail {
    private String sender;
    private String subject;
    private String message;
    private String datetime;
    private boolean isRead;

    public Mail(String sender, String subject, String message, String datetime) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
        this.isRead = false; // Standardmäßig ungelesen
    }

    // Markiert die Mail als gelesen
    public void markAsRead() {
        isRead = true;
    }

    // Gibt die Mail formatiert aus
    public void print() {
        System.out.println(subject + " from " + sender + " on " + datetime + ": " + message);
    }

    // Getter für Header-Informationen
    public String getSender() {
        return sender;
    }
    public String getSubject() {
        return subject;
    }
    public String getDatetime() {
        return datetime;
    }
    public boolean isRead() {
        return isRead;
    }
}