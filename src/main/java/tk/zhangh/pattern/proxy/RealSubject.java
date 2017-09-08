package tk.zhangh.pattern.proxy;


/**
 * Created by ZhangHao on 2017/9/8.
 */
public class RealSubject implements Subject {
    @Override
    public void syaHi(String hi) {
        System.out.println(hi);
    }

    @Override
    public void sayBye(String bye) {
        System.out.println(bye);
    }
}
