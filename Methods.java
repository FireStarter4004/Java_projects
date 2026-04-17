public class Methods {
    public static void main(String[]args){
        
        //call a method
        printMessage();
        int x = addNumbers();
        System.out.println(addNumbers());//print returned value of addNumbers
        System.out.println(x);//print the stored value returned from addNumbers
        System.out.println(addNumbers(10,54));//testing method overloading with 2 arguments to replace parameters in method
        workConditions(12);
        workConditions(24);
        workConditions(100);
    }
    
    
    
    //method 1 - void method - returns no value - just does an action
    public static void printMessage(){
        System.out.println("this is my first method in java.");
    }

    
    //method 2 - value returning method using a data type and return statement
    public static int addNumbers(){

        int x = 45; //local variable 1
        int y = 23; //local variable 2
        return x + y;//returned value
    }
    
    //method overloading w parameters
    public static int addNumbers(int x, int y){

        System.out.println("this is a overload method");
        return x + y; 
    }

    //methods with conditionals
    public static void workConditions(int x){

        int num = 24; 
        
        //if statement
        if (x == num){
            System.out.println("the numbers are equal");
        }
        else{
            System.out.println("the numbers are differnet");
        }
    }



    //System.out.println("");
}
