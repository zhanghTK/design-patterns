package tk.zhangh.pattern.factory.abstracte;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public interface Seat {
    void massage();

    class Low implements Seat {
        @Override
        public void massage() {

        }
    }

    class Luxury implements Seat {
        @Override
        public void massage() {

        }
    }
}
