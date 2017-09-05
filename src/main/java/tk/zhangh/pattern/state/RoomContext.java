package tk.zhangh.pattern.state;

/**
 * 上下文：状态载体
 * Created by ZhangHao on 2017/9/5.
 */
public class RoomContext {
    private State state;

    public void setState(State state) {
        this.state = state;
        state.handle();
    }
}
