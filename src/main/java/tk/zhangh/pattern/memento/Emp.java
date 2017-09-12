package tk.zhangh.pattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by ZhangHao on 2017/9/12.
 */
@Data
@AllArgsConstructor
public class Emp {
    private String id;
    private String name;
    private int age;

    public EmpMemento memento() {
        return new EmpMemento(this);
    }

    public void recover(EmpMemento empMemento) {
        id = empMemento.getId();
        name = empMemento.getName();
        age = empMemento.getAge();
    }


}
