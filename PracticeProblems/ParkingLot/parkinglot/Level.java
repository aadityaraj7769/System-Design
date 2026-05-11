package parkinglot;

import java.util.ArrayList;
import java.util.List;


public class Level {
  int levelNumber;
  List<ParkingSpot> spots;

  public Level(int levelNumber, List<ParkingSpot> spots) {
    this.levelNumber = levelNumber;
    this.spots = spots;
  }

  public ParkingSpot findAvailableSpot(Vehicle vehicle) {
    for (ParkingSpot spot : spots) {
      if (!spot.isOccupied && spot.canFitVehicle(vehicle)) {
        return spot;
      }
    }
    return null;
  }
}
