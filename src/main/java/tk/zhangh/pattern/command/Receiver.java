package tk.zhangh.pattern.command;

/**
 * 真正的命令执行者
 * Created by ZhangHao on 2017/9/4.
 */
public class Receiver {
    public void open() {
        System.out.println("open command invoke");
    }

    public void close() {
        System.out.println("close command invoke");
    }
}
