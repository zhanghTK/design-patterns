package tk.zhangh.pattern.iterator;

/**
 * Created by ZhangHao on 2017/9/8.
 */
public class App {

    private static Container<String> container;

    static {
        container = new CommonContainer<>();
        container.add("1");
        container.add("2");
        container.add("3");
        container.add("4");
        container.add("5");
    }

    public static void main(String[] args) {
        Iterator iterator = container.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
