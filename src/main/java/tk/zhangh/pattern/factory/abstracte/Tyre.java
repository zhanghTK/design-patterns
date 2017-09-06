package tk.zhangh.pattern.factory.abstracte;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public interface Tyre {
    void revolve();

    class Low implements Tyre {
        @Override
        public void revolve() {

        }
    }

    class Luxury implements Tyre {
        @Override
        public void revolve() {

        }
    }
}
