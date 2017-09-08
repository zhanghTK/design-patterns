package tk.zhangh.pattern.proxy;

import lombok.AllArgsConstructor;

/**
 * Created by ZhangHao on 2017/9/8.
 */
@AllArgsConstructor
public class SimpleProxy implements Subject {

    private static final String name = SimpleProxy.class.getSimpleName();
    private Subject realSubject;

    @Override
    public void syaHi(String hi) {
        System.out.println(name + " hi before");
        realSubject.syaHi(hi);
        System.out.println(name + " hi after");
    }

    @Override
    public void sayBye(String bye) {
        System.out.println(name + " bye before");
        realSubject.sayBye(bye);
        System.out.println(name + " bye after");
    }
}
