package exceptionhandling.runtimeexceptions;

public class toString {//name of the exception:description of the exception
    public static void main(String[] args) {
        int a=5,b=0;
        try
        {
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.toString());
            System.out.println(e.getMessage());//description of the exception
        }
    }
}
