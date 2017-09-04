package tk.zhangh.pattern.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链组装
 * Created by ZhangHao on 2017/9/4.
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();
    private int index = 0;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void doFilter(Filter.ServletRequest request, Filter.ServletResponse response) {
        if (index < filters.size()) {
            filters.get(index++).doFilter(request, response, this);
        } else {
            System.out.println("filter chain 调用完毕");
        }
    }
}
