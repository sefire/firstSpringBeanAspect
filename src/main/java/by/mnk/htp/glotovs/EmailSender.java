package by.mnk.htp.glotovs;

/**
 * Created by Sergey Glotov on 26.11.2016.
 */

public class EmailSender implements ISender {

    public EmailSender() {
    }

    public void send(String message) {
        System.out.println("EmailSender sends: " + message);
    }
}
