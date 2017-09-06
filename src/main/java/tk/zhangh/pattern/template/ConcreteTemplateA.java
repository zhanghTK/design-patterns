package tk.zhangh.pattern.template;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class ConcreteTemplateA extends AbstractTemplate {

    private String name = getClass().getSimpleName();

    @Override
    protected void abstractMethod() {
        System.out.println(name + " abstractMethod");
    }

    @Override
    protected void hookMethod() {
        System.out.println(name + " hookMethod");
    }
}
