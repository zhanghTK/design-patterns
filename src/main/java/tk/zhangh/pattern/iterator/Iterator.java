package tk.zhangh.pattern.iterator;

/**
 * Created by ZhangHao on 2017/9/8.
 */
public interface Iterator<T> {
    T next();

    boolean hasNext();
}
