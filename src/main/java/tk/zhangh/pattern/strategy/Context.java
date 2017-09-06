package tk.zhangh.pattern.strategy;

import lombok.AllArgsConstructor;

/**
 * Created by ZhangHao on 2017/9/6.
 */
@AllArgsConstructor
public class Context {
    private Strategy strategy;

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
