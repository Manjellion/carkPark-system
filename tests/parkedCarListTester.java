package tests;

import src.parkedCar;
import src.parkedCarList;
import src.registered;

public class parkedCarListTester {
    public static void main(String[] args) {
        registered isRegisteredCar1 = new registered("Manjil", 0001, true);
        registered notRegisteredCar2 = new registered("Nikita", 0002, false);
        registered isRegisteredCar3 = new registered("Ceelo", 0003, true);
        registered notRegisteredCar4 = new registered("Chris", 0004, false);

        // registered Car
        parkedCar user1 = new parkedCar(isRegisteredCar1.carUserName(), isRegisteredCar1.carUserId(), isRegisteredCar1);
        // not registered Car
        parkedCar user2 = new parkedCar(notRegisteredCar2.carUserName(), notRegisteredCar2.carUserId(), notRegisteredCar2);
         // registered Car
         parkedCar user3 = new parkedCar(isRegisteredCar3.carUserName(), isRegisteredCar3.carUserId(), isRegisteredCar3);
         // not registered Car
         parkedCar user4 = new parkedCar(notRegisteredCar4.carUserName(), notRegisteredCar4.carUserId(), notRegisteredCar4);
        
        parkedCarList parkingSystem = new parkedCarList(4);

        {/* Tests for adding, removing, viewing and getting total methods from parkedCarList */}
        // If the terminal prints true then the object has been added to the array and stored in the collection
        System.out.println(parkingSystem.addParkedCar(user1)); 
        // Should increase by 1 since we added to the car park
        System.out.println(parkingSystem.getTotal());
        // Lets see the details of the parked cars inside the array
        System.out.println(parkingSystem.toString());
        // Let remove a car, if the terminal prints true then the object has successfully been removed
        System.out.println(parkingSystem.leaveCarParked(0001));
        // The total should be 0 now
        System.out.println(parkingSystem.getTotal());

        {/* Tests for searching car, get car*/}
        parkingSystem.addParkedCar(user1);
        parkingSystem.addParkedCar(user2);
        parkingSystem.addParkedCar(user3);
        parkingSystem.addParkedCar(user4);

        // Using Search method this will return the full details of the object from the array 
        System.out.println(parkingSystem.search(003));

        // Using the geParkedCar method user can input the number the object is listed in array to return that object
        System.out.println(parkingSystem.getParkedCar(2));
    
        {/* This method isFull will check if the system is full or not/ reach maximum capacity for array, isEmpty will check if empty */}
        // Since our array we made the object max to be held at 4 and we added 4 objects it should return to be full
        // Is empty should return false as it is not empty
        System.out.println(parkingSystem.isEmpty());
        // This should return true as the size of the array does = to the max capacity of 4
        System.out.println(parkingSystem.isFull());
    }
}
