import com.sun.jdi.connect.Transport;

public class Main {
    public static void main(String[] args) {
        Service serviceStation = new Service();

        ServiceStation[] vehicle = {
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };

        for (int i = 0; i < vehicle.length; i++) {
            serviceStation.service(vehicle[i]);
        }
    }
}