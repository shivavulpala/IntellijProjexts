package practice.basicprograms;

public class SimpleInterest
{
    static void Simint(int p, int t,int r)
    {
        int si=(p*t*r)/100;
        System.out.println("Simple interest: principal amount " +p +" for a period of " + t +" year"
                +" at the rate of interest " +r+ "% is: " +si);
    }

    public static void main(String[] args)
    {
        Simint(1000,2,5);
    }
}
