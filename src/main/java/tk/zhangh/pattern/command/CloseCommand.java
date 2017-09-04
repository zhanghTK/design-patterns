package tk.zhangh.pattern.command;

/**
 * 命令实现类
 * 包装一个具体命令
 * Created by ZhangHao on 2017/9/4.
 */
public class CloseCommand implements Command {
    private Receiver receiver;

    public CloseCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.close();
    }
}
