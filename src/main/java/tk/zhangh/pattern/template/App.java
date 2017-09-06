package tk.zhangh.pattern.template;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class App {

    private static AbstractTemplate templateA = new ConcreteTemplateA();
    private static AbstractTemplate templateB = new ConcreteTemplateB();

    public static void main(String[] args) {

        templateA.refresh();

        templateB.refresh();
    }
}
