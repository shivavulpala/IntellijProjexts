package com.exceptions;
//creating our own exception/custom excep/by default these are called checked excep, we need
// to handle them in the existing code or need to rethrow them and let caller handle it
public class MyException extends Exception{
    //default constructor
    MyException() {
    }
//parameterised constructor
    MyException(String str) {
        super(str);
    }
}
