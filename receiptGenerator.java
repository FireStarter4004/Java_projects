import java.util.Scanner;

/*
Kyler Brungerwood
this is a program that generates a reciept based on what the user orders for food
*/
public class receiptGenerator {
    public static void main(String[]args){
        //prices for each food item
        double appetizerPrice = 8.99;
        double mealPrice = 16.99;
        double dessertPrice = 5.99;

        //create scanner object
        Scanner input = new Scanner(System.in);
        // ask for table number
        System.out.println("enter the table number: ");
        //store user input for table number
        int tableNumber = input.nextInt();
        
        //clear scanner
        input.nextLine();

        //ask for user name
        System.out.println("enter your name: ");
        
        //store user input for name
        String name = input.nextLine();
        
        // ask for number of appetizers ordered
        System.out.println("enter number of appetizers ordered: ");
        
        //store user input for appetizers
        int appetizers = input.nextInt();

        // ask for number of meals ordered
        System.out.println("enter number of meals ordered: ");

        //store user input for meals
        int meals = input.nextInt();

        //ask for number of desserts ordered
        System.out.println("enter number of desserts ordered: ");

        //store user input for desserts
        int desserts = input.nextInt();
        
        //ask for number of people at table
        System.out.println("number of people at table: ");

        //store user input for number of people at the table
        int people = input.nextInt();
        
        //calculate appetizer cost by multiplying number of appetizers ordered by appetizer price
        double appetizerCost = appetizers * appetizerPrice;

        //calculate meal cost per by multiplying number of meals ordered by meal price
        double mealCost = meals * mealPrice;

        //calculate dessert cost by multiplying number of desserts ordered by dessert price
        double dessertCost = desserts * dessertPrice;

        //calculate total cost by multiplying appetizer cost, meal cost and dessert cost
        double Subtotal = appetizerCost + mealCost + dessertCost;
        //calculate tax
        double tax = Subtotal * 0.08;
        //calculate tip 
        double tip = Subtotal * 0.18;
        
        //calculate total cost by adding subtotal, tax and tip
        double totalCost = Subtotal + tax + tip;

        // calculate cost per person by dividing total cost by number of people
        double costPerPerson = totalCost / people; 

        //print out the Order entry
        System.out.println("---Eat4hours Restaurant: Order entry---");

        System.out.print("Table Number: " + tableNumber);

        System.out.println("  Name:" + name);

        System.out.println("Number of appetizers: " + appetizers);

        System.out.println("Number of meals: " + meals);

        System.out.println("Number of desserts: " + desserts);

        System.out.println("Number of people at table: " + people);
        
        //print out the reciept
        //formatting used to round to 2 decimal places for subtotal, tax, tip, total cost, and cost per person
        System.out.println("--- GENERATING RECEIPT ---");
        System.out.println("Customer: " + name);

        System.out.println("table Number: " + tableNumber);

        System.out.print("Subtotal: $");
        System.out.printf("%.2f%n", Subtotal);

        System.out.print("Tax(8$): $");
        System.out.printf("%.2f%n", tax);

        System.out.print("Tip(18%): $");
        System.out.printf("%.2f%n", tip);

        System.out.print("total cost: $");
        System.out.printf("%.2f%n", totalCost);

        System.out.print("cost per person: $");
        System.out.printf("%.2f%n", costPerPerson);

        System.out.println("--------------------------------------------");

    }
    
}
