package tk.zhangh.pattern.composite;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public class ImageFile extends FileLeaf {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(getName() + "[图片文件]");
    }
}
