package practice.classesandobjectprograms.interfaces;

interface Interface1 {
    int I=2;
    void show();
}
class Interface2 implements Interface1 {
    public void show() {
        System.out.println("Print it");
    }

    public static void main(String[] args) {
        Interface2 I2 = new Interface2();
        I2.show();
    }
}
