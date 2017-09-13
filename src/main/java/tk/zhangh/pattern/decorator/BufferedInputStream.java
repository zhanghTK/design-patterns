package tk.zhangh.pattern.decorator;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public class BufferedInputStream extends FilterInputStream {
    public BufferedInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() {
        System.out.println("缓冲...");
        return super.read();
    }
}
