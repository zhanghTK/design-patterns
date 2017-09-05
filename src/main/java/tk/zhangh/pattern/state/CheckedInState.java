package tk.zhangh.pattern.state;

/**
 * 具体状态：入住状态
 * Created by ZhangHao on 2017/9/5.
 */
public class CheckedInState implements State {
    @Override
    public void handle() {
        System.out.println("定时打扫");
    }
}
