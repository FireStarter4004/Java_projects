/**
 * 
 * @author mo
 * This is a program to learn java data types and how to create variables.
 */


public class DataVariables {
    
    public static void main(String[]args){
        
        //working with number data types(int and double)
        //dataType variableName=value;
        int age;//declaring age 
        age = 15;//assigning age
        //another way to do it
        int number = 4563;

        //adding int variables together - using a expression
        int result = age + number + 12 + 13;

        // working with a double
        double price = 12.67;
        double totalPrice = price + 13.45 + 12 + 9 + 13.57;

        // working with char values
        char grade = 'B';
        char symbol = '!';

        // boolean data types = true or false
        boolean t = true;
        boolean f = false;

        // strings data type
        String name = "Jason";

        // printing our data values - System.out.println();
        System.out.println(age);
        System.out.println(number);
        System.out.println(result);
        System.out.println(price);
        System.out.println(totalPrice);
        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(t);
        System.out.println(f);
        System.out.println(name);

        //print text with a data value
        System.out.println("the name is: " + name);
        System.out.println("The number is : " + age);
        System.out.println(" the grade variable is holding: " + grade);
        

    }//end of main


}//end of class
