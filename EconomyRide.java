//child class #1 for Ride.java

public class EconomyRide extends Ride{
    //constructor
    public EconomyRide(double distance, String name){

        //call the parent class
        super(distance, name);
    }

    //method overriding
    public double calculatePrice(){
        return getDistance() * 0.90;
    }

    public String getRideType(){
        return "economy ride";
    }
    public String getRideCar(){
        return "this car is a standard 4-door car with a max occupancy of 4 people.";
    }
}
