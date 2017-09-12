package tk.zhangh.pattern.visitor;

/**
 * 账单访问接口
 * Created by ZhangHao on 2017/9/12.
 */
public interface BillViewer {
    void viewOutBill(Bill.OutBill outBill);

    void viewInBill(Bill.InBill inBill);

    class Boss implements BillViewer {
        @Override
        public void viewOutBill(Bill.OutBill outBill) {
            System.out.println("老板查账，支出：" + outBill.getItem() + "-" + outBill.getAmount());
        }

        @Override
        public void viewInBill(Bill.InBill inBill) {
            System.out.println("老板查账，输入：" + inBill.getItem() + "-" + inBill.getAmount());
        }
    }

    class Cpa implements BillViewer {
        @Override
        public void viewOutBill(Bill.OutBill outBill) {
            System.out.println("会计查账，支出：" + outBill.getItem() + "-" + outBill.getAmount());
        }

        @Override
        public void viewInBill(Bill.InBill inBill) {
            System.out.println("会计记账，支出：" + inBill.getItem() + "-" + inBill.getAmount());
        }
    }
}
