//parent class

public class Vehicle {

    //fields
    private String make;
    private String model;
    private String year;
    private String carType;
    private double mileage;

    //constructor
    public Vehicle(String make, String model, String year, String carType, double mileage){
        this.make = make;
        this.model = model;
        this.year = year;
        this.carType = carType;
        this.mileage = mileage;
    }

    //methods - getters
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getYear(){
        return year;
    }

    public String getCarType(){
        return carType;
    }

    public double getMileage(){
        return mileage;
    }
    
    //methods - instance methods

    public void drive (double miles){
        System.out.println("Starting mileage: " + mileage);
        
        mileage = mileage + miles;

        System.out.println("Miles driven: " + miles);

        System.out.println("current mileage: " + mileage);
    }

    public void displaystats(){
        System.out.println("Year: " + year);
        System.out.println("Make: " + make);
        System.out.println("model: " + model);
        System.out.println("Car Type: " + carType);
        System.out.println("Mileage: " + mileage);
    }

}
