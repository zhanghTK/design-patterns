package tk.zhangh.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用建造者模式
 *
 * 建造者模式中的 Director
 * Created by ZhangHao on 2017/9/4.
 */
public class App {

    private static List<String> subjects = getList();  // 邮件主题
    private static List<String> contents = getList();  // 邮件内容
    private static List<String> toPersons = getList();  // 收件人
    private static List<String> ccPersons = getList();  // 抄送人
    private static List<String> bccPersons = getList();  // 暗送人

    public static void main(String[] args) {
        EmailSendMain email = new EmailSendMain.Builder("邮件模版名", toPersons).
                subjects(subjects).
                contents(contents).
                ccPersons(ccPersons).
                bccPersons(bccPersons).build();
        SendEmailUtil.sendEmail(email);
    }

    private static List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("arg1");
        list.add("arg2");
        list.add("arg3");
        list.add("arg4");
        return list;
    }
}
