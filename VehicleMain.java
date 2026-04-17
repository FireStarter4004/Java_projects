//main class to test inheritance files

public class VehicleMain {

    //main method
    public static void main(String[] args){
        //object for parent class
        Vehicle v1 = new Vehicle("Ford", "focus", "2011", "sedan", 185000);
        v1.displaystats();
        v1.drive(20.0);
        

        //object for child class 1 - electric car
        ElectricCar e1 = new ElectricCar("Tesla", "model 3", "2020", "sedan", 20000, 90.0);
        e1.displayElectricStats();
        e1.drive(20.0);
        

        //object for child class 2 - truck
        Truck t1 = new Truck("ford", "f150", "2025", "truck", 2000, 15000, " gasoline");
        t1.displayTruckStats();
        t1.drive(20.0);
        
    }
    
}
