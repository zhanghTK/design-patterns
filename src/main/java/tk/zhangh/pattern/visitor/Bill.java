package tk.zhangh.pattern.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 账单
 * 访问者模式中的元素接口
 * Created by ZhangHao on 2017/9/12.
 */
public interface Bill {
    void accept(BillViewer viewer);

    @Data
    @AllArgsConstructor
    class InBill implements Bill {
        private String item;
        private double amount;

        @Override
        public void accept(BillViewer viewer) {
            viewer.viewInBill(this);
        }
    }


    @Data
    @AllArgsConstructor
    class OutBill implements Bill {
        private String item;
        private double amount;

        @Override
        public void accept(BillViewer viewer) {
            viewer.viewOutBill(this);
        }
    }
}
