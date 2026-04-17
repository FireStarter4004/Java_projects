import java.util.Scanner;

public class SMS {
    public static void main(String[]args){

        System.out.println(" ----------------------Student Management System----------------------");
        
        //creating scanner
        Scanner input = new Scanner(System.in);

        //creating varaiables
        int d1 = 0;
        int d2 = 0;

        //Master While loop
        while (d1 == 0){
            
            //asking for student's name
            System.out.println(" please enter student's first and last name(enter done to quit!): ");

            //store user input for name
            String name = input.nextLine();

            if (name.equalsIgnoreCase("done")){
                System.out.println(" have a good day!");
                break;
            }
            while (d2 == 0){

                //student management system menu
                System.out.println("""
                \nStudent Management System:
                1. Student Information
                2. GPA Information
                3. Scholarship Information
                4. Finished with Student( returns you to name entry)

                please enter your choice: 
                """);

                //store user input for choice
                int choice = input.nextInt();

                if (choice == 1){
                    System.out.println(" you have choosen Student Information");

                    //clear scanner input
                    input.nextLine();

                    //asking for major
                    System.out.println("Please enter your major: ");

                    //store user input for major 
                    String major = input.nextLine();

                    //asking for student classification
                    System.out.println("\n please enter Student's Classification: ");
                    System.out.println("(Freshman)(Sophmore)(Junior)(Senior)");
                    System.out.println("Please enter choice below: ");

                    //store user input for classification
                    String classification = input.nextLine();

                    //asking if student lives in state or out of state
                    System.out.println("Does the Student live in state or out of state of college?");
                    System.out.println("Please enter choice below: ");

                    //store user input for state
                    String state = input.nextLine();

                    //displaying information gained
                    System.out.println("\nInformation Entered: ");
                    System.out.println("Student's name is: " + name);
                    System.out.println("Student's major: " + major);
                    System.out.println("Student's classification: " + classification);
                    System.out.println("Student's home: " + state);
                }
                else if(choice == 2){
                    
                    System.out.println("you have choosen GPA Information");

                    // clear scanner input
                    input.nextLine();
                    
                    //asking for GPA 
                    System.out.println("please enter your GPA below: ");

                    //storing user input for GPA 
                    Double GPA = input.nextDouble();

                    //if else statement for whether GPA is higher or lower then 3.0
                    if(GPA < 3.0){
                        System.out.println("\nStudent's name: " + name);
                        System.out.println("Student's GPA is " + GPA);
                        System.out.println("Student is not eligible for the honors program");
                    }
                    else if (GPA >= 3.0){
                        System.out.println("\nStudent's name: " + name);
                        System.out.println("Student's GPA is " + GPA);
                        System.out.println("Student is eligible for the honors program");
                    }
                    else{
                        System.out.println(" \nsorry thats an invalid input!");
                    }
                }

                else if (choice == 3){
                    System.out.println(" you have choosen Scholarship Information");

                    //clear scanner input
                    input.nextLine();

                    //asking for family income
                    System.out.println(" please enter your family's income: ");

                    //store user input for family's income
                    int income = input.nextInt();

                    //if else statement to determine aid given based on family income
                    if (income < 40000){
                        System.out.println("\nStudent's name: " + name);
                        System.out.println("this student is eligible for financial aid, grants, and school Scholarships!");
                    }
                    else if (income >= 40000 && income <= 60000){
                        System.out.println("\nStudent's name: " + name);
                        System.out.println("this student is eligible for financial aid and grants!");
                    }
                    else if (income > 60000){
                        System.out.println("\nStudent's name: " + name);
                        System.out.println("this student is eligible for financial aid!");
                    }
                    else{
                        System.out.println("sorry that is an invalid input!");
                    }

                }

                else if(choice == 4){
                    
                    System.out.println(" you have choosen finished with student!");
                    
                    // clear scanner input 
                    input.nextLine();

                    break;
                }

                else{
                    System.out.println("sorry that's not a valid input!");
                }
            }
        }

    }    
}
