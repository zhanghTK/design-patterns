package tk.zhangh.pattern.state;

/**
 * 调用状态模式
 * Created by ZhangHao on 2017/9/5.
 */
public class App {

    private static RoomContext roomContext;
    private static State bookedState;
    private static State checkedInState;
    private static State freeState;

    static {
        roomContext = new RoomContext();
        bookedState = new BookedState();
        checkedInState = new CheckedInState();
        freeState = new FreeState();
    }

    public static void main(String[] args) {
        roomContext.setState(freeState);
        roomContext.setState(bookedState);
        roomContext.setState(checkedInState);
    }
}
