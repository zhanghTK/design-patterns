package tk.zhangh.pattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by ZhangHao on 2017/9/8.
 */
public class CGlibProxy {

    private static final String name = CGlibProxy.class.getSimpleName();

    @SuppressWarnings("unchecked")
    public static <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(  // 创建代理类
                cls,  // super class
                new MyMethodInterceptor());  // callback
    }

    static class MyMethodInterceptor implements MethodInterceptor {
        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println(name + "." + method.getName() + " before");
            Object result = methodProxy.invokeSuper(o, objects);
            System.out.println(name + "." + method.getName() + " after");
            return result;
        }
    }
}
