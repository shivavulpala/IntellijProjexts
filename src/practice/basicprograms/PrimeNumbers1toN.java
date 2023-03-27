package practice.basicprograms;

public class PrimeNumbers1toN {
    static void PrimeN(int n)
    {
        int i=23, j, flag;
            flag=1;
            for(j=2;j<=i/2;++j)
            {
                System.out.println(i);
                System.out.println(j);
                if(i%j==0) {
                    flag = 0;
                    System.out.println(i +"is not prime");
                    break;
                }
            }
            if(flag==1)
                System.out.println(i + " ");
    }
    public static void main(String[] args) {
        int n=10;
        PrimeN(n);
    }
}