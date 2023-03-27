package practice.basicprograms;

public class GCDofTwoNumbers {
    static int GCD(int a,int b)
    {
        if(a==0)
            return b;
        return GCD(b%a,a);
    }

    public static void main(String[] args) {
        System.out.println("GCD of a&b is: " +GCD(45,20));
    }
}
