package practice.basicprograms;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        int x = 300, y = 20, z = 15;
        if (x > y && x > z)
            System.out.println("x is bigger and value is:" + x);
        else if (y > z && y > x)
            System.out.println("y is bigger and value is:" + y);
        else
            System.out.println("z is bigger and value is:" + z);

        //or

        int a, b, c, largest;
        a = 5;
        b = 10;
        c = 20;
        largest = LargestAmongThreeNumbers(a, b, c);
        System.out.println(largest + " is the biggest among three");
    }
        static int LargestAmongThreeNumbers(int a,int b,int c)
        {
            if (a >= b && a >=c)
                return a;
            else if (b >=c && b >=a)
                return b;
            else
                return c;
        }
}
