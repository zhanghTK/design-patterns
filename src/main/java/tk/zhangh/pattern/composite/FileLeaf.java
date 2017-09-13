package tk.zhangh.pattern.composite;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public abstract class FileLeaf extends FileComponent {
    public FileLeaf(String name) {
        super(name);
        children = null;
    }
}
