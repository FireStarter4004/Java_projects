import java.util.Scanner;
/**
 * this program lets users input their information to find the best Educational path for them in life.
 * @param args
 */
public class education {
    public static void main(String[]args){
        
        //creating title
        System.out.println("---------Educational path finder---------\n");

        //creating scanner
        Scanner input = new Scanner(System.in);

        //input for user's name
        System.out.println("Please enter your name: ");
        
        //Store user input for name
        String name = input.nextLine();

        //creating space between inputs
        System.out.println("\n");

        //Input for user's age
        System.out.println("Please enter your age: ");

        //store user input for age
        int age = input.nextInt();

        //if statement for age
        if (age < 16){
            System.out.println("sorry you're too young!");
            System.exit(0);
        }

        //clear Scanner 
        input.nextLine();

        //second title asking which path interests the user
        System.out.println("\n---------Which path interests you?---------\n");

        //creating options for the user to choose from
        System.out.println("""
            1. Trade School
            2. 2-year college
            3. 4-year college

        """);
        System.out.println("Please enter Choice: ");

        //input for the user's choice
        String choice = input.nextLine();

        //if statement to determine which path is best for the user.
        if(choice.equalsIgnoreCase("Trade School")){
            System.out.println("You selected Trade School");
            
            System.out.println("\nPlease enter your Trade of interest: ");
            
            System.out.print("""
                1. Welding
                2. HVAC
                3. Electrician.
            """);
            
            System.out.println("Please enter Choice: ");
            
            //stores user input for trade of interest
            String trade = input.nextLine();
            
            //declare variables for trade choices
            int WelderChoice = 0;
            int HvacChoice = 0;
            int ElectChoice = 0;
            
            //nested conditonal statement
            if(trade.equalsIgnoreCase("welding")){
                System.out.println("Welding is a great choice,");
                System.out.println("""
                    Please choose between (1 and 2):
                    1. Check Average Salary:
                    2. Contact Admissions:
                """);
                
                System.out.println("Please enter Choice: ");

                //stores user input for TradeChoice
                WelderChoice = input.nextInt();
                //Nested if statement to display average salary if they choose 1, and admissions info if they choose 2
                if(WelderChoice == 1){
                    System.out.println("The average Salary for a welder is $50,000 a year.");
                }
                else if(WelderChoice == 2){
                    System.out.println("The information for admissions is: ");
                    System.out.println("ECPI University, #:866-744-7617");
                }
            }
            //else if statement for HVAC
            else if(trade.equalsIgnoreCase("HVAC")){
                System.out.println("HVAC is a great choice");
                System.out.println("""
                    Please choose between (1 and 2):
                    1. Check Average Salary:
                    2. Contact Admissions:
                """);

                System.out.println("Please enter Choice: ");

                //stores user input for HVAC Choice
                HvacChoice = input.nextInt();

                //Nested If statement to display Salary
                if(HvacChoice == 1){
                    System.out.println("The average salary for a HVAC is $64,000 ");
                }
                else if(HvacChoice == 2){
                    System.out.println("the information for admissions is: ");
                    System.out.println("Fortis College, #:855-367-8471");
                }
                else{
                    System.out.println("sorry that's not an option!");
                    System.exit(0);
                }
                
            }
            //else if statement for Electrician
            else if(trade.equalsIgnoreCase("Electrician")){
                System.out.println("Electrician is a great choice");
                System.out.println("""
                        Please choose between (1 and 2):
                        1. Check Average Salary:
                        2. Contact Admissions:
                """);

                System.out.println("Please enter Choice: ");

                //stores user input for Electrician Choice
                ElectChoice = input.nextInt();

                //Nested If statement to display Salary
                if(ElectChoice == 1){
                    System.out.println("The average salary for a Electrician is $47,000 ");
                }
                //nested else if statement to display admission's information
                else if(ElectChoice == 2){
                    System.out.println("the information for admissions is: ");
                    System.out.println("ECPI University, #:866-744-7617");
                }


            }
            //else statement to end program
            else{
                System.out.println("sorry that's not an option");
                System.exit(0);
            }
            if(WelderChoice == 1){
                System.out.println("\ninfo from Education planner: ");
            
                System.out.println("Name: "+name);
            
                System.out.println("Age: "+age);

                System.out.println("The average Salary for a welder is $50,000 a year.");

                System.out.println("-------Have a good day!-------");
            }
            else if(WelderChoice == 2){
                System.out.println("\ninfo from Education planner: ");
            
                System.out.println("Name: "+name);
            
                System.out.println("Age: "+age);

                System.out.println("The information for admissions is: ");
                System.out.println("ECPI University, #:866-744-7617");

                System.out.println("-------Have a good day!-------");
            }
            if(HvacChoice == 1){
                System.out.println("\ninfo from Education planner: ");
            
                System.out.println("Name: "+name);
            
                System.out.println("Age: "+age);

                System.out.println("The average salary for a HVAC is $64,000 ");

                System.out.println("-------Have a good day!-------");
            }
            else if(HvacChoice == 2){
                System.out.println("\ninfo from Education planner: ");
            
                System.out.println("Name: "+name);
            
                System.out.println("Age: "+age);

                System.out.println("the information for admissions is: ");
                System.out.println("Fortis College, #:855-367-8471");
                System.out.println("-------Have a good day!-------");
            }
            

            if(ElectChoice == 1){
                System.out.println("\ninfo from Education planner: ");
            
                System.out.println("Name: "+name);
            
                System.out.println("Age: "+age);

                System.out.println("The average salary for a Electrician is $47,000 ");
                System.out.println("-------Have a good day!-------");
            }
                
            else if(ElectChoice == 2){
                System.out.println("\ninfo from Education planner: ");
            
                System.out.println("Name: "+name);
            
                System.out.println("Age: "+age);

                System.out.println("the information for admissions is: ");
                System.out.println("ECPI University, #:866-744-7617");
                System.out.println("-------Have a good day!-------");
            }
            

        }
        //else if statement for choice
        else if(choice.equalsIgnoreCase("2-year college") || choice.equalsIgnoreCase("2 year college")){
            System.out.println("you selected 2-year College");
            System.out.println("please choose between (1-3)");
            
            System.out.print("""
                1. Transfer calculator
                2. Desired major
                3. Tuition info
            """);

            System.out.println("please enter your choice: ");
            int twoYearChoice = input.nextInt();
            
            //declaring variables for credits
            int AssociatesDegree = 0;
            int CCredits = 0;

            //clear scanner
            input.nextLine();
            
            if(twoYearChoice == 1){
                //Transfer calculator
                
                System.out.println("we will now calculate the remaining credits need to graduate, please enter current amount of credits");

                System.out.println("Please enter your credit amount: ");
                    
                //stores user input for current credits
                CCredits = input.nextInt();
                    
                //finding associates degree by subtracting 60 by current credits
                AssociatesDegree = 60 - CCredits;

                //math for CCredits to see if they are under 30 credits
                if (CCredits < 30){
                    System.out.println("you need to attend the school for 2 years.");
                }
                //math for CCredits to see if they have or are over 30 credits
                else if(CCredits >= 30){
                    System.out.println("you will be graduating within a year!");
                }
                System.out.println(" you are "+ AssociatesDegree +" credits from getting an associates degree!");

                //calculates remaning credits times 800 to get total cost
                int TotalCost = AssociatesDegree * 800;
            
                System.out.println("Total cost for remaining credit hours: " + TotalCost);

                System.out.println("\ninfo from Education planner: ");

                System.out.println("Name: "+name);
            
                System.out.println("Age: "+age);

                if (CCredits <30){
                    System.out.println("you will need to stay for the 2 years");
                }
            
                else if (CCredits >= 30){
                    System.out.println("you will be graduating within a year!");
                }

                System.out.println(" you are "+ AssociatesDegree +" credits from getting an associates degree!");

                System.out.println("your total tuition for your remaining credits are: "+TotalCost);

                System.out.println("-------Have a good day!-------");
            
            }
            if(twoYearChoice == 2){
                //asking for desired major
                System.out.println("please enter your desired major!");
            
                //stores input for desired major
                String major = input.nextLine();

                //calculates remaning credits times 800 to get total cost
                int TotalCost = AssociatesDegree * 800;

                //information for 2 year, option 2 printed out
                System.out.println("\ninfo from Education planner: ");

                
                System.out.println("Name: "+name);
                
                System.out.println("Age: "+age);
            
                System.out.println(" youre desired major is: " + major);

                System.out.println("-------Have a good day!-------");
            }
            //else if statemetn for choice 3 of 2 year college
            else if(twoYearChoice == 3){
                System.out.println(" you have choosen tuition info");

                System.out.println("\ninfo from Education planner: ");

                System.out.println("Name: "+name);
                
                System.out.println("Age: "+age);
            
                System.out.println("the cost per credit hour is 800.");

                System.out.println("-------Have a good day!-------");

            }
            
        }
        // else if statement for 4 year college
        else if(choice.equalsIgnoreCase("4-year college") || choice.equalsIgnoreCase("4 year college")){
            System.out.println("you selected 4-year College");
            System.out.println("please choose between (1-3)");
            
            System.out.print("""
                1. Cost estimator
                2. Dorm Selector
                3. Application checklist
            """);

            System.out.println("Please enter choice below: ");
            
            //Declaring 4 year choice variable
            int fourYearChoice = 0;

            //Stores user input for 4 year choice variable
            fourYearChoice = input.nextInt();


            //declaring variables for 4 year college
            int StateCollege = 0;

            int singleDorm = 5000;

            int doubleDorm = 8000;

            int inState = 0;
            int outState = 0;

            if(fourYearChoice == 1){
                //clear scanner
                input.nextLine();

                System.out.println(" You have choosen Cost Estimator");
                System.out.println("Are you doing in state college or out of state college?: ");

                System.out.println("""
                    Are you doing in state or out of state college, 
                    Please choose between (1-2)!
                    1. in State College
                    2. Out of state college
                    
                """);
                System.out.println("Please enter below: ");

                //Stores user input for State College
                StateCollege = input.nextInt();

                //if statement for in and out of state college
                if(StateCollege == 1){
                    //making variable inState 120 credit hours time 600 dollars
                    inState = 120 * 600;

                    System.out.println("You have choosen in state college!");

                    System.out.println("\ninfo from Education planner: ");

                    System.out.println("Name: "+name);
                
                    System.out.println("Age: "+age);
            
                    System.out.println(" total cost for your 4 years is " + inState);

                    System.out.println("-------Have a good day!-------");
                    
                }
                else if(StateCollege == 2){
                    //clear Scanner
                    input.nextLine();

                    //making outState variable 120 credit hours times 800 dollars
                    outState = 120 * 800;

                    System.out.println("You have choosen out of state college!");

                    System.out.println("\ninfo from Education planner: ");

                    System.out.println("Name: "+name);
                
                    System.out.println("Age: "+age);
            
                    System.out.println(" total cost for your 4 years is " + outState);

                    System.out.println("-------Have a good day!-------");

                }
                else{
                    System.out.println(" Sorry that is not a choice!");
                    System.exit(0);
                }
            
            }
            //else if statement for 4 year college choice
            else if(fourYearChoice == 2){
                //clear Scanner
                input.nextLine();

                System.out.println(" you have choosen Dorm Selector!");
                
                System.out.println("""
                    Please choose from these dorms!
                    1.Single
                    2.Double
                """);

                
                System.out.println("please enter Dorm choice below!");

                String Dorm = input.nextLine();

                if (Dorm.equalsIgnoreCase("Single")){

                    System.out.println("\ninfo from Education planner: ");

                    System.out.println("Name: "+name);
                    
                    System.out.println("Age: "+age);

                    System.out.println("Single dorms cost 5000 for the 4 years");

                    System.out.println("-------Have a good day!-------");

                    
                    /**if (StateCollege == 1){
                        
                        //multiplying instate tuition and the cost of a single dorm
                        int singleIn = inState * singleDorm;
                        
                        System.out.println("\ninfo from Education planner: ");

                        System.out.println("Name: "+name);
                
                        System.out.println("Age: "+age);
            
                        System.out.println("youre total cost added with tuition is " + singleIn);

                        System.out.println("-------Have a good day!-------");
                    }
                    else if (StateCollege == 2){

                        // multiplying out of state and cost of single dorm
                        int singleOut = outState * singleDorm;

                        System.out.println("\ninfo from Education planner: ");

                        System.out.println("Name: "+name);
                
                        System.out.println("Age: "+age);
            
                        System.out.println("youre total cost added with tuition is " + singleOut);

                        System.out.println("-------Have a good day!-------");
                    }*/
                }
                else if (Dorm.equalsIgnoreCase("Double")){
                    System.out.println("\ninfo from Education planner: ");

                    System.out.println("Name: "+name);
                    
                    System.out.println("Age: "+age);

                    System.out.println("Double dorms cost 8000 for the 4 years");

                    System.out.println("-------Have a good day!-------");

                    /**if (StateCollege == 1){
                        //multiplying instate tuition and the cost of a double dorm
                        int doubleIn = inState * doubleDorm;

                        System.out.println("\ninfo from Education planner: ");

                        System.out.println("Name: "+name);
                
                        System.out.println("Age: "+age);
            
                        System.out.println("youre total cost added with tuition is " + doubleIn);

                        System.out.println("-------Have a good day!-------");
                    }
                    else if (StateCollege == 2){
                        //multiplying out of state tuition and the cost of a double dorm
                        int doubleOut = outState * singleDorm;

                        System.out.println("\ninfo from Education planner: ");

                        System.out.println("Name: "+name);
                
                        System.out.println("Age: "+age);
            
                        System.out.println("youre total cost added with tuition is " + doubleOut);

                        System.out.println("-------Have a good day!-------");
                    }*/
                }
            }
            else if(fourYearChoice == 3){
                System.out.println("you have choosen Application checklist!");
                System.out.println("""
                    \nlist of required documents below!
                    1.SAT
                    2.Transcript
                    3.Essay
                        """);
                System.out.println("\ninfo from Education planner: ");

                System.out.println("above is the list of Required documents!");

                System.out.println("Name: "+name);
                
                System.out.println("Age: "+age);

                System.out.println("-------Have a good day!-------");
            }


        }
        else{
            System.out.println(" Sorry that is not a choice!");
            System.exit(0);
        }
        
    }
    
}
