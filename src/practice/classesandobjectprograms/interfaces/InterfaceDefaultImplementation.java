package practice.classesandobjectprograms.interfaces;

public interface InterfaceDefaultImplementation {
    final int d=10;
    default void display()
    {
        System.out.println("Interface default implementation method");
    }
}
class int2 implements InterfaceDefaultImplementation
{
    public static void main(String[] args) {
        int2 i2=new int2();
        i2.display();
    }
}
