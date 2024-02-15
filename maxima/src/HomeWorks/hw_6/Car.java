package HomeWorks.hw_6;
/** 4. Создайте класс Car, который будет наследоваться от класса MotorTransport. Добавьте приватные переменные для хранения
 марки и модели автомобиля. Реализуйте геттеры и сеттеры для этих переменных. Аналогично переопределите метод service()
 */
public class Car extends Motortransport {
    private String brand;
    private String model;

    public Car(int wheelCount, int maxSpeed, String engineType, String brand, String model) {
        super(wheelCount, maxSpeed, engineType);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void service() {
        System.out.println("Была произведена ревизия автомобиля марки "+ brand + " модели " + model);
        super.service();

    }
}

