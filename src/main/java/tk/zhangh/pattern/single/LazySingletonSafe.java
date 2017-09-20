package tk.zhangh.pattern.single;

/**
 * 加锁懒汉单例
 * Created by ZhangHao on 2017/9/19.
 */
public class LazySingletonSafe {
    private static LazySingletonSafe instance;

    private LazySingletonSafe() {
    }

    public static synchronized LazySingletonSafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonSafe();
        }
        return instance;
    }
}
