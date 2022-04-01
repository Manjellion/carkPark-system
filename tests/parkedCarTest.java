package tests;

import src.parkedCar;
import src.registeredList;

public class parkedCarTest {
    public static void main(String[] args) {
        parkedCar user1 = new parkedCar("Manjil", 2);

        System.out.println(user1.getName());
        System.out.println(user1.addToCarPark());
    }
}
