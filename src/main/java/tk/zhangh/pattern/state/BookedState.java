package tk.zhangh.pattern.state;

/**
 * 具体状态：预订状态
 * Created by ZhangHao on 2017/9/5.
 */
public class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("准备");
    }
}
