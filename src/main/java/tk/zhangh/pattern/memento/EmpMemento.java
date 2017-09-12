package tk.zhangh.pattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by ZhangHao on 2017/9/12.
 */
@Data
@AllArgsConstructor
public class EmpMemento {
    private String id;
    private String name;
    private int age;

    public EmpMemento(Emp emp) {
        this.id = emp.getId();
        this.name = emp.getName();
        this.age = emp.getAge();
    }
}
