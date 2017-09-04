package tk.zhangh.pattern.command;

/**
 * 命令的调用方
 * Created by ZhangHao on 2017/9/4.
 */
public class Invoker {
    private Command openCommand;
    private Command closeCommand;

    public Invoker(Command openCommand, Command closeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
    }

    public void open() {
        openCommand.execute();
    }

    public void close() {
        closeCommand.execute();
    }
}
