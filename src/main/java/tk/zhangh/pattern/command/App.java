package tk.zhangh.pattern.command;

/**
 * 命令模式调用
 * Created by ZhangHao on 2017/9/4.
 */
public class App {

    private static Invoker invoker;

    static {
        Receiver receiver = new Receiver();
        OpenCommand openCommand = new OpenCommand(receiver);
        CloseCommand closeCommand = new CloseCommand(receiver);
        invoker = new Invoker(openCommand, closeCommand);
    }

    public static void main(String[] args) {
        invoker.open();
        invoker.close();
    }
}
