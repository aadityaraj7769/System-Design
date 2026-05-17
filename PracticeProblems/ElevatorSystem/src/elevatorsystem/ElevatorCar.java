package src.elevatorsystem;

import java.util.TreeSet;


public class ElevatorCar {
      private int currentFloor;
      private Direction direction;
      private ElevatorState state;
      private TreeSet<Integer> upRequests;
      private TreeSet<Integer> downRequests;

      public ElevatorCar() {
            currentFloor = 0;
            direction = Direction.UP;
            state = ElevatorState.IDLE;
            upRequests = new TreeSet<>();
            downRequests = new TreeSet<>();
      }

      public void submitInternalRequest(int floor) {
            if (floor >= currentFloor) {
                  upRequests.add(floor);
            } else {
                  downRequests.add(floor);
            }
      }

      public void submitExternalRequest(int floor, Direction direction) {
            if (direction == Direction.UP) {
                  upRequests.add(floor);
            } else {
                  downRequests.add(floor);
            }
      }

      private void openDoor() {
            state = ElevatorState.DOOR_OPEN;
            System.out.println("Door is opening");
      }

      private void closeDoor() {
            state = ElevatorState.DOOR_CLOSE;
            System.out.println("Door is closing");
      }

      private void stopAtFloor() {
            openDoor();

            try {
                  Thread.sleep(2000);
            } catch (InterruptedException e) {
                  e.printStackTrace();
            }

            closeDoor();
      }

      public void processNextRequest() {
            if (state == ElevatorState.IDLE) {
                  if (!upRequests.isEmpty()) {
                        state = ElevatorState.MOVING_UP;
                  } else if (!downRequests.isEmpty()) {
                        state = ElevatorState.MOVING_DOWN;
                  }
            }

            while (state != ElevatorState.IDLE) {
                  if(state == ElevatorState.MOVING_UP) {
                        direction = Direction.UP;
                        while (!upRequests.isEmpty()) {
                              int highestFloor = upRequests.last();
                              System.out.println("Elevator Moving UP from floor " + currentFloor + " to " + highestFloor);

                              while(currentFloor < highestFloor) {
                                    currentFloor++;
                                    if(upRequests.contains(currentFloor)) {
                                          upRequests.remove(currentFloor);
                                          System.out.println("Elevator is in floor: " + currentFloor);
                                          stopAtFloor();
                                    } else {
                                          System.out.println("Elevator is in floor: " + currentFloor);
                                    }
                              }
                        }
                        if(!downRequests.isEmpty()) {
                              state = ElevatorState.MOVING_DOWN;
                        }else {
                              state = ElevatorState.IDLE;
                        }
                  }

                  else if (state == ElevatorState.MOVING_DOWN) {
                        direction = Direction.DOWN;
                        while (!downRequests.isEmpty()) {
                              int lowestFloor = downRequests.first();
                              System.out.println("Elevator Moving Down from floor " + currentFloor + " to " + lowestFloor);

                              while(currentFloor > lowestFloor) {
                                    currentFloor--;
                                    if(downRequests.contains(currentFloor)) {
                                          downRequests.remove(currentFloor);
                                          System.out.println("Elevator is in floor: " + currentFloor);
                                          stopAtFloor();
                                    } else {
                                          System.out.println("Elevator is in floor: " + currentFloor);
                                    }
                              }
                        }
                        if(!upRequests.isEmpty()) {
                              state = ElevatorState.MOVING_UP;
                        } else {
                              state = ElevatorState.IDLE;
                        }
                  }
            }
      }
}
