//child class #2

public class Truck extends Vehicle {

    //fields
    private double loadAmount;
    private String fuelType;

    //constructor
    public Truck(String make, String model, String year, String carType, double mileage, double loadAmount, String fuelType){
        super(make, model, year, carType, mileage);
        this.loadAmount = loadAmount;
        this.fuelType = fuelType;
    }

    //method overriding
    public void displayTruckStats(){
        super.displaystats();
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Load Amount: " + loadAmount + " lbs");
    }
    
}
