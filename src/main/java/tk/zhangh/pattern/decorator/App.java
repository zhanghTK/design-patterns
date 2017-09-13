package tk.zhangh.pattern.decorator;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public class App {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("README.md"));
        bufferedInputStream.read();
    }
}
