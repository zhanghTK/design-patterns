package tk.zhangh.pattern.facade;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public interface ServiceB {
    void methodB();

    class ServiceBImpl implements ServiceB {
        @Override
        public void methodB() {
            System.out.println("method B");
        }
    }
}
