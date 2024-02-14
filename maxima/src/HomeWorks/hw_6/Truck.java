package HomeWorks.hw_6;
/**5. Создайте класс Truck, который будет наследоваться от класса MotorTransport. Добавьте приватную переменную для хранения
 грузоподъемности грузовика. Реализуйте геттеры и сеттеры для этой переменной. Аналогично переопределите метод service()
 */
public class Truck extends Motortransport{
    private int liftCapacity;

    public int getLiftCapacity() {
        return liftCapacity;
    }

    public void setLiftCapacity(int liftCapacity) {
        this.liftCapacity = liftCapacity;
    }

    public Truck(int wheelCount, int maxSpeed, String engineType, int liftCapacity) {
        super(wheelCount, maxSpeed, engineType);
        this.liftCapacity = liftCapacity;
    }

    @Override
    public void service() {
        System.out.println("Грузоподъемность обслуживаемого грузовика состовляет " + liftCapacity+ " тонн.");
        super.service();
    }

}
