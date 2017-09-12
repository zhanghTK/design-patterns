package tk.zhangh.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 账本类，包含若干账单
 * 访问者模式中的结构对象
 * Created by ZhangHao on 2017/9/12.
 */
public class AccountBook {
    private List<Bill> bills = new ArrayList<>();

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public void show(BillViewer viewer) {
        for (Bill bill : bills) {
            // 根据bill实际类型决定调用对应accept方法
            // 动态分派
            bill.accept(viewer);
        }
    }
}
