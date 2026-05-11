package parkinglot;

import java.util.List;


public interface ParkingStrategy {
    ParkingSpot findSpot(List<Level> levels, Vehicle vehicle);
}
