package tk.zhangh.pattern.chain;

/**
 * 责任链模式调用
 * Created by ZhangHao on 2017/9/4.
 */
public class App {

    private static FilterChain filterChain;

    static {
        filterChain = new FilterChain();
        filterChain.addFilter(new LogFilter());
        filterChain.addFilter(new LoginFilter());
    }

    public static void main(String[] args) {
        filterChain.doFilter(new Filter.ServletRequest(), new Filter.ServletResponse());
    }
}
