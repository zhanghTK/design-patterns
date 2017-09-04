package tk.zhangh.pattern.command;

/**
 * 具体命令
 * Created by ZhangHao on 2017/9/4.
 */
public class OpenCommand implements Command {
    private Receiver receiver;

    public OpenCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.open();
    }
}
