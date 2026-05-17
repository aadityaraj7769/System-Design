package src.elevatorsystem;

import com.sun.source.tree.Tree;
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
            state = new IdleState();
            upRequests = new TreeSet<>();
            downRequests = new TreeSet<>();
      }

      public void setState(ElevatorState state) {
            this.state = state;
      }

      public TreeSet<Integer> getUpRequests() {
            return upRequests;
      }

      public TreeSet<Integer> getDownRequests() {
            return downRequests;
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
            System.out.println("Door is opening");
      }

      private void closeDoor() {
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

      private void waitAtFloor() {
            try {
                  Thread.sleep(2000);
            } catch (InterruptedException e) {
                  e.printStackTrace();
            }
      }

      private void moveFloorUp() {
            currentFloor++;
      }

      private void moveFloorDown() {
            currentFloor--;
      }

      public void moveUp() {
            direction = Direction.UP;

            while (!upRequests.isEmpty()) {
                  int highestFloor = upRequests.last();
                  System.out.println("Elevator Moving UP from floor " + currentFloor + " to " + highestFloor);

                  while (currentFloor < highestFloor) {
                        moveFloorUp();
                        System.out.println("Elevator is in floor: " + currentFloor);
                        if (upRequests.contains(currentFloor)) {
                              upRequests.remove(currentFloor);
                              stopAtFloor();
                        } else {
                              upRequests.remove(highestFloor);
                              waitAtFloor();
                        }
                  }
            }
      }

      public void moveDown() {
            direction = Direction.DOWN;

            while (!downRequests.isEmpty()) {
                  int lowestFloor = downRequests.first();
                  System.out.println("Elevator Moving Down from floor " + currentFloor + " to " + lowestFloor);

                  while(currentFloor > lowestFloor) {
                        moveFloorDown();
                        System.out.println("Elevator is in floor: " + currentFloor);
                        if(downRequests.contains(currentFloor)) {
                              downRequests.remove(currentFloor);
                              stopAtFloor();
                        } else {
                              downRequests.remove(lowestFloor);
                              waitAtFloor();
                        }
                  }
            }
      }


      public void processNextRequest() {
            while(!(state instanceof IdleState) || !upRequests.isEmpty() || !downRequests.isEmpty()) {
                  state.processRequest(this);
            }
      }
}
