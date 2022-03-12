package tests;

import src.parkedCar;
import src.parkedCarList;

public class carParkedTester {
    public static void main(String[] args) {
        // test create an object
        parkedCarList user1 = new parkedCarList(4);
        parkedCar user1Test = new parkedCar("Manjil", 1, true);
        parkedCar user2Test = new parkedCar("Nike", 2, false);
        parkedCar user3Test = new parkedCar("Chris", 3, false);
        parkedCar user4Test = new parkedCar("Cole", 4, true);
        parkedCar user5Test = new parkedCar("Dean", 5, false);
        parkedCar user6Test = new parkedCar("Paul", 6, true);


        user1.addCarToPark(user1Test);
        user1.addCarToPark(user2Test);
        user1.addCarToPark(user3Test);
        user1.addCarToPark(user4Test);
        user1.addCarToPark(user5Test);
        user1.addCarToPark(user6Test);

        // test out different methods
        System.out.println("Total: " + user1.getTotal());
        user1.removeCarToPark(user1Test);
        System.out.println("Total: " + user1.getTotal());
        // test if method capacity() is returns false when not full
        if(user1.capacity() == true) {
            System.out.println("Car park is not full");
        } else if (user1.capacity() == false ) { 
            System.out.println("Car park is full");
        }
        // test out toString method overidden
        System.out.println(user1);
    }
}
