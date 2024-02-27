package HomeWorks.hw_6;

public abstract class Motortransport extends WheeledTransport {
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


    //    @Override
//    public void service() {
//        super.service();
//        System.out.println("Был обслужен двигатель типа " + engineType);
//    }
    public void service() {
        super.service();
        checkEngine();
    }
    private void checkEngine(){
        System.out.println("Был обслужен двигатель типа " + engineType);
    }
}
