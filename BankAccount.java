

public class BankAccount {

    //fields
    private String accountHolder;
    private String accountNumber;
    private String accountType;
    private double balance;
    private String accessPassword;
    private String enteredPassword;



    //constructor
    public BankAccount(String accountHolder, String accountType, double InitialDeposit, String password){
        //connect back to the fields
        this.accountHolder = accountHolder;

        //setter to validate account type
        setaccountType(accountType);

        //initial deposit, must be >= 0
        setInitialDeposit(InitialDeposit);

        //checks if password is correct before allowing access
        checkPassword(password);

        //generate account number
        this.accountNumber = generateAccountNumber();

        //assigning values
        this.accessPassword = "0403";

    }

    //getters - read only access to the data
    public String getaccountHolder(){
        return accountHolder;
    }

    public String getaccountNumber(){
        return accountNumber;
    }

    public String getaccountType(){
        return accountType;
    }

    public double getbalance(){
        return balance;
    }
    public String getaccessPassword(){
        return accessPassword;
    }
    public String getenteredPassword(){
        return enteredPassword;
    }


    //setters - control data updates
    
    //make sure account type is checking or savings
    public void setaccountType(String accountType){
        if(accountType.equals("checking") || accountType.equals("savings")){
            this.accountType = accountType;
        }
    }

    //checks if password is correct before allowing access
    public boolean checkPassword(String enteredPassword){
        if (enteredPassword.equals(accessPassword)){
            return true;
        }
        else{
            return false;

        }
    }
    //make sure initial deposit is greater than or equal to 0
    public void setInitialDeposit(double InitialDeposit){
        if(InitialDeposit >= 0){
            this.balance = InitialDeposit;
        }
        else{
            System.out.println("Sorry, Inital deposit must be greater than or equal to 0, balance not updated!");
            InitialDeposit = 0;
        }
    }

    //instance methods
    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
        }
    }

    public void transferto(BankAccount target, double amount){
        if (amount > 0 && amount <= balance){
            this.withdraw(amount);
            target.deposit(amount);
        }
    }

    public void applyMonthlyInterest(){
        balance = balance +(balance * 0.0025); //25% monthly interest rate
    }
    
    public void printAccountSummary(){
        System.out.println("=========================================================");
        System.out.println("Account Holder: " + getaccountHolder());
        System.out.println("Account Number: " + getaccountNumber());
        System.out.println("Account Type: " + getaccountType());
        System.out.println("Balance: $" + getbalance());
        System.out.println("=========================================================");
    }

    //generate account number 
    private String generateAccountNumber(){

        //creating the prefix based on account type
        String prefix = accountType.substring(0,3).toUpperCase(); //will take the first 3 letters of the account type

        //generate a random 6 digit number
        int random = (int)(Math.random() * 900000) + 100000; //this will generate a random 6 digit number

        return prefix + "-" + random; //will return the prefix and the random number together as a account number
        
        
    }


    
}
