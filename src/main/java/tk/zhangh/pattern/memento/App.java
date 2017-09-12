package tk.zhangh.pattern.memento;

/**
 * Created by ZhangHao on 2017/9/12.
 */
public class App {

    private static CareTake careTake;
    private static Emp emp;

    static {
        careTake = new CareTake();
        emp = new Emp("id", "name", 20);
    }

    public static void main(String[] args) {
        System.out.println(emp.toString());
        careTake.setMemento(emp.memento());

        emp.setName("name2");
        System.out.println(emp);

        emp.recover(careTake.getMemento());
        System.out.println(emp);
    }
}
