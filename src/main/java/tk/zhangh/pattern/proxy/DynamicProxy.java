package tk.zhangh.pattern.proxy;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by ZhangHao on 2017/9/8.
 */
@AllArgsConstructor
public class DynamicProxy implements InvocationHandler {

    private static final String name = DynamicProxy.class.getSimpleName();
    private Subject delegate;

    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(
                delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(name + "." + method.getName() + " before");
        Object result = method.invoke(delegate, args);
        System.out.println(name + "." + method.getName() + " after");
        return result;
    }
}
