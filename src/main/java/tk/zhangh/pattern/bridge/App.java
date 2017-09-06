package tk.zhangh.pattern.bridge;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class App {

    private static Jvm windowsJvm;
    private static Jvm linuxJvm;

    static {
        windowsJvm = new Jvm(new Javac.WindowsJavac());
        linuxJvm = new Jvm(new Javac.LinuxJavac());
    }

    public static void main(String[] args) {
        windowsJvm.compileRun();
        linuxJvm.compileRun();
    }
}
