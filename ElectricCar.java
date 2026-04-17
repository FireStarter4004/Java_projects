//child class #1

public class ElectricCar extends Vehicle {
    //fields
    private double battery = 80.2;

    //constructor
    public ElectricCar(String make, String model, String year, String carType, double mileage, double battery){
        super(make, model, year, carType, mileage);
        this.battery = battery;
    }

    //getter
    public double getBattery(){
        return battery;
    }


    //method overrriding
    public void drive(double miles){
        super.drive(miles);
        battery = battery - (battery * 0.005) * miles;

        System.out.println("you drove " + miles + " miles, your car's battery life is : " + battery + "%");
    }

    public void displayElectricStats(){
        super.displaystats();
        System.out.println("Battery: " + battery + "%");

    }
    
}
