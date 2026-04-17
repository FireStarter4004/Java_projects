import java.util.Scanner;

public class whileloops {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number(1-30): ");

        int guess = input.nextInt();//hold user guess
        int number = 24; //number to guess
        
        //while loops
        while (guess != number){
            System.out.println("\nSorry your guess is incorrect!");

            System.out.println("Enter your guess again(1-30): ");
            guess = input.nextInt();//allows user to input new number
        
        }//end of while loop 
        
        System.out.println("\nyou finally guessed the right number!");

        int userChoice;
        //do while loops
        do{
            System.out.println("Menu Options");
            System.out.println("""
            1. deposit
            2. withdrawl
            3. Exit
            """);
            
            System.out.println("Enter a menu number: ");
            userChoice = input.nextInt();

            if (userChoice == 1){
                System.out.println("option 1");
            }
            else if (userChoice == 2){
                System.out.println("option 2");
            }

        }while(userChoice != 3);
        
        //sentinal values - used to signal end of loop
        System.out.println("enter in prices(Type -1 to finish)");//sentinel value is negative 1
        
        //while loop
        while (true){
            
            //declaring variables
            double total = 0;
            double price = 0;
            while(true){
                price = input.nextDouble();

                if (price == -1){
                    break;//breaks the loop
                
                }
                total += price;//updates our total with entered prices
            }
            System.out.println("The total is: " + total);
        }




    }//end of main
    
}//end of class
