package practice.basicprograms;

public class LCMofTwoNumbers {

    static int gcd(int a,int b)
    {
        if(a==0)
            return b;
            return gcd(b%a,a);
    }
    static int lcm(int a,int b)
    {
        return (a/gcd(a,b))*b;
    }

    public static void main(String[] args) {
       int a=30,b=20;
        System.out.println(lcm(a,b));
    }
}
