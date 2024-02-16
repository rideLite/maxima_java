package HomeWorks.hw_6;

import java.util.Scanner;

public class Main {

    /**
     * 1) К коду прошлой домашней работы добавить класс Scanner для считывания из консоли типа класса для создания нового объекта.
     * Это может быть полное или сокращенное название класса, или даже цифра - главное,
     * чтобы в зависимости от полученного значения переменная типа суперкласса инициализировалась объектом конкретного подкласса
     * (через if else), и после этого передавалась в ваш метод visitServiceStation.
     * <p>
     * 2) Также в методе visitServiceStation произведите нисходящее преобразование полученного объекта, чтобы вызвать методы,
     * специфичные для каждого подкласса (создайте по одному специфическому методу с разными названиями, отметьте их модификатором final).
     * Не забывайте про проверку instanseOf, чтобы избежать ClassCastException).
     *  3) Определите, какие из ваших классов не наследуются, и сделайте их финальными с помощью модификатора final.
    */


    public static void main(String[] args) {

        System.out.println("Введите цифру, для создания объекта : \n" +
                "1 --- для велосипеда \n" +
                "2 --- для авто \n" +
                "3 --- для грузовиков");

        Scanner scanner = new Scanner(System.in);
        String userChoise = scanner.nextLine();
        if (userChoise.equals("1")) {
            Bicycle bicycle01 = new Bicycle(2, 40, "cross - country");
            visitServiceStation(bicycle01);
        } else if (userChoise.equals("2")){
            Car car01 = new Car(4, 180, "бензин", "BMW", "X5m");
            visitServiceStation(car01);

        } else if (userChoise.equals("3")){
            Truck truck01 = new Truck(16, 160, "diesel", 20);
            visitServiceStation(truck01);
        }


//        Bicycle bicycle01 = new Bicycle(2, 40, "cross - country");
//        bicycle1.service();


//        car.service();
//
//        Truck truck01 = new Truck(16, 160, "diesel", 20);
//        truck.service();

//
//        visitServiceStation(bicycle01);
//        System.out.println("////////////////////////");
//        visitServiceStation(car01);
//        System.out.println("////////////////////////");
//        visitServiceStation(truck01);
//        System.out.println("////////////////////////");

    }

    public static void visitServiceStation(WheeledTransport wheeledTransport) {
        wheeledTransport.service();
        if (wheeledTransport instanceof Car) {
            Car car = (Car)wheeledTransport;
            car.blockTheDoors();
        } else if(wheeledTransport instanceof Truck ){
            Truck truck = (Truck)wheeledTransport;
            truck.liftTheTrailer();
        }else if(wheeledTransport instanceof Bicycle ){
            Bicycle bicycle = (Bicycle)wheeledTransport;
            bicycle.ringTheBell();
        }
    }


}
