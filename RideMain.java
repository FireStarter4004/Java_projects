//Main class to test our inheritance files

public class RideMain {

    public static void main(String[] args){

        //ride objects

        //object 1 - economy ride
        //parentclass objectName = new ChildClassName(parameters);
        Ride r1 = new EconomyRide(15, "Morning commute");

        //print out object info
        System.out.println(r1.getName() + " (" + r1.getRideType() + ") costs: $" + r1.calculatePrice());


        //object 2 - premium ride
        Ride r2 = new PremiumRide(30,"Night commute");

        //print out info
        System.out.println(r2.getName() + " (" + r2.getRideType() + ") costs: $" + r2.calculatePrice());


        //creating a object from child class not parent 
        EconomyRide r3 = new EconomyRide(15,"morning commute");

        System.out.println(r3.getName() + " (" + r3.getRideType() + ") costs: $" + r3.calculatePrice());
        System.out.println(r3.getRideCar());

    }
    
}
