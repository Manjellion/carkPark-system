package tests;

import src.EasyScanner;
import src.parkedCar;
import src.parkedCarFileHandler;
import src.parkedCarList;
import src.registered;

public class ParkingSystemTest {
    public static void main(String[] args) {
        
        int parkingSpace;
        parkedCarList list;

        System.out.println("Enter maximum number of parking space: ");
        // call the private method to initiate user value to its variable
        parkingSpace = EasyScanner.nextInt();
        // make the private variable list be the constructor of parkedCarList to set max space in collection class
        list = new parkedCarList(parkingSpace);
        // Call readRecord method from parkedCarFileHandler class
        parkedCarFileHandler.readRecord(list);

        // The list of choice's the user can choose
        char choice;
        do {
            System.out.println();
            System.out.println("1. Enter car park");
            System.out.println("2. Leave car park");
            System.out.println("3. Check if car park is full");
            System.out.println("4. Get total number of cars");
            System.out.println("5. Check if car is registered");
            System.out.println("6. List cars currently parked");
            System.out.println("7. List cars currently registered");
            System.out.println("8. Save and Quit");
            System.out.println();
            System.out.print("Enter choice (1-6): ");
            choice = EasyScanner.nextChar();
            System.out.println();

            switch(choice) {
                case '1': addHandler(parkingSpace, list);
                    break;
                case '2': leaveHandler(parkingSpace, list);
                    break;
                //case '3': isFullHandler(parkingSpace, list);
                //    break;
                //case '4': getTotalHandler(parkingSpace, list);
                //    break;
                //case '5': checkRegisteredHandler(parkingSpace, list);
                //    break;
                //case '6': listParkedCarHandler(parkingSpace, list);
                //    break;
                //case '7': listRegisteredHandler(parkingSpace, list);
                //    break;
                // case '8': saveAndQuitHandler(parkingSpace, list);
                //    break;
            }
        } while(choice != 6);
    }

    // Here we will implement the methods used in our parkedCar & registered classes into the handler methods in the case
    static void addHandler(int noOfSpaceIn, parkedCarList listIn) {
        
        parkedCarList list = new parkedCarList(1);

        System.out.println("Enter name: ");
        String name = EasyScanner.nextString();
        System.out.println("Enter ID: ");
        int ID = EasyScanner.nextInt();
        
        boolean registered;
        System.out.println("Are you registered to park?");
        System.out.println("[1] - Yes");
        System.out.println("[2] - No");
        int ans = EasyScanner.nextInt();
        if(ans == 1) {
            registered = true;
        } else {
            registered = false;
        }

        registered registerCheck = new registered(name, ID, registered);

        if(list.getTotal() < 1 || list.getTotal() > noOfSpaceIn) {
            int totalSpaceLeft = noOfSpaceIn - list.getTotal();
            System.out.println("There are " + totalSpaceLeft + " spaces left in the car park");
        } else { // There is space to add the car object
            parkedCar user = new parkedCar(name, ID, registerCheck);
            listIn.addParkedCar(user);
            System.out.println("New Car has no parked successfull to the parking space");
        }
    }

    static void leaveHandler(int noOfSpaceIn, parkedCarList listIn) {
        System.out.println("Enter you ID: ");
        int enteredID = EasyScanner.nextInt();
        // Check if the ID exists
        if(listIn.search(enteredID) == null) {
            System.out.println("The ID belonging to the user does not exist in the car park");
        } else {
            // ID exists and can be removed
            listIn.leaveCarParked(enteredID);
            System.out.println("User with ID " + enteredID + "successfully left the car park");
        }
    }


}
