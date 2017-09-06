package tk.zhangh.pattern.adapter;

import lombok.AllArgsConstructor;

/**
 * Created by ZhangHao on 2017/9/6.
 */
@AllArgsConstructor
public class ObjAdapter implements Adapter {

    private Adaptee adaptee;

    @Override
    public void say() {
        System.out.println(adaptee.sayHello());
    }
}
