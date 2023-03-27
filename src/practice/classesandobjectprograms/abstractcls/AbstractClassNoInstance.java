package practice.classesandobjectprograms.abstractcls;
    abstract class Base {
        abstract void fun();
    }

    //class 2
    class Derived extends Base {
        void fun() {
            System.out.println("Derived fun() is called");
        }
    }

    public class AbstractClassNoInstance{
        public static void main(String[] args) {
            Base b=new Derived();
            b.fun();
    }
}