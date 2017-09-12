package tk.zhangh.pattern.visitor;

/**
 * Created by ZhangHao on 2017/9/12.
 */
public class App {

    private static AccountBook accountBook;
    private static BillViewer boss;
    private static BillViewer cpa;

    static {
        accountBook = new AccountBook();
        accountBook.addBill(new Bill.InBill("item1", 1000));
        accountBook.addBill(new Bill.InBill("item2", 2000));
        accountBook.addBill(new Bill.InBill("item3", 3000));

        accountBook.addBill(new Bill.OutBill("rent", 500));
        accountBook.addBill(new Bill.OutBill("salary", 1000));
        accountBook.addBill(new Bill.OutBill("other", 2000));

        boss = new BillViewer.Boss();
        cpa = new BillViewer.Cpa();
    }

    public static void main(String[] args) {
        accountBook.show(boss);

        accountBook.show(cpa);
    }
}
