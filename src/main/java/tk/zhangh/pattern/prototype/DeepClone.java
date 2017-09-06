package tk.zhangh.pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;
import java.util.Date;

/**
 * Created by ZhangHao on 2017/9/6.
 */
@Data
@AllArgsConstructor
public class DeepClone implements Cloneable, Serializable {
    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        DeepClone deepClone = (DeepClone) object;
        deepClone.date = ((Date) this.date.clone());
        return date;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream =
                new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream =
                new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }
}
