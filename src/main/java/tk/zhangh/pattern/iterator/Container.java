package tk.zhangh.pattern.iterator;

/**
 * Created by ZhangHao on 2017/9/8.
 */
public interface Container<T> {
    void add(T item);

    void remove(T item);

    Iterator iterator();
}
