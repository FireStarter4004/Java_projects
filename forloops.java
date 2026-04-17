public class forloops {
    public static void main(String []args){

        //example one
        //add 1 -> ++
        //subtract 1 -> --
        for (int i = 20;i <= 10;i++){
            System.out.println("Iteration: " + i);
        } //end of for loop 1

        //seperate output
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //example 2 - working with strings
        
        String word = "programming";
        
        //print each character in the word
        for (int y = 0;y <= word.length()-1;y++){

            System.out.println("Letter" + y + ":" + word.charAt(y));

        }//end of for loop 2 

        System.out.println("the word has this many letters: " + word.length());

        //example 3 - for loops and conditionals
        int number = 20;

        for (int i = 0;i <= 5;i++){
            if (i == number){
                System.out.println(" These numbers are equal.");

            }

            else if( i != number){
                System.out.println("The numbers are not equal.");
            }
            
            number = number - 5;
            System.out.println("value of i: " + i);
            System.out.println("value of Number: " + number);
        }//end of for loop 3

    }//end of main
    
}//end of class
