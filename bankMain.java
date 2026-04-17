import java.util.Scanner;
public class bankMain {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        //asking for password to get into account
        System.out.println("welcome to the my ATM, please enter your password, you get 3 attempts!");
        System.out.println("please enter password: ");
        

        //assigning value to accessPassword
        String accessPassword = "0403";


        int attempts = 0;

        while (attempts < 3){

            //store user input for password
            String enteredPassword = input.nextLine();
            
            if (enteredPassword.equals(accessPassword)){
                System.out.println("Access granted, welcome to your account!");
                break;
            }
            else{
                attempts++;
                System.out.println("Incorrect password, please try again, you have " + (3 - attempts) + " attempts remaining.");
                
            }
            
        }
        if (attempts == 3){
            System.out.println("LOCKED OUT!!");
            System.exit(0);
        }
        
        
        //create a bank account object from BankAccount.java
        BankAccount checking = new BankAccount("Kenzie", "checking", 100, "0403");
        BankAccount savings = new BankAccount("Kenzie", "savings", 500, "0403");


        while (true){
            displayMenu();
            int choice = input.nextInt();

            if (choice == 1){
                System.out.println(" you have choosen to deposit funds, please enter amount you would like to deposit below!");
                
                int amount = input.nextInt();
                checking.deposit(amount);
                
            }
            else if (choice == 2){
                System.out.println("you have choosen to withdraw funds, please enter amount you would like to withdraw below!");
                int amount = input.nextInt();
                checking.withdraw(amount);
            }
            else if (choice == 3){
                System.out.println("you have choosen to transfer funds, please enter amount you would like to transfer below!");
                int amount = input.nextInt();
                BankAccount target = savings;
                checking.transferto(target, amount);
            }
            else if(choice == 4){
                System.out.println("you have choosen to apply monthly interest, interest is 0.25% monthly.");
                checking.applyMonthlyInterest();
            }
            else if(choice == 5){
                System.out.println("you have choosen to view account sumamary, account info below!");
                checking.printAccountSummary();
                savings.printAccountSummary();
            }
            else if(choice == 6){
                System.out.println("you have choosen to exit, have a good day!");
                System.exit(0);
            }
            else{
                System.out.println("invalid choice, choose again!");
            }
        }
    }

public static void displayMenu(){
    //display options for user to choose from
    System.out.println("ATM Menu");
    System.out.println("""
    1. Deposit Funds
    2. Withdraw Funds
    3. Transfer Funds
    4. Apply Monthly Interest
    5. View Account Summary
    6. Exit System

    Please enter choice below!:
    """);
}
}
