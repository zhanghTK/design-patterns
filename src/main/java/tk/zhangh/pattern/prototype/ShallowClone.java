package tk.zhangh.pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Created by ZhangHao on 2017/9/6.
 */
@Data
@EqualsAndHashCode
@AllArgsConstructor
public class ShallowClone implements Cloneable {
    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
