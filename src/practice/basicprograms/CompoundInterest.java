package practice.basicprograms;

public class CompoundInterest {
    public static void main(String[] args) {
        double p=5000, n=12, t=10, r=0.05;
        double ci=p*(Math.pow((1+ r/12), n*t));
        System.out.println("compound interest is: "+ci);
    }
}
