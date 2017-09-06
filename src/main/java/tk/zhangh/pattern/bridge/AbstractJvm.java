package tk.zhangh.pattern.bridge;

import lombok.AllArgsConstructor;

/**
 * Created by ZhangHao on 2017/9/6.
 */
@AllArgsConstructor
public abstract class AbstractJvm {

    protected Javac javac;

    public abstract void compileRun();
}
