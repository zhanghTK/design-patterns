package tk.zhangh.pattern.state;

/**
 * 具体状态：空闲状态
 * Created by ZhangHao on 2017/9/5.
 */
public class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("等待预订");
    }
}
