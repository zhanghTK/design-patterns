package tk.zhangh.pattern.facade;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public interface ServiceA {
    void methodA();

    class ServiceAImpl implements ServiceA {
        @Override
        public void methodA() {
            System.out.println("method A");
        }
    }
}
