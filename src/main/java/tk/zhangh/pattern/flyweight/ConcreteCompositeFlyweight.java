package tk.zhangh.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元
 * 本身不可共享，但由可共享的享元对象组成
 * Created by ZhangHao on 2017/9/13.
 */
public class ConcreteCompositeFlyweight implements Flyweight {
    private Map<Character, Flyweight> files = new HashMap<>();

    /**
     * 增加一个新的单纯享元对象到聚集中
     */
    public void add(Character key, Flyweight fly) {
        files.put(key, fly);
    }

    /**
     * 外蕴状态作为参数传入到方法中
     */
    @Override
    public void operation(String state) {
        for (Character character : files.keySet()) {
            Flyweight fly = files.get(character);
            fly.operation(state);
        }
    }
}
