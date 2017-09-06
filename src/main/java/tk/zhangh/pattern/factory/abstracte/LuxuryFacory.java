package tk.zhangh.pattern.factory.abstracte;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class LuxuryFacory implements CarFactory {
    @Override
    public Engine engine() {
        return new Engine.Luxury();
    }

    @Override
    public Seat seat() {
        return new Seat.Luxury();
    }

    @Override
    public Tyre tyre() {
        return new Tyre.Luxury();
    }
}
