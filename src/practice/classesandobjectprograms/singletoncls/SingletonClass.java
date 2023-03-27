package practice.classesandobjectprograms.singletoncls;

class SingletonClass {
    private static SingletonClass single_instance=null;//reference
    public String s;//variable
    private SingletonClass()//constructor
    {
        s="String part of SingletonClass";
    }
    public static SingletonClass getInstance()//instance
    {
        if(single_instance==null)
        {
            single_instance=new SingletonClass();

        }   return single_instance;
    }
}
class Main
{
    public static void main(String[] args) {
        SingletonClass x=SingletonClass.getInstance();//instantiating singleton class with var x
        SingletonClass y=SingletonClass.getInstance();
        SingletonClass z=SingletonClass.getInstance();
        System.out.println("Hashcode of x is: " +x.hashCode());
        System.out.println("Hashcode of y is: " +y.hashCode());
        System.out.println("Hashcode of z is: " +z.hashCode());
        if (x == y && y == z) {
            System.out.println("Three objects point to the same memory loc on the heap i.e, to the same object");
        }

        else {
            System.out.println("Three objects DO NOT point to the same memory loc on the heap");
        }
    }
}
