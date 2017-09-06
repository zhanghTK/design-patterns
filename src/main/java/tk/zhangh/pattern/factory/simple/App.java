package tk.zhangh.pattern.factory.simple;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class App {
    public static void main(String[] args) {
        Product productA = SimpleFactory.productA();
        Product productB = SimpleFactory.productB();
        Product product = SimpleFactory.product("A");
    }
}
