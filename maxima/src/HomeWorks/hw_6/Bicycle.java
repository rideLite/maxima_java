package HomeWorks.hw_6;
/***/
 public final  class Bicycle extends WheeledTransport{
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
    final public static void ringTheBell() {
        System.out.println("*звенит звонок на велосипеде*");
    }

    @Override
    public void service() {
        bikeCheck();
        super.service();
    }

    private void bikeCheck(){
        System.out.println("Обслужено навесное оборудование велосипеда типа «" + rideStyle + "»");
    }
}
