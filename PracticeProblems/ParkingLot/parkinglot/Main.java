package parkinglot;

import java.util.List;


public class Main {
  public static void main(String[] args) {
    Level level1 = new Level(1, List.of(
      new ParkingSpot(1, VehicleType.CAR),
      new ParkingSpot(2, VehicleType.BIKE),
      new ParkingSpot(3, VehicleType.TRUCK)
    ));
    Level level2 = new Level(2, List.of(
      new ParkingSpot(1, VehicleType.BIKE),
      new ParkingSpot(2, VehicleType.BIKE),
      new ParkingSpot(3, VehicleType.CAR)
    ));

    List<Level> levels = List.of(level1, level2);

    ParkingStrategy strategy = new NearestFirstStrategy();
    ParkingLot parkingLot = new ParkingLot(levels, strategy);
    Vehicle car1 = new Car("CAR123");
    Vehicle bike1 = new Bike("BIKE123");
    Vehicle truck1 = new Truck("TRUCK123");
    Vehicle bike2 = new Bike("BIKE456");

    parkingLot.parkVehicle(car1);
    parkingLot.parkVehicle(bike1);
    parkingLot.parkVehicle(truck1);
    parkingLot.parkVehicle(bike2); // Should find the next available bike spot

    parkingLot.unparkVehicle(car1);
  }
}
