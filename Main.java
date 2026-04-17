/**
 * this is a main method that we can use for our student.java class
 * we will use this to create student objects
 */

public class Main {

    //main method
    public static void main(String[]args){
        
        //create a student object from student.java
        student s1 = new student("James", "Freshman", 3.0, "computer Science");//this is the correct format!!!!
        student s2 = new student ("Will", "10th grade", 7.0, "English"); // input is not correct format!!!

        //using object methods
        s1.printInfo();
        s2.printInfo();

        //update our s2 object to have valid data
        s2.setclassification("junior");
        s2.setGPA(2.5);
        s2.printInfo();

        //using getters
        System.out.println(s1.getName());
        


    }
    
}
