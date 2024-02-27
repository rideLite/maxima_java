package HomeWorks.hw_6;

/**
 *
 */
public final class Truck extends Motortransport {
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

    final public static void liftTheTrailer() {
        System.out.println("Кузов грузовика поднят");
    }

    @Override
    public void service() {
        liftCheck();
        super.service();
    }

    private void liftCheck() {
        System.out.println("Грузоподъемность обслуживаемого грузовика состовляет " + liftCapacity + " тонн.");

    }
}
