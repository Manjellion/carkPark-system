package src;
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
    public String carUser() {
        return carUser;
    }

    // get the car user ID
    public int carUserId() {
        return carUserID;
    }   

    // get the car users registration and clarify if its in the system or not
    public String registered(boolean carRegtistertration) {
        if(carRegtistertration == true) {
            return "Car is registered in the System";
        } else {
            return "Car is not registered in the system";
        } 
    }   

    // overriden method to print out the following String when called
    @Override
     public String toString() {
         return "(The car owner " + carUser + ", " + carUserID + ", " + registered(carRegistered) + ")";
     }
}