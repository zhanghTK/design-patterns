package tk.zhangh.pattern.interpreter;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public class App {
    private static Expression.Variable a = new Expression.Variable();
    private static Expression.Variable b = new Expression.Variable();
    private static Expression.Constant c = new Expression.Constant(1500);

    public static void main(String[] args) {
        Context context = new Context();
        context.addValue(a, 14);
        context.addValue(b, 10000);

        Expression expression = new Expression.Div(
                new Expression.Mul(a, b),
                new Expression.Add(
                        new Expression.Sub(a, b),
                        c
                )
        );

        System.out.println(expression.interpret(context));
    }
}
