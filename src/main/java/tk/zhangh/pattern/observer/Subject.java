package tk.zhangh.pattern.observer;

import lombok.Data;

import java.util.Observable;

/**
 * 主题类，包含两个主题，推送时两个主题都推送
 * Created by ZhangHao on 2017/9/5.
 */
@Data
public class Subject extends Observable {
    protected String subject1;
    protected String subject2;

    public void notifyChangeByPull() {
        setChanged();
        notifyObservers();
    }

    public void notifyChangeByPush() {
        setChanged();
        notifyObservers(subject1 + ":" + subject2);
    }
}
