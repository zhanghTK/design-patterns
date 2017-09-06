package tk.zhangh.pattern.template;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public abstract class AbstractTemplate {

    public void refresh() {
        abstractMethod();
        hookMethod();
        concreteMethod();
    }

    protected abstract void abstractMethod();

    protected void hookMethod() {
    }

    private void concreteMethod() {
        System.out.println("父类实现");
    }
}
