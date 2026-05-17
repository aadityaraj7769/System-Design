package src.elevatorsystem;

public class ElevatorDispatcher {
  private ElevatorCar elevator;

  public ElevatorDispatcher(ElevatorCar elevator) {
    this.elevator = elevator;
  }

  public void submitExternalRequest(ExternalRequest externalRequest) {
    elevator.submitExternalRequest(externalRequest.getFloor(), externalRequest.getDirection());
  }

  public void submitInternalRequest(InternalRequest internalRequest) {
    elevator.submitInternalRequest(internalRequest.getDestinationFloor());
  }
}
