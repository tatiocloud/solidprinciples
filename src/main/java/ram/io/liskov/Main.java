package ram.io.liskov;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles.add(new Bus("Horn"));
        vehicles.add(new Truck("HeavyHorn"));
        vehicles.add(new Car("SoftHorn"));

        vehicles.forEach( Vehicle::canSound);
    }
}
