package tk.zhangh.pattern.strategy;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class App {
    private static Context context;
    private static Strategy add = new AddOperation();
    private static Strategy sub = new SubstractOperation();
    private static Strategy mul = new MultiplyOperation();

    public static void main(String[] args) {
        context = new Context(add);
        System.out.println(context.executeStrategy(3, 7));

        context = new Context(sub);
        System.out.println(context.executeStrategy(3, 7));

        context = new Context(mul);
        System.out.println(context.executeStrategy(3, 7));
    }
}
