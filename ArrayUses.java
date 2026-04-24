//code to show how to work with arrays using loops and array classes

import java.util.Arrays; // arrays class to access built in methods


public class ArrayUses {

        //using arrays with personal methods
        public static void printArray(int[]arr){
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }

    public static void main(String[]args){
        
        //using loops

        //create array
        int [] numbers = {4, 13, 56, 375, 12, 0};

        //print array using for loop
        for(int i = 0; i<numbers.length;i++){
            System.out.println("The value at " + i + ":" + numbers[i]);
        }
        
        System.out.println("hello");
        //for loop for calculations
        int sum = 0;
        for(int i = 0; i<numbers.length;i++){

            //use sum in loop
            sum += numbers[i];//add each array index to the sum
            System.out.println("The sum is: " + sum);
            
        }
        System.out.println("*************************************************************");
        //using a for loop to do a array search
        int target = 12;
        for(int i = 0; i<numbers.length;i++){

            //see if array index contains the value at target
            if(numbers[i] == target){
                System.out.println("the array contains the target number");
                break; //stops the loop if the target is found
            }
            else{
                System.out.println("this number is not the target number!");

            }

            
        }
        System.out.println("********************************************************************");
        String [] colors = {"blue", "purple", "green", "yellow"};

        //for each loop
        for(String color : colors){
            System.out.println(color + " is in the color array");
        }

        //using array methods with the color arrays
        //1. toString - print the array
        System.out.println(Arrays.toString(colors));

        // using the numbers array
        //2. sort method
        System.out.println("array before sorting: " + Arrays.toString(numbers));
        
        Arrays.sort(numbers);//use sort method first
        
        System.out.println("array after sorting: " + Arrays.toString(numbers));//print the sorted method

        //3. copyOfmethod
        //1st array
        String [] names = {"jake", "Sara"};
        
        //using copyOf
        String [] names2 = Arrays.copyOf(names,10);

        //printing arrays
        System.out.println("Original arrays: " + Arrays.toString(names));//printing names1
        System.out.println("Copied array: " + Arrays.toString(names2));//printing names2

        names2[2] = "tj";
        names2[3] = "janet";
        names2[9] = "bob";

        System.out.println("Copied array: " + Arrays.toString(names2));//printing names2

        System.out.println("****************************************************************************");
        //calling our customized array method
        int [] nums1 = {1,2,3,4};
        int [] nums2 = {10,20,30};

        //call printArray method
        printArray(nums1);
        printArray(nums2);


    }

            
}
