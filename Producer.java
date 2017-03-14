import java.util.Date;

/**
 * Created by thoma on 13-Mar-17.
 */
public class Producer implements Runnable {
    private Channel<Date> mailbox;

    public Producer(Channel<Date> mailbox) {
        this.mailbox = mailbox;
    }

    @Override
    public void run() {
        while (true){
            mailbox.send(new Date());
        }

    }
}
