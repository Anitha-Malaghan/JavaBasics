package generics.interfacedemo;

import java.util.ArrayList;
import java.util.List;

public class ContainerImplementation<T> implements Container<T> {
    private List<T> items = new ArrayList<>();

    @Override
    public void add(T item) {
        items.add(item);
    }
    @Override
    public T get(int index) {
        return items.get(index);
    }

}
