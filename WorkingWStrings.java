/**
 * this program is showing how to work with strings and string methods
 * Kyler brungerwood
 */

public class WorkingWStrings {

    public static void main(String[]args){

    // creating strings
    String s1 = "this is a string";
    String place = "Florida";
    String vehicle = "plane";
    
    //printing strings
    System.out.println(s1);
    System.out.println(place);
    
    //concate strings using + operator
    System.out.println("John is taking a " + vehicle);
    System.out.println("John is going to " + place + " on a " + vehicle);
    
    //working with escape sequences
    System.out.println(s1+"\n"+place);

    //string with a escape sequence
    String morningGreet = ("Good morning, \n How are you?");
    System.out.println(morningGreet);
    System.out.println("John says, \"Hi\" to everyone."); // using quotes in a string

    //string methods:variableName.methodName();
    System.out.println("The string s1 has " + s1.length() + " characters.");// will print the length of the string
    String s2 = ("Working with String Methods");
    String s2Lower = s2.toLowerCase(); // will convert the string to lowercase
    System.out.println(s2);
    System.out.println(s2Lower);

    //slcing strings
    System.out.println(s2.substring(20)); // will print starting at index 20
    System.out.println(s2.substring(0,4));
    System.out.println("HelloStrings".charAt(5)); // using charAt - directly appling to a string not a string variable.
    
    }
    
}
