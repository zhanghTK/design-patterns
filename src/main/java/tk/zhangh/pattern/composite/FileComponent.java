package tk.zhangh.pattern.composite;

import lombok.Data;

import java.util.List;

/**
 * Created by ZhangHao on 2017/9/13.
 */
@Data
public abstract class FileComponent {
    protected List<FileComponent> children;
    private String name;

    public FileComponent(String name) {
        this.name = name;
    }

    public abstract void display();
}
