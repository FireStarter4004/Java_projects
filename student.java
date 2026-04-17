/**
 * this is an example of a class, objects, and using encapsulation
 */



public class student {
    
    //fields (object properties) - encapsulated data
    private String name;
    private String classification;
    private double GPA;
    private String major;

    //constructor - create our student objects
    public student(String name, String classification, double GPA, String major){

        //using this - connect back to the fields
        this.name = name; //setting name 
        //this.classification = classification; //setting classification
        //this.GPA = GPA; //setting GPA 
        setclassification(classification);
        setGPA(GPA); // use setter for validation
        this.major = major; // setting major
    }

    //getters read only access to the data
    public String getName(){
        return name;
    }

    public String getClassification(){
        return classification;
    }

    public double getGPA(){
        return GPA;
    }

    public String getmajor(){
        return major;
    }

    //setters - control data updates

    //make sure classification is freshman, sophomore, junior or senior
    public void setclassification(String classification){

        if(classification.equals("freshman") || classification.equals ("sophomore") || classification.equals("junior") || classification.equals("seinor")){
            this.classification = classification;


        }
    }

    //make sure GPA is between 0.0 and 4.0
    public void setGPA(double GPA){
        if(GPA >= 0.0 && GPA <= 4.0){
            this.GPA = GPA;
        }
    }

    //instance methods
    public void printInfo(){
        System.out.println("========================================================");
        System.out.println("student name: " + name);
        System.out.println("Student Classification: " + classification);
        System.out.println("Student GPA: " + GPA);
        System.out.println("Student major: " + major);
        System.out.println("========================================================");
    }
}   
