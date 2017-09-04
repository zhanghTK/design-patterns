package tk.zhangh.pattern.chain;

/**
 * 责任链具体环节
 * Created by ZhangHao on 2017/9/4.
 */
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) {
        System.out.println("判断用户登录");
        filterChain.doFilter(request, response);
    }
}
