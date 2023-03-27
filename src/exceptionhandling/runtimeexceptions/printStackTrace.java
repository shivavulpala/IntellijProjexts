package exceptionhandling.runtimeexceptions;

public class printStackTrace {//name of the exception:description of the exception, stack
        public static void main(String[] args) {

            int a = 5, b = 0;
            try {
                System.out.println(a / b);
            }
            catch(ArithmeticException e)
            {
                e.printStackTrace();
            }
        }
    }


