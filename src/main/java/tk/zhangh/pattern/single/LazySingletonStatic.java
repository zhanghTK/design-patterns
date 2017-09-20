package tk.zhangh.pattern.single;

/**
 * 内部类懒汉单例
 * Created by ZhangHao on 2017/9/19.
 */
public class LazySingletonStatic {
    private LazySingletonStatic() {
    }
//    可以使用静态初始化块的方式实现饿汉单例
//    private LazySingletonSimple instance;
//    static {
//        instance = new LazySingletonSimple();
//    }

    public static LazySingletonStatic getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final LazySingletonStatic INSTANCE = new LazySingletonStatic();
    }
}
