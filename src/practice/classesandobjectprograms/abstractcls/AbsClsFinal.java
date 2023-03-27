package practice.classesandobjectprograms.abstractcls;

public class AbsClsFinal {
    public static void main(String[] args) {
        base b=new child();
        b.fun();

    }
}
abstract class base
{
    final void fun()
    {
        System.out.println("fun() of base cls is called");
    }
}
class child extends base
{

}