import java.util.Vector;

/**
 * Created by thoma on 13-Mar-17.
 */
public class MessageQueue<T> implements Channel<T> {
    private Vector<T> queue;

    public MessageQueue() {
        this.queue = new Vector<T>();
    }

    @Override
    public void send(T item) {
        queue.addElement(item);
    }

    @Override
    public T receive() {
        if (queue.size() == 0){
            return null;
        } else {
            return queue.remove(0);
        }
    }
}
