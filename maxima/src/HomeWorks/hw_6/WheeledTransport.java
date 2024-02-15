package HomeWorks.hw_6;
/**
 1. Создайте класс WheeledTransport, который будет представлять колесный транспорт.
 У класса должны быть приватные переменные для хранения количества колес и максимальной скорости
 (поля задавайте сразу в конструкторе класса, так же делайте для полей последующих классов).
 Реализуйте геттеры и сеттеры для этих переменных. Объявите метод service() для обслуживания,
 который будет выводить информацию об обслуживании колёс (с указанием их количества, конечно, же),
 например sout(“Обслужено колёс - ” + wheelCount);*/
public abstract class WheeledTransport {
    private int wheelCount;
    private int maxSpeed;

    public WheeledTransport(int wheelCount, int maxSpeed) {
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public  void service(){
        System.out.println("Обслужено- " + wheelCount + " -колес");
    }

}
