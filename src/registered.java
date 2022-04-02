package src;
// Class used to identify the records of the car registered 
public class registered {

    private String carUser;
    private int carUserID;
    private boolean carRegistered;
    
    // Constructor created for the class to create object 
    public registered(String carUserName, int carIDinput, boolean carRegtistertration) {
        carUser = carUserName;
        carUserID = carIDinput;
        carRegistered = carRegtistertration;
    }
    
    // get the car user name
    public String carUserName() {
        return carUser;
    }

    // get the car user ID
    public int carUserId() {
        return carUserID;
    }   

    // get the car users registration and clarify if its in the system or not
    public boolean registeredCar() {
        if(carRegistered == true) {
            return true;
        } else {
            return false;
        } 
    }   

    // overriden method to print out the following String when called
    @Override
     public String toString() {
         return "(The car owner " + carUser + ", " + carUserID + ", " + registeredCar() + ")";
     }

    public static boolean addCarToPark(registered addCarIn) {
        return false;
    }
}