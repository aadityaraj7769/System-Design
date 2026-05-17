package src.elevatorsystem;

public class MovingUpState implements ElevatorState {

      @Override
      public void processRequest(ElevatorCar elevator) {
            elevator.moveUp();

            if(elevator.getUpRequests().isEmpty()) {
                  if(!elevator.getDownRequests().isEmpty()) {
                        elevator.setState(new MovingDownState());
                  }
                  else {
                        elevator.setState(new IdleState());
                  }
            }
      }
}
