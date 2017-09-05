package tk.zhangh.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者2，拉取主题2
 * Created by ZhangHao on 2017/9/5.
 */
public class Observer2 implements Observer {

    public Observer2(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        String name = getClass().getSimpleName();
        if (o instanceof Subject) {
            Subject subject = (Subject) o;
            if (arg == null) {
                System.out.println(name + " 拉取主题：" + subject.subject2);
            } else {
                System.out.println(name + " 被推送主题：" + arg);
            }
        }
    }
}
