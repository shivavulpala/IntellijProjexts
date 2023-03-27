package practice.classesandobjectprograms.abstractcls;

public class AbsClsStaticMethod {
    public static void main(String[] args) {
        base1.fun();
    }
}
abstract class base1
{
    static void fun()
    {
        System.out.println("base1 fun() called");
    }
}