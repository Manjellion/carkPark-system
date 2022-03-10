public class carParkedTester {
    public static void main(String[] args) {
        // test create an object
        parkedCar user1 = new parkedCar("Manjil", 001, true);

        // test out different methods
        System.out.println("Name: " + user1.carUser());
        System.out.println("ID: " + user1.carUserId());
        System.out.println("Registerd: " + user1.registered(true));

        // test out toString method overidden
        System.out.println(user1);
    }
}
