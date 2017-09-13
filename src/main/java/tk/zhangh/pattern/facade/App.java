package tk.zhangh.pattern.facade;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public class App {
    private static ServiceA serviceA = new ServiceA.ServiceAImpl();
    private static ServiceB serviceB;

    private static Facade facade;

    static {
        serviceA = new ServiceA.ServiceAImpl();
        serviceB = new ServiceB.ServiceBImpl();

        facade = new Facade(serviceA, serviceB);
    }

    public static void main(String[] args) {
        serviceA.methodA();
        serviceB.methodB();

        facade.method();
    }
}
