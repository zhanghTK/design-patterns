package tk.zhangh.pattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 具体中介者
 * Created by ZhangHao on 2017/9/8.
 */
public class CommonController implements Controller {

    private Map<String, ViewComponent> viewComponents = new HashMap<>();
    private Map<String, ServiceComponent> serviceComponents = new HashMap<>();

    @Override
    public void register(String url, Component component) {
        if (component instanceof ViewComponent) {
            viewComponents.put(url, ((ViewComponent) component));
            return;
        }
        if (component instanceof ServiceComponent) {
            serviceComponents.put(url, ((ServiceComponent) component));
            return;
        }
        throw new IllegalArgumentException("Error type：" + component.getClass().getName());
    }

    @Override
    public void service(String request) {
        ServiceComponent serviceComponent = serviceComponents.get(request);
        String result = serviceComponent.option(request);
        ViewComponent viewComponent = viewComponents.get(request);
        System.out.println(viewComponent.option(result));
    }
}
