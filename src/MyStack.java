import java.util.NoSuchElementException;

public class MyStack<T> {
    private final SinglyLinkedList<T> list = new SinglyLinkedList<>();

    public void push(T value) {
        list.addFirst(value);
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Стек пуст");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Стек пуст");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}