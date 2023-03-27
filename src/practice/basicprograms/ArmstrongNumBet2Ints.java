package practice.basicprograms;

public class ArmstrongNumBet2Ints {

    // Function to print Armstrong Numbers between two integers
    static void ArmstrongNum(int x, int y)
    {
        for (int i = x + 1; i < y; ++i)
        {

            // Calculating number of digits
            int num = i;
            int count = 0;
            while (num != 0)
            {
                num /= 10;//num=num/10
                ++count;
            }

            // Calculating the sum of nth power of all the digits
            int sum_power = 0;
            num = i;
            while (num != 0)
            {
                int d = num % 10;//d=1
                sum_power += Math.pow(d, count);//sum_power=0+1 powerof 2=>1
                num /= 10;
            }

            // Checking if the current number i is equal to the sum of nth power of all the digits
            if (sum_power == i)
                System.out.print(i + " ");
        }
    }

    // The Driver code
    public static void main(String args[])
    {
        ArmstrongNum(50, 500);
    }
}
