package tk.zhangh.pattern.decorator;

import lombok.AllArgsConstructor;

/**
 * Created by ZhangHao on 2017/9/13.
 */
@AllArgsConstructor
public class FileInputStream extends InputStream {
    private String path;

    @Override
    public int read() {
        System.out.println("读取文件:" + path);
        return 0;
    }
}
