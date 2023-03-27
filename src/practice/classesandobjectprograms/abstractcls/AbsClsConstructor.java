package practice.classesandobjectprograms.abstractcls;

public class AbsClsConstructor {
    public static void main(String[] args) {
        Base3 b= new Base3();
        b.fun();
    }
}
abstract class Base1
{
    Base1(){
        System.out.println("Base1 constructor is called");
    }

    abstract void fun();
}
abstract class Base2 extends Base1{
    Base2(){
        System.out.println("Base2 constructor is called");
    }

}
class Base3 extends Base2{
    void fun()
    {
        System.out.println("fun() is called");
    }
}

