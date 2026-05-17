package src.elevatorsystem;

public class IdleState implements ElevatorState {

      @Override
      public void processRequest(ElevatorCar elevator) {
            if(!elevator.getUpRequests().isEmpty()) {
                  elevator.setState(new MovingUpState());
            }
            else if(!elevator.getDownRequests().isEmpty()) {
                  elevator.setState(new MovingDownState());
            }
      }
}
