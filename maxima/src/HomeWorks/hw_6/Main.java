package HomeWorks.hw_6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * В методе main создайте по два объекта каждого вида транспорта.
     * Создайте объект типа ServiceStation и с помощью цикла foreach передайте все объекты транспорта на обслуживание
     * в объект типа ServiceStation.
     */


    public static void main(String[] args) {
        Transport car1 = new Car(4, 250, "diesel", "BMW", "X5m");
        Transport car2 = new Car(4, 200, "gas", "Honda", "Accord");
        ServiceStation serviceStation = new ServiceStation();
        car1.service();
        Transport truck1 = new Truck(8, 160, "diesel", 20);
        Transport truck2 = new Truck(8, 150, "diesel", 15);
        Transport bike1 = new Bicycle(2, 40, "cross-country");
        Transport bike2 = new Bicycle(3, 10, "baby-bike");

        Transport[] wheeledTransports = new WheeledTransport[6];
        wheeledTransports[0] = car1;
        wheeledTransports[1] = car2;
        wheeledTransports[2] = truck1;
        wheeledTransports[3] = truck2;
        wheeledTransports[4] = bike1;
        wheeledTransports[5] = bike2;

        for (Transport t : wheeledTransports) {
            ServiceStation.visitServiceStation(t);
        }
    }


}

/**
 * 8. Абстракция и интерфейсы
 * ТЕКСТ ЗАДАНИЯ
 * Вынесите метод service в интерфейс Transport, который будет инмплементировать класс WheeledTransport.
 * <p>
 * В подклассах вынести специфическое обслуживание из метода service в приватные методы, например:
 * <p>
 * public void service() {
 * super.service();
 * checkEngine();
 * }
 * <p>
 * private void checkEngine() {...}
 * <p>
 * Также не забудьте про специфичное обслуживание в классаx Car Truck, если не вводили его в прошлой домашке.
 * <p>
 * Обратите внимание на суперклассы, которые есть смысл сделать абстрактными, чтобы исключить возможность создавать от них объекты.
 * Они должны быть абстрактными.
 * Определите класс ServiceStation с методом visitServiceStation, который работает с общим типом
 * Transport и не завязан на конкретный вид транспорта.
 * <p>
 * В методе main создайте по два объекта каждого вида транспорта.
 * Создайте объект типа ServiceStation и с помощью цикла foreach передайте все объекты транспорта на обслуживание
 * в объект типа ServiceStation.
 */
