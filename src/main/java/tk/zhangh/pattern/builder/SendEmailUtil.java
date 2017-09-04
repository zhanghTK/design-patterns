package tk.zhangh.pattern.builder;

import java.util.List;

/**
 * 邮件发送工具类
 * Created by ZhangHao on 2016/10/15.
 */
public final class SendEmailUtil {

    /**
     * 邮件发送通用接口
     *
     * @param email 邮件发送参数对象
     */
    public static void sendEmail(EmailSendMain email) {
        if ((email.getDocName() == null || email.getDocName().equals(""))
                || (email.getFileNames() == null || email.getFileNames().size() == 0)) {
            sendEmail(email.getTemplate(),
                    email.getSubjects(),
                    email.getContents(),
                    email.getToPersons(),
                    email.getCcPersons(),
                    email.getBccPersons());
        } else {
            sendEmailWithFile(email.getTemplate(),
                    email.getSubjects(),
                    email.getContents(),
                    email.getToPersons(),
                    email.getCcPersons(),
                    email.getBccPersons(),
                    email.getDocName(),
                    email.getFileNames());
        }
    }

    /**
     * 不帶附件的邮件发送
     * 未使用建造者模式的原始方法（不良代码）
     *
     * @param template   模板
     * @param subjects   主题
     * @param contents   内容
     * @param toPersons  收件人
     * @param ccPersons  抄送人
     * @param bccPersons 暗送人
     */
    public static void sendEmail(String template, List<String> subjects, List<String> contents, List<String> toPersons,
                                 List<String> ccPersons, List<String> bccPersons) {
        System.out.println("send mail");
    }

    /**
     * 带附件的邮件发送
     * 未使用建造者模式的原始方法（不良代码）
     *
     * @param template   模板
     * @param subjects   主题
     * @param contents   内容
     * @param toPersons  收件人
     * @param ccPersons  抄送人
     * @param bccPersons 暗送人
     * @param docName    文档名称
     * @param fileNames  文件名称(多个文件,文件名称列表)
     */
    public static void sendEmailWithFile(String template, List<String> subjects, List<String> contents, List<String> toPersons,
                                         List<String> ccPersons, List<String> bccPersons, String docName, List<String> fileNames) {
        System.out.println("send mail");
    }
}
