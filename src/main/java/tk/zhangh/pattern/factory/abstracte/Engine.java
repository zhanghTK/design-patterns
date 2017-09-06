package tk.zhangh.pattern.factory.abstracte;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public interface Engine {
    void run();

    class Low implements Engine {
        @Override
        public void run() {

        }
    }

    class Luxury implements Engine {
        @Override
        public void run() {

        }
    }
}
