package practice.classesandobjectprograms.interfaces;

public interface Vehicle {
    void ChangeGear(int a);
    void SpeedUp(int a);
    void Brake(int a);
}
class Bicycle implements Vehicle{

    int speed,gear;
    @Override
    public void ChangeGear(int newGear) {
        gear=newGear;
    }

    @Override
    public void SpeedUp(int increment) {
        speed=speed+increment;
    }

    @Override
    public void Brake(int decrement) {
        speed=speed-decrement;
    }
    public void printstates()
    {
        System.out.println("speed is "+speed +" and gear is " + gear);
    }
}

class Bike implements Vehicle
{

    int speed,gear;
    @Override
    public void ChangeGear(int newGear) {
        gear=newGear;
    }

    @Override
    public void SpeedUp(int increment) {
        speed=speed+increment;
    }

    @Override
    public void Brake(int decrement) {
        speed=speed-decrement;
    }
    public void printstates()
    {
        System.out.println("speed is "+speed+" and gear is " + gear);
    }
}

class main
{
    public static void main(String[] args) {
        Bicycle bi=new Bicycle();
        Bike b=new Bike();
        bi.printstates();
        b.printstates();
        bi.ChangeGear(3);
        bi.SpeedUp(10);
        bi.Brake(5);
        b.ChangeGear(5);
        b.SpeedUp(25);
        b.Brake(20);
        bi.printstates();
        b.printstates();
    }
}
