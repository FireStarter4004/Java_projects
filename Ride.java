//parent class

public class Ride {
    
    //fields or variables
    private double distance;
    private String name;

    //constructor
    public Ride(double distance, String name){
        this.distance = distance;
        this.name = name;
    }
    
    //methods
    //getters
    public double getDistance(){
        return distance;
    }

    public String getName(){
        return name;
    }

    public double calculatePrice(){
        return distance * 1.0;
    }

    public String rideType(){
        return "generic ride";
    }

    public String getRideType(){
        return rideType();
    }
    
    
}
