package tk.zhangh.pattern.bridge;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class Jvm extends AbstractJvm {

    public Jvm(Javac javac) {
        super(javac);
    }

    @Override
    public void compileRun() {
        javac.compile();
        System.out.println("jvm run");
    }
}
