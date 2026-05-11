package parkinglot;

public class ParkingSpot {
  int id;
  VehicleType type;
  boolean isOccupied;
  Vehicle currentVehicle;

  public ParkingSpot(int id, VehicleType type) {
    this.id = id;
    this.type = type;
    this.isOccupied = false;
    this.currentVehicle = null;
  }

  boolean canFitVehicle(Vehicle vehicle) {
    return !isOccupied && vehicle.getType().ordinal() <= type.ordinal();
  }
  void parkVehicle(Vehicle vehicle) {
    if (canFitVehicle(vehicle)) {
      this.currentVehicle = vehicle;
      this.isOccupied = true;
    }
  }
  void removeVehicle() {
    this.currentVehicle = null;
    this.isOccupied = false;
  }
}
