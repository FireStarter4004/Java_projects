import java.io.*;
import java.util.*;


public class FilesinJava {

    public static void main(String[]args){

        //try catch block
        //reading a file and printing out the contents of a file
        try{
            File f = new File("data.txt");//file object
            Scanner sc = new Scanner(f);//scanner to read the file

            //while scanner has another line to be printed
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            //close scanner
            sc.close();
        }
        
        catch(FileNotFoundException e){//file not found exception
            System.out.println("File cannot open or is not found!");
        }

        try{
            PrintWriter out = new PrintWriter("output.txt");
            out.println("this is a file");
            out.println("we just wrote a file using code");
            out.close();
        }

        catch(FileNotFoundException e){
            System.out.println("File not created");
        }

        //appending to a file using FileWriter
        try{
            //fileWriter class object
            FileWriter fw = new FileWriter("output.txt", true);

            //PrintWriter class object
            PrintWriter out = new PrintWriter(fw);

            //add lines of text to files
            out.println("this is a coding demo");
            out.println("we have made it to the end of the java series :(");

            //close the printwriter
            out.close();
        }
        
        catch(IOException e){
            System.out.println(" Error writing to the file");
        }


    }
    
}
