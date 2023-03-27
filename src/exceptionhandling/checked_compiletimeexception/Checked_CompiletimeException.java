package exceptionhandling.checked_compiletimeexception;
import java.io.*;
public class Checked_CompiletimeException {
    // Java Program to Illustrate Handling of Checked Exception
        public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
            // Assigning null value to object of FileInputStream
            FileInputStream Checked_CompiletimeException = null;

            try
            {// Giving path where file should exists to read content
                Checked_CompiletimeException = new FileInputStream("/home/mayur/Checked_CompiletimeException.txt");
            }

            catch (FileNotFoundException e)
            {
                System.out.println("File does not exist");
            }
            Class temp = Class.forName("gfg");


            System.out.println("Print me");
            return;
            //System.out.println("Print me too");//this is unreachable code
        }

}
