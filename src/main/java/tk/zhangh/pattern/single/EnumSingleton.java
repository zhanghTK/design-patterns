package tk.zhangh.pattern.single;

/**
 * 枚举单例
 * Created by ZhangHao on 2017/9/19.
 */
public enum EnumSingleton {
    INSTANCE;

    public void functionInEnum() {
        System.out.println("function in enum");
    }
}
