package tk.zhangh.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangHao on 2017/9/8.
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private List<T> list = new ArrayList<>();
    private int curIdx = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return list.get(curIdx++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return curIdx != list.size();
    }
}
