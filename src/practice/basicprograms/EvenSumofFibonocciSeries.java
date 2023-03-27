package practice.basicprograms;

public class EvenSumofFibonocciSeries {
    static int fibo(int n) {

        if (n <= 0)
            return 0;

        int fib[]= new int[2 * n + 1];
        fib[0] = 0;
        fib[1] = 1;
        // Initializing the sum
        int s = 0;
        // Adding remaining numbers
        for (int j = 2; j <= 2 * n; j++) {
            fib[j] = fib[j - 1] + fib[j - 2];
            // Only considering even indexes
            if (j % 2 == 0)
                s += fib[j];
        }
        return s;
    }
    public static void main(String[] args) {
        int n = 4;
        // Prints the sum of even-indexed numbers
        System.out.println(
                "Even sum of fibonacci series till number " + n
                        + " is: " + +fibo(n));
    }
}
