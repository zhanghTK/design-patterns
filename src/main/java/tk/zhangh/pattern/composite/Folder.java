package tk.zhangh.pattern.composite;

import java.util.ArrayList;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public class Folder extends FileComponent {

    public Folder(String name) {
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println(getName() + "[文件夹]");
    }

    public void add(FileComponent fileComponent) {
        children.add(fileComponent);
    }

    public void remove(FileComponent fileComponent) {
        children.remove(fileComponent);
    }
}
