package practice.basicprograms;

public class CheckNeonNumber {
    static void NeonNumber(int x)
    {
        int num=x;
       if(num!=0) {
           num= num*num;
       }
       int sum=0;
       while(num!=0)
       {
           sum=sum + num %10;
           num=num/10;
       }
       if(sum==x)
           System.out.println(x +" is a neon number");
       else
           System.out.println(x +" is not a neon number");
    }

    public static void main(String[] args) {
        NeonNumber(10);

    }
}

