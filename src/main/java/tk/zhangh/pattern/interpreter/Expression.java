package tk.zhangh.pattern.interpreter;

import lombok.AllArgsConstructor;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public interface Expression {
    int interpret(Context context);

    @AllArgsConstructor
    class Constant implements Expression {
        private int i;

        @Override
        public int interpret(Context context) {
            return i;
        }
    }

    class Variable implements Expression {
        @Override
        public int interpret(Context context) {
            return context.getValue(this);
        }
    }

    @AllArgsConstructor
    class Add implements Expression {
        private Expression x, y;

        @Override
        public int interpret(Context context) {
            return x.interpret(context) + y.interpret(context);
        }
    }

    @AllArgsConstructor
    class Sub implements Expression {
        private Expression x, y;

        @Override
        public int interpret(Context context) {
            return x.interpret(context) - y.interpret(context);
        }
    }

    @AllArgsConstructor
    class Mul implements Expression {
        private Expression x, y;

        @Override
        public int interpret(Context context) {
            return x.interpret(context) * y.interpret(context);
        }
    }

    @AllArgsConstructor
    class Div implements Expression {
        private Expression x, y;

        @Override
        public int interpret(Context context) {
            return x.interpret(context) / y.interpret(context);
        }
    }
}
