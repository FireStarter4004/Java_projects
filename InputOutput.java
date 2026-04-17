import java.util.Scanner;

/*
*
*
*testing and using input and output in java program
*/

public class InputOutput {
    
    public static void main(String[]args){

    // create scanner object
    Scanner input = new Scanner(System.in);
    
    // print a message to the user for what they need to enter
    System.out.println("enter your age: ");
    
    //store user input for age
    int age = input.nextInt(); // scanner expects int and stores to age variable
    
    //clear scanner
    input.nextLine();
        
    //print user age input
    System.out.println("your age: " + age);
    
    // asking a user to enter their name - text
    System.out.println("enter your name: ");
    
    String name = input.nextLine(); // scanner expects text

    System.out.println("your name is: " + name );

    // asking a true or false question
    System.out.println("are you a student? true or false: ");

    //ask for boolean input
    boolean student = input.nextBoolean();
    
    //print boolean output
    System.out.println("Student Status: " + student);
    
    // ask for a double input
    System.out.println("what is your GPA: " );
    
    // ask for a GPA to be entered
    double gpa = input.nextDouble(); 
    //print out the GPA
    System.out.println("Student GPA: " + gpa);

    }
}
