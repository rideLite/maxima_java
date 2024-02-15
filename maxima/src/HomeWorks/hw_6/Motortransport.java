package HomeWorks.hw_6;

/**
 * 3. Создайте класс MotorTransport, который будет наследоваться от класса WheeledTransport. Добавьте приватную переменную
 * для хранения типа двигателя (бензиновый, дизельный и т.д.). Реализуйте геттеры и сеттеры для этой переменной. Аналогично
 * переопределите метод service(), чтобы он возвращал информацию об обслуживании двигателя и его типа (не забываем про колёса
 * из суперкласса).
 */
public class Motortransport extends WheeledTransport {
    private String engineType;

    public Motortransport(int wheelCount, int maxSpeed, String engineType) {
        super(wheelCount, maxSpeed);
        this.engineType = engineType;
    }

//    public Motortransport(int wheelCount, int maxSpeed) {
//        super(wheelCount, maxSpeed);
//    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }


    @Override
    public void service() {
        super.service();
        System.out.println("Был обслужен двигатель типа " + engineType);
    }
}
