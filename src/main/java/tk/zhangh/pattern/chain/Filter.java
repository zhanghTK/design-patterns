package tk.zhangh.pattern.chain;

/**
 * 责任链接口
 * Created by ZhangHao on 2017/9/4.
 */
public interface Filter {
    void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain);

    class ServletRequest {
    }

    class ServletResponse {
    }
}
