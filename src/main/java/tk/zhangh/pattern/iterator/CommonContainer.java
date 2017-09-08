package tk.zhangh.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangHao on 2017/9/8.
 */
public class CommonContainer<T> implements Container<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public void remove(T item) {
        list.remove(item);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator<>(list);
    }
}
