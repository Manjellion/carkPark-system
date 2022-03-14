package src;

public class parkedCar {

    private String userName;
    private int userID;
    private registeredList registered; 
    public static final int MAX = 20;

    // Constructor initialises the CarUser which is using the class registered to get the userName and userID

    public parkedCar(String nameIn, int idIn) {
        userName = nameIn;
        userID = idIn;
        registered = new registeredList(MAX);
    }

    // Records the details the user made to see if the car is registered
    public boolean addToCarPark(registered addCarIn) {
        return registered.addCarToPark(addCarIn); // return boolean so the method can be called in registeredList
    }

    // Reads the name of the car user
    public String getName() {
        return userName;
    }

    // Reads the ID of the car user 
    public int getID() {
        return userID;
    }

    // Returns if the car is registered or not
    public registeredList getRegistration() {
        return registered;
    }

    // Get a print of the user 
    @Override
    public String toString() {
        return userName = ", " + userID + ", " + registered; 
    }
}
