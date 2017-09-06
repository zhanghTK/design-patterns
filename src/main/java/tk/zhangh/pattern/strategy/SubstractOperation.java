package tk.zhangh.pattern.strategy;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class SubstractOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
