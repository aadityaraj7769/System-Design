package src.elevatorsystem;

public class MovingDownState implements ElevatorState {

      @Override
      public void processRequest(ElevatorCar elevator) {
            elevator.moveDown();

            if(elevator.getDownRequests().isEmpty()) {
                  if(!elevator.getUpRequests().isEmpty()) {
                        elevator.setState(new MovingUpState());
                  }
                  else {
                        elevator.setState(new IdleState());
                  }
            }
      }
}
