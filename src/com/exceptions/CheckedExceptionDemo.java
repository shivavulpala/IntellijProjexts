package com.exceptions;

import javax.imageio.IIOException;
import java.io.*;

//java will force you to handle this exceptions
public class CheckedExceptionDemo{//throwing the checked exceptions using throws clause
    public static void main(String[] args) throws FileNotFoundException, IOException, MyException {
        FileReader file=new FileReader("C:\\text\\a.txt");//filenotfoundexcep
        BufferedReader fileInput=new BufferedReader(file);
        //to print above 3lines of code
        for(int count=0;count<3;count++)
            System.out.println(fileInput.readLine());//IOExcep
            fileInput.close();
            throw new MyException();//throwing MyExcep explicitly
    }

}
