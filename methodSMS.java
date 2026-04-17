import java.util.Scanner;


public class methodSMS {
    // Declare scanner as a class-level variable
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[]args){
        System.out.println("------------------------welcome to the Student Management System!---------------------------");

        //calls mainMenu method
        mainMenu();
    }
    //mainMenu method 
    public static void mainMenu(){
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(" \nStudent Management System ");

        //prints student management menu
        System.out.println("""
        1. Student Information
        
        2. GPA Information

        3. Scholarship Information

        4. Enter new Student

        5. Exit System

        Please choose choice below! 
        """);

        //stores user input for choice
        int choice = input.nextInt();

        //if else statement for choice
        if (choice == 1){
            //calls student info method
            studentInfo();
        }

        else if (choice == 2){
            //calls GPA info method
            GPAInfo();
        }

        else if (choice == 3){
            //calls scholar info method
            scholarInfo();
        }

        else if (choice == 4){
            //calls new student method
            newStudent();
        }
        
        else if (choice == 5){
            //calls exit System Method
            exitSystem();
        }

        // needed incase of invalid input
        else{
            System.out.println("sorry, that's not an option!");

            //calls mainMenu method
            mainMenu();
        }
        return;

    }

    //Student information method
    public static void studentInfo(){

        //clear scanner
        input.nextLine();

        //welcome message to student information
        System.out.println(" You have choosen Student information!");
        System.out.println(" we will now ask you to enter some information.");

        //asking for student name
        System.out.println("\nPlease enter Student's name: ");

        //stores user input for name
        String name = input.nextLine();

        //asking for student major
        System.out.println("\nPlease enter Student's major: ");

        //storing user input for major
        String major = input.nextLine();

        //asking for student classification
        System.out.println("\nplease enter student's Classification(freshman,sophmore,junior,senior): ");

        //store user input for student classification
        String classification = input.nextLine();

        //asking if student is in or out of state
        System.out.println(" \nPlease enter whether student is in or out of state: ");

        //store user input for whether student is in or out of state
        String state = input.nextLine();

        //displaying all entered information
        System.out.println("\n all information entered: ");

        System.out.println("Name: " + name);

        System.out.println("Major: " + major);

        System.out.println("Classification: " + classification);

        System.out.println("in or out of state: " + state);

        //calls mainMenu method
        mainMenu();
    }

    //method for GPA information
    public static void GPAInfo(){

        //clear scanner
        input.nextLine();

        //welcome message
        System.out.println("You have choosen GPA Information!");
        
        //asking user for GPA 
        System.out.println("We will now ask you to enter your GPA below: ");

        //store user for GPA 
        if (input.hasNextDouble()){
            Double GPA = input.nextDouble();

            //if statement that determines whether they are eligible for honors based on GPA 
            if (GPA < 3.0){
                System.out.println(" Student's GPA is: " + GPA);
                System.out.println("This student is not eligible for the honors program");
            }
            
            else if (GPA >= 3.0){
                System.out.println("Student's GPA is: " + GPA);
                System.out.println("this student is a honors student!");
            }
        }
        else{
            System.out.println("sorry this is not a valid input");
            
            //clear input
            input.nextLine();
        }
        //calls mainMenu method
        mainMenu();
    }

    //method for Scholarship information
    public static void scholarInfo(){

        //clear scanner
        input.nextLine();
        
        //welcome message
        System.out.println("You have choosen Scholarship Information!");
        
        //asking user for family's income
        System.out.println("please enter your family's income");

        //store user input for family's income
        int income = input.nextInt();

        //if statement that determines aid depending on family's income
        if (income < 40000){
            System.out.println("this student is eligible for financial aid, grants, and school scholarships.");
        }

        else if (income >= 40000 && income <= 60000){
            System.out.println("this student is eligible for financial aid and grants.");
        }

        else if (income > 60000){
            System.out.println("this student is eligible for financial aid");
        }

        //calls mainMenu method
        mainMenu();
    }

    //method for new student
    public static void newStudent(){

        //clear scanner
        input.nextLine();
        
        System.out.println(" you have choosen new student!");
        
        //calls mainMenu method
        mainMenu();
    }

    //method for exiting the system
    public static void exitSystem(){
        
        //clear scanner
        input.nextLine();
        
        //welcome message
        System.out.println("hello, are you sure you would like to exit the program?");
        
        //asking if they want to exit
        System.out.println("please enter (yes/no) below: ");
        
        //store user input for exit
        String exit = input.nextLine();

        //if statement for whether user wants to exit or not
        if (exit.equalsIgnoreCase ("yes")){
            System.out.println("Have a good day!");
            System.exit(0);
        }
        else if (exit.equalsIgnoreCase ("no")){
            System.out.println("okay, bringing you back to main menu!");
            
            //calls mainMenu method
            mainMenu();
        }

    }
}
