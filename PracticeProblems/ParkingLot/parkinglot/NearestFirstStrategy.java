package parkinglot;

import java.util.List;


public class NearestFirstStrategy implements ParkingStrategy {

  @Override
  public ParkingSpot findSpot(List<Level> levels, Vehicle vehicle) {
    for (Level level : levels) {
      ParkingSpot spot = level.findAvailableSpot(vehicle);

      if (spot != null) {
        System.out.println("Parked " + vehicle.getType() + " at spot " + spot.id + " on level " + level.levelNumber);
        return spot;
      }
    }
    return null;
  }
}
