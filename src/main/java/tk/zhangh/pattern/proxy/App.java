package tk.zhangh.pattern.proxy;

import net.sf.cglib.core.DebuggingClassWriter;

import java.io.File;

/**
 * Created by ZhangHao on 2017/9/8.
 */
public class App {

    private static Subject simpleProxy;
    private static Subject dynamicProxy;
    private static Subject cgLibProxy;

    static {
        // 输出 JDK 动态代理类
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 输出 CGLib 动态代理类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, new File("").getAbsolutePath());

        RealSubject realSubject = new RealSubject();
        simpleProxy = new SimpleProxy(realSubject);
        dynamicProxy = new DynamicProxy(realSubject).getProxy();
        cgLibProxy = CGlibProxy.getProxy(RealSubject.class);
    }

    public static void main(String[] args) {
        simpleProxy.syaHi("hi");
        simpleProxy.sayBye("bye");

        dynamicProxy.syaHi("hi");
        dynamicProxy.sayBye("bye");

        cgLibProxy.sayBye("hi");
        cgLibProxy.sayBye("bye");
    }
}
