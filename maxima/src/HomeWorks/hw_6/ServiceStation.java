package HomeWorks.hw_6;
// Определите класс ServiceStation с методом visitServiceStation, который работает с общим типом
// Transport и не завязан на конкретный вид транспорта
public  class ServiceStation {
    public static void visitServiceStation(Transport Transport) {
        Transport.service();
        if (Transport instanceof Car) {
            Car car = (Car)Transport;
            car.blockTheDoors();
        } else if(Transport instanceof Truck ){
            Truck truck = (Truck)Transport;
            truck.liftTheTrailer();
        }else if(Transport instanceof Bicycle ){
            Bicycle bicycle = (Bicycle)Transport;
            bicycle.ringTheBell();
        }
    }
}
