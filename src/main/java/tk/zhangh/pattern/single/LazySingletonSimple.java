package tk.zhangh.pattern.single;

/**
 * 简单懒汉单例
 * Created by ZhangHao on 2017/9/19.
 */
public class LazySingletonSimple {
    private static LazySingletonSimple instance;

    private LazySingletonSimple() {
    }

    public static LazySingletonSimple getInstance() {
        if (instance == null) {
            instance = new LazySingletonSimple();
        }
        return instance;
    }
}
