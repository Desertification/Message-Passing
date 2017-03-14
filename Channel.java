/**
 * Created by thoma on 13-Mar-17.
 */
public interface Channel<T> {

    void send(T item);

    T receive();
}
