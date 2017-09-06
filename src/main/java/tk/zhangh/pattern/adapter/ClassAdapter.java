package tk.zhangh.pattern.adapter;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class ClassAdapter extends Adaptee implements Adapter {
    @Override
    public void say() {
        System.out.println(sayHello());
    }
}
