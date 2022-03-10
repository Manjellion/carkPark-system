public class carParkedTester {
    public static void main(String[] args) {
        // test create an object
        parkedCarList user1 = new parkedCarList(50);
        parkedCar user1Test = new parkedCar("Manjil", 1, true);
        user1.addCarToPark(user1Test);
        // test out different methods
        System.out.println("Total: " + user1.getTotal());
        user1.removeCarToPark(user1Test);
        System.out.println("Total: " + user1.getTotal());
        // test out toString method overidden
        System.out.println(user1);
    }
}
