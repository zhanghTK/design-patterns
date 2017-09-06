package tk.zhangh.pattern.factory.abstracte;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public interface CarFactory {
    Engine engine();

    Seat seat();

    Tyre tyre();
}
