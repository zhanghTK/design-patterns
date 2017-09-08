package tk.zhangh.pattern.mediator;

import lombok.AllArgsConstructor;

/**
 * 中介者模式中具体同事
 * Created by ZhangHao on 2017/9/8.
 */
@AllArgsConstructor
public class ViewComponent implements Component {

    @Override
    public String option(String request) {
        return "输出" + request;
    }
}
