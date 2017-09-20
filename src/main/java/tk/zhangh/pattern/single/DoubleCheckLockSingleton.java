package tk.zhangh.pattern.single;

/**
 * 双锁懒汉单例
 * Created by ZhangHao on 2017/9/19.
 */
public class DoubleCheckLockSingleton {
    // 指令重排可能影响执行指令的执行顺序
    // volatile 声明的变量会禁止指令重排
    // 只在 JDK5 之后生效
    private volatile static DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton() {
    }

    public static DoubleCheckLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
