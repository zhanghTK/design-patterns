package tk.zhangh.pattern.single;

/**
 * 饿汉单例
 * Created by ZhangHao on 2017/9/19.
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
