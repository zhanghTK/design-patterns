package tk.zhangh.pattern.bridge;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public interface Javac {
    void compile();

    class WindowsJavac implements Javac {
        @Override
        public void compile() {
            System.out.println("compile on windows");
        }
    }

    class LinuxJavac implements Javac {
        @Override
        public void compile() {
            System.out.println("compile on linux");
        }
    }
}
