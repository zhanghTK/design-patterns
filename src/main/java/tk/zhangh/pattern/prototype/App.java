package tk.zhangh.pattern.prototype;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class App {
    public static void main(String[] args) throws Exception {
        ShallowClone obj1 = new ShallowClone("test", new Date());
        ShallowClone obj2 = (ShallowClone) obj1.clone();
        assert obj1.equals(obj2);

        TimeUnit.SECONDS.sleep(1);

        obj1.setDate(new Date(11));

        assert obj1.equals(obj2);
        System.out.println(obj1.equals(obj2));
    }
}
