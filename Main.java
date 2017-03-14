import java.util.Date;

/**
 * Created by thoma on 13-Mar-17.
 */
public class Main {
    public static void main(String[] args) {
        Channel<Date> mailbox = new MessageQueue<>();
        Producer producer = new Producer(mailbox);
        Consumer consumer = new Consumer(mailbox);
        Thread producerThread = new Thread(producer, "producer");
        Thread consumerThread = new Thread(consumer, "consumer");
        producerThread.setDaemon(false);
        consumerThread.setDaemon(false);
        producerThread.start();
        consumerThread.start();
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
