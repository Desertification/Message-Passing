import java.util.Date;

/**
 * Created by thoma on 13-Mar-17.
 */
public class Consumer implements Runnable {
    private Channel<Date> mailbox;

    public Consumer(Channel<Date> mailbox) {
        this.mailbox = mailbox;
    }

    @Override
    public void run() {
        while (true){
            Date message = mailbox.receive();
            if (message != null){
                System.out.println(message);
            }
        }

    }
}
