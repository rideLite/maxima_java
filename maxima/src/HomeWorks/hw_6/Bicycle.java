package HomeWorks.hw_6;
/** 2. Создайте класс Bicycle, который будет наследоваться от класса WheeledTransport.
 Добавьте приватную переменную для хранения типа велосипеда (горный, шоссейный и т.д.).
 Реализуйте геттеры и сеттеры для этой переменной. Переопределите метод service(),
 чтобы он возвращал информацию о типе обслуженного велосипеда (например, обслужено навесное оборудование
 велосипеда типа «шоссейный»).*/
 public class Bicycle extends WheeledTransport{
     private String rideStyle;

    public String getRideStyle() {
        return rideStyle;
    }

    public void setRideStyle(String rideStyle) {
        this.rideStyle = rideStyle;
    }

    public Bicycle(int wheelCount, int maxSpeed, String rideStyle) {
        super(wheelCount, maxSpeed);
        this.rideStyle = rideStyle;
    }

    @Override
    public void service() {
        System.out.println("Обслужено навесное оборудование велосипеда типа «" + rideStyle + "»");
        super.service();
    }
}
