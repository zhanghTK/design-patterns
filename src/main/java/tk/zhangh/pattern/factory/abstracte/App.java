package tk.zhangh.pattern.factory.abstracte;

import lombok.AllArgsConstructor;

/**
 * Created by ZhangHao on 2017/9/6.
 */
public class App {

    private static CarFactory lowFactory;
    private static CarFactory luxuryFactory;

    static {
        lowFactory = new LowCarFactory();
        luxuryFactory = new LuxuryFacory();
    }

    public static void main(String[] args) {
        Car lowCar = new Car(lowFactory.engine(),
                lowFactory.seat(),
                lowFactory.tyre());

        Car luxuryCar = new Car(luxuryFactory.engine(),
                luxuryFactory.seat(),
                luxuryFactory.tyre());
    }

    @AllArgsConstructor
    static class Car {
        Engine engine;
        Seat seat;
        Tyre tyre;
    }
}
