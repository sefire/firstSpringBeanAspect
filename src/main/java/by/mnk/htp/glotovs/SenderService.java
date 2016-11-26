package by.mnk.htp.glotovs;

/**
 * Created by Sergey Glotov on 26.11.2016.
 */

public class SenderService {
    private String message = "firstMessage";
    private ISender sender;

    public SenderService() {
    }

    public SenderService(String message, EmailSender sender) {
        this.message = message;
        this.sender = sender;
    }

    public void sendMessage() {
        sender.send(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSender(ISender iSender) {
        this.sender = iSender;
    }

    public ISender getSender() {
        return sender;
    }
}
