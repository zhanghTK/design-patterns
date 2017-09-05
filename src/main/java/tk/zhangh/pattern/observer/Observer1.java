package tk.zhangh.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者1，拉取主题1
 * Created by ZhangHao on 2017/9/5.
 */
public class Observer1 implements Observer {

    public Observer1(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        String name = getClass().getSimpleName();
        if (o instanceof Subject) {
            Subject subject = (Subject) o;
            if (arg == null) {
                System.out.println(name + " 拉取主题：" + subject.subject1);
            } else {
                System.out.println(name + " 被推送主题：" + arg);
            }
        }
    }
}
