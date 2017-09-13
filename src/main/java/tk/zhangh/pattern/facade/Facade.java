package tk.zhangh.pattern.facade;

import lombok.AllArgsConstructor;

/**
 * Created by ZhangHao on 2017/9/13.
 */
@AllArgsConstructor
public class Facade {
    private ServiceA serviceA;
    private ServiceB serviceB;

    public void method() {
        serviceA.methodA();
        serviceB.methodB();
    }
}
