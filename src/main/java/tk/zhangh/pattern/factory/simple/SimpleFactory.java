package tk.zhangh.pattern.factory.simple;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class SimpleFactory {
    public static Product product(String type) {
        if ("A".equals(type)) {
            return productA();
        } else if ("B".equals(type)) {
            return productB();
        } else {
            return null;
        }
    }

    public static Product productA() {
        return new ProductA();
    }

    public static Product productB() {
        return new ProductB();
    }
}
