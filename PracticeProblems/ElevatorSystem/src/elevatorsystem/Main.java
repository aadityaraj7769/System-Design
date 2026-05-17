package src.elevatorsystem;

public class Main {

      public static void main(String[] args) {

            ElevatorCar elevator = new ElevatorCar();

            ElevatorDispatcher dispatcher = new ElevatorDispatcher(elevator);

            // External Requests
            dispatcher.submitExternalRequest(
                new ExternalRequest(3, Direction.UP)
            );

            dispatcher.submitExternalRequest(
                new ExternalRequest(7, Direction.DOWN)
            );

            dispatcher.submitExternalRequest(
                new ExternalRequest(5, Direction.UP)
            );

            // Internal Requests
            dispatcher.submitInternalRequest(
                new InternalRequest(9)
            );

            dispatcher.submitInternalRequest(
                new InternalRequest(2)
            );

            elevator.processNextRequest();
      }
}