package practice.classesandobjectprograms.abstractcls;

public class AbsClsWOAbsMethod {
    public static void main(String[] args) {
        Parent p=new Child();
        p.fun();

    }
}
abstract class Parent
{
    void fun()
    {
        System.out.println("Parent class fun() is called");
    }
}

class Child extends Parent
{

}

