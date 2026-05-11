package parkinglot;

import java.util.List;


public class ParkingLot {
    List<Level> levels;
    ParkingStrategy strategy;

    ParkingLot(List<Level> levels, ParkingStrategy strategy) {
        this.levels = levels;
        this.strategy = strategy;
    }

    void parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = strategy.findSpot(levels, vehicle);
        if (spot != null) {
            spot.parkVehicle(vehicle);
        } else {
            System.out.println("No available spot for " + vehicle.getType());
        }
    }
    void unparkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            for (ParkingSpot spot : level.spots) {
                if (spot.isOccupied && spot.currentVehicle.equals(vehicle)) {
                    spot.removeVehicle();
                    System.out.println("Unparked " + vehicle.getType() + " from spot " + spot.id);
                    return;
                }
            }
        }
        System.out.println("Vehicle not found in parking lot");
    }
}
