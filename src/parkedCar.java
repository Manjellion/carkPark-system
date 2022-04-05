package src;

public class parkedCar {

    private String userName;
    private int userID;
    private registered registered; 

    // Constructor initialises the CarUser which is using the class registered to get the userName and userID

    public parkedCar(String nameIn, int idIn, registered regIn) {
        userName = nameIn;
        userID = idIn;
        registered = regIn;
    }

    // Records the details the user made to see if the car is registered
    public Boolean checkCarRegistered(src.registered isRegisteredCar) {
        return registered.registeredCar(); // return boolean so the method can be called in registeredList
    }

    // Reads the name of the car user
    public String getName() {
        return userName;
    }

    // Reads the ID of the car user 
    public int getID() {
        return userID;
    }

    // Get a print of the user 
    @Override
    public String toString() {
        return userName + ", " + userID + ", " + registered; 
    }
}
