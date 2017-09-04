package tk.zhangh.pattern.builder;

/**
 * 复杂类型构建接口
 *
 * 建造者模式中的抽象构建者，规范产品的组建接口
 * Created by ZhangHao on 2017/9/4.
 */
public interface Builder<T> {
    T build();
}
