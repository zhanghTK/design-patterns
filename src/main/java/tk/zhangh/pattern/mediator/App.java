package tk.zhangh.pattern.mediator;

/**
 * Created by ZhangHao on 2017/9/8.
 */
public class App {
    private static Controller controller;

    static {
        controller = new CommonController();
        controller.register("hello", new ViewComponent());
        controller.register("hello", new ServiceComponent());
    }

    public static void main(String[] args) {
        controller.service("hello");
    }
}
