package practice.patternprograms;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        RightTriStar(5);
    }
    static void RightTriStar(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
