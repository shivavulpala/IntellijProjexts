package practice.patternprograms;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        LeftTriStar(5);
    }
    static void LeftTriStar(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=2*(n-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
