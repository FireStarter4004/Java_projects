import java.util.Scanner;
/**
 * this program is to show how to work with conditionals in java.
 */


public class conditionals {

    public static void main(String[]args){
    
    //variable to use in if statement
    int age = 22; 

    //if statement 
    if(age < 21){
        
        System.out.println("this person is under 21 years old");
    //end of if statement
    }
    //variable to use in if else statement
    int grade = 80;

    //if else statement
    if (grade == 100){
        System.out.println("you got 100%");
    }
    else{
        System.out.println("you did not get a perfect score");
    }

    //using logical operators and else if statements
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your GPA in a range of 0.0 to 4.0: ");
    double gpa = input.nextDouble();//storing the users input
    //if else if statement
    if (gpa == 0){
        System.out.println("you need to raise your GPA up now");

    }
    else if(gpa > 0 && gpa < 1.5){//using comparison and logical operators
        System.out.println("your GPA is low ");

    }
    else if(gpa > 3.5 || gpa == 4.0){
        System.out.println("You have a great GPA, keep it up!");
        
        //nested conditional
        if (gpa == 4.0){
            System.out.println("you have a perfect GPA, Good job!");
        }
        else{
            System.out.println("keep working hard, you're almost there!");
        }
    }
    else{
        System.out.println("the GPA checker is having issues");

    }
    
    }
    
}
