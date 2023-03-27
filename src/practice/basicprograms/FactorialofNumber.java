package practice.basicprograms;

public class FactorialofNumber {
    static void Fact(int n)
    {

        int fact=n;
        for(int i=1;i<n;i++)
        {
            fact = fact*(n-i);
        }

        System.out.println("Factorial of "+n +" is " + fact);
    }

    public static void main(String[] args) {
        Fact(6);
    }
}
