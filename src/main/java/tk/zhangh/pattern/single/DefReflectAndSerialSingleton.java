package tk.zhangh.pattern.single;

import java.io.ObjectStreamException;

/**
 * 改进加锁懒汉单例
 * Created by ZhangHao on 2017/9/19.
 */
public class DefReflectAndSerialSingleton {
    private static DefReflectAndSerialSingleton instance;

    /**
     * 防止反射创建多个单例
     */
    private DefReflectAndSerialSingleton() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    public static synchronized DefReflectAndSerialSingleton getInstance() {
        if (instance == null) {
            instance = new DefReflectAndSerialSingleton();
        }
        return instance;
    }

    /**
     * 防止序列化创建多个单例
     *
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
