package generics.classforcollectionsdemo;

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private List<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public T get(int index) {
        return items.get(index);
    }

    public List<T> getAll() {
        return new ArrayList<>(items);
    }
}

