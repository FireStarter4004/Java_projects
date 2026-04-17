import java.util.Scanner;

public class accountGenerator {
    public static void main(String[]args){
    
    //creating scanner
    Scanner input = new Scanner(System.in);
    
    //top of account generator
    System.out.println("------Account Generator---------\n");
    
    //ask for First name
    System.out.print("enter your first and last name: ");

    //store user input for first name
    String name = input.nextLine();

    //ask for password
    System.out.print("enter your password: ");

    //store user input for password
    String password = input.nextLine();

    //password validation
    System.out.println("------password verification:---------\n");
    
    //uses Length method to check how long the password is and prints it out.
    System.out.println("password length: " + password.length());
    
    //using contains method to check if password contains a certain number
    System.out.println("password contains '2'?: " + password.contains("2"));
    System.out.println("password contains '4'?: " + password.contains("4"));
    System.out.println("password contains '6'?: " + password.contains("6"));
    System.out.println("password contains '8'?: " + password.contains("8"));

    //find index of space from first and last name
    int sIndex = name.indexOf(" ");

    //find first 3 lettesr of last name using substring method
    //substring method starts at sindex to start, and the + 1 moves it over one character, to get rid of the space,
    // and then it  ends with sIndex + 4 to get only the first 3 letters of the Last Name.
    String LastName = name.substring(sIndex + 1, sIndex + 4);
    
    //create username by concatenating first letter from first name and first 3 letters of last name
    String User = name.charAt(0) + LastName;
    
    //new account details
    System.out.println("------New Account Details:---------\n");

    //Making user lower case for username
    System.out.println("user name: " + User.toLowerCase());
    
    //Email creating by concatenating username with "@programming.edu"
    System.out.println("Email: " + User.toLowerCase() + "@programming.edu");
    }
    
}
