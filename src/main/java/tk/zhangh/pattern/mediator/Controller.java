package tk.zhangh.pattern.mediator;

/**
 * 抽象中介者
 * Created by ZhangHao on 2017/9/8.
 */
public interface Controller {
    void register(String url, Component service);

    void service(String request);
}
