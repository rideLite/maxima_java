package HomeWorks.hw_6;

/**
 *
 */
public final class Car extends Motortransport {
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

    final public static void blockTheDoors() {
        System.out.println("Двери автомобиля заблокированы");
    }

    @Override
    public void service() {
        carCheck();
        super.service();
    }
    private void carCheck(){
        System.out.println("Была произведена ревизия автомобиля марки " + brand + " модели " + model);
    }
    /**
     В подклассах вынести специфическое обслуживание из метода service в приватные методы, например:

     public void service() {
     super.service();
     checkEngine();
     }

     private void checkEngine() {...}*/
}

