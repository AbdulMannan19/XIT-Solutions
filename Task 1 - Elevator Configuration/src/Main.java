import java.util.*;

class Main {
    public static void main(String[] args) {

        List<Integer> floorRequests = new ArrayList<>();
        int direction = 0; int index = 0;

        System.out.println("Enter the floor at which the elevator starts");
        Scanner input = new Scanner(System.in);
        int floor = input.nextInt();
        input.nextLine();
        Elevator elevator = new Elevator(floor);
        System.out.println("Enter the no. of people requesting service");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("Enter the floors at which service is being requested");
        for (int i = 0; i < n; i++) {
            int f = input.nextInt();
            input.nextLine();
            floorRequests.add(f);
        }

        int min = Math.abs(elevator.currentFloor - floorRequests.get(0));
        for (int i = 0; i < floorRequests.size(); i++) {
            if (Math.abs(elevator.currentFloor - floorRequests.get(i)) < min) {
                min = Math.abs(elevator.currentFloor - floorRequests.get(i));
                index = i;
            }
        }
        if (elevator.currentFloor - floorRequests.get(index) > 0) {
            direction = -1;
        } else {
            direction = 1;
        }
        elevator.serveFloors(floorRequests, direction);
        System.out.println("Logic is based on real life elevators as they serve all the floors in one direction before switching to the other direction. It uses C Look disk scheduling algorithm which is also called as Circular Elevator disk scheduling");
        System.out.println("Question was slightly vague opening up few different interpretations");
    }
}

class Elevator {
    int currentFloor;

    Elevator(int currentFloor) {
        this.currentFloor = currentFloor;
    }
    void goToFloor(int floor) {
        this.currentFloor = floor;
    }

    void serveFloors(List<Integer> floorRequests, int d) {
        if(floorRequests.size() ==0)
            return;
        List<Integer> floorsToServe = new ArrayList<>();

        if (d == -1) {
            for (int i = 0; i < floorRequests.size(); i++) {
                if (this.currentFloor - floorRequests.get(i) > 0) {
                    floorsToServe.add(floorRequests.get(i));
                }
            }
            Collections.sort(floorsToServe);
            for (int j = floorsToServe.size()-1; j >=0; j--) {
                goToFloor(floorsToServe.get(j)); System.out.println("Going to floor  " + floorsToServe.get(j));
                floorRequests.remove((floorsToServe.get(j)));
            }
            floorsToServe.clear();
            d = 1;
            serveFloors(floorRequests, d);
        }

        if (d == 1) {
            for (int i = 0; i < floorRequests.size(); i++) {
                if (currentFloor - floorRequests.get(i) < 0) {
                    floorsToServe.add(floorRequests.get(i));
                }
            }
            Collections.sort(floorsToServe);
            for (int j = 0; j < floorsToServe.size(); j++) {
                goToFloor(floorsToServe.get(j)); System.out.println("Going to floor  " + floorsToServe.get(j));
                floorRequests.remove((floorsToServe.get(j)));
            }
            floorsToServe.clear();
            d=-1;
            serveFloors(floorRequests, d);
            }
        }
    }






