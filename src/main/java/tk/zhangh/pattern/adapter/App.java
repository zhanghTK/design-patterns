package tk.zhangh.pattern.adapter;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class App {

    private static Adapter classAdapter;
    private static Adapter objAdapter;

    static {
        classAdapter = new ClassAdapter();
        objAdapter = new ObjAdapter(new Adaptee());
    }

    public static void main(String[] args) {
        classAdapter.say();

        objAdapter.say();
    }
}
