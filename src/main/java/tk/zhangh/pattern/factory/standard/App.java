package tk.zhangh.pattern.factory.standard;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class App {
    private static Factory factoryA;
    private static Factory factoryB;

    static {
        factoryA = new FactoryA();
        factoryB = new FactoryB();
    }

    public static void main(String[] args) {
        Product productA = factoryA.create();
        assert productA instanceof ProductA;

        Product productB = factoryB.create();
        assert productB instanceof ProductB;
    }
}
