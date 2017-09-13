package tk.zhangh.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public class Context {
    private Map<Expression.Variable, Integer> map = new HashMap<>();

    public void addValue(Expression.Variable x, int y) {
        map.put(x, y);
    }

    public int getValue(Expression.Variable x) {
        return map.get(x);
    }
}
