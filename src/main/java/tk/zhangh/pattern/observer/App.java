package tk.zhangh.pattern.observer;

/**
 * 调用观察者模式
 * Created by ZhangHao on 2017/9/5.
 */
public class App {

    private static Subject subject;

    static {
        subject = new Subject();
        new Observer1(subject);  // 订阅
        new Observer2(subject);  // 订阅
    }

    public static void main(String[] args) {
        subject.setSubject1("s1");
        subject.setSubject2("s2");
        subject.notifyChangeByPull();

        subject.setSubject1("t1");
        subject.setSubject2("t2");
        subject.notifyChangeByPush();
    }
}
