package tk.zhangh.pattern.factory.standard;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class FactoryB implements Factory {
    @Override
    public Product create() {
        return new ProductB();
    }
}
