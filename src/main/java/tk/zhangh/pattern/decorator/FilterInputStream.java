package tk.zhangh.pattern.decorator;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public class FilterInputStream extends InputStream {

    protected InputStream in;

    public FilterInputStream(InputStream in) {
        this.in = in;
    }

    @Override
    public int read() {
        return in.read();
    }
}
