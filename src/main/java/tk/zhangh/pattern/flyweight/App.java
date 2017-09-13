package tk.zhangh.pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public class App {
    private static Flyweight flyWeight;
    private static List<Character> characters;

    static {
        characters = new ArrayList<>();
        characters.add('a');
        characters.add('a');
        characters.add('a');
    }

    public static void main(String[] args) {
        // 1,2 只创建一个享元对象
        flyWeight = FlyweightFactory.getFlyWeight('x');  // 1
        flyWeight.operation("0,0");

        flyWeight = FlyweightFactory.getFlyWeight('x');  // 2
        flyWeight.operation("1,1");

        // 符合享元对象内使用的三个享元对象实际是同一个
        flyWeight = FlyweightFactory.getFlyWeight(characters);
        flyWeight.operation("-1, -1");
    }
}
