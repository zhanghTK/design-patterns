package tk.zhangh.pattern.composite;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public class TextFile extends FileLeaf {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(getName() + "[文本文件]");
    }
}
