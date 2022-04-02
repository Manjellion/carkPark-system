package tests;

import src.parkedCar;
import src.registered;

public class parkedCarTest {
    public static void main(String[] args) {
        
        registered isRegisteredCar = new registered("Manjil", 0001, true);
        registered notRegisteredCar = new registered("Nikita", 0002, false);

        // registered Car
        parkedCar user1 = new parkedCar(isRegisteredCar.carUserName(), isRegisteredCar.carUserId(), isRegisteredCar);
        // not registered Car
        parkedCar user2 = new parkedCar(notRegisteredCar.carUserName(), notRegisteredCar.carUserId(), notRegisteredCar);
        System.out.println(user1.getName());
        System.out.println(user1.getID());

        System.out.println(user2.getName());
        System.out.println(user2.getID());

        // Should print a boolean value of true as this user is registered
        System.out.println(user1.getName() + " registration: " + user1.checkCarRegistered(isRegisteredCar));

        // This should print false as the car is not registered
        System.out.println(user2.getName() + " registration: " +user2.checkCarRegistered(isRegisteredCar));
    }
}
