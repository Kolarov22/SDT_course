import java.util.List;

public class MySyncedList extends MyLinkedList implements MyList {

    public MySyncedList() {
        super();
    }


    @Override
    public synchronized void add(int value) {
        super.add(value);
    }
    @Override
    public synchronized int get(int index) {
        return super.get(index);
    }
}
