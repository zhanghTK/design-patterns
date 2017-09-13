package tk.zhangh.pattern.flyweight;

import lombok.AllArgsConstructor;

/**
 * 具体享元
 * 可以被共享的对象
 * Created by ZhangHao on 2017/9/13.
 */
@AllArgsConstructor
public class ConcreteFlyweight implements Flyweight {

    private Character intrinsicState;

    @Override
    public void operation(String state) {
        System.out.println(String.format("Intrinsic state:%s, Extrinsic state:%s", intrinsicState, state));
    }
}
