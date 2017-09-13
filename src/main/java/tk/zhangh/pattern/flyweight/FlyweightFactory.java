package tk.zhangh.pattern.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 享元工厂
 * 创建，管理享元对象
 * Created by ZhangHao on 2017/9/13.
 */
public class FlyweightFactory {
    private static Map<Character, Flyweight> flyweights = new HashMap<>();

    public static Flyweight getFlyWeight(Character state) {
        return flyweights.computeIfAbsent(state, k -> new ConcreteFlyweight(state));
    }

    public static Flyweight getFlyWeight(List<Character> compositeState) {
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
        for (Character state : compositeState) {
            compositeFly.add(state, getFlyWeight(state));
        }
        return compositeFly;
    }
}
