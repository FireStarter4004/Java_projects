//child class #2 for Ride.java

public class PremiumRide extends Ride {
    
    //constructor
    public PremiumRide(double distance, String name){

        //call parent class
        super(distance, name);
    }

    //method overriding
    public double calculatePrice(){
        return 5.00 + (getDistance() * 1.75);
    }

    public String getRideType(){
        return "premium ride";
    }
}
