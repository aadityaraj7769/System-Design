package parkinglot;

public abstract class Vehicle {
  String vehicleNumber;
  VehicleType type;

  public Vehicle(VehicleType type, String vehicleNumber) {
    this.type = type;
    this.vehicleNumber = vehicleNumber;
  }

  abstract VehicleType getType();
}

class Car extends Vehicle {
  public Car(String vehicleNumber) {
    super(VehicleType.CAR, vehicleNumber);
  }

  @Override
  VehicleType getType() {
    return type;
  }
}

class Bike extends Vehicle {
  public Bike(String vehicleNumber) {
    super(VehicleType.BIKE, vehicleNumber);
  }

  @Override
  VehicleType getType() {
    return type;
  }
}

class Truck extends Vehicle {
  public Truck(String vehicleNumber) {
    super(VehicleType.TRUCK, vehicleNumber);
  }

  @Override
  VehicleType getType() {
    return type;
  }
}
