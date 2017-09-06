package tk.zhangh.pattern.factory.abstracte;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class LowCarFactory implements CarFactory {
    @Override
    public Engine engine() {
        return new Engine.Low();
    }

    @Override
    public Seat seat() {
        return new Seat.Low();
    }

    @Override
    public Tyre tyre() {
        return new Tyre.Low();
    }
}
