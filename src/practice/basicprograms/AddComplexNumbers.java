package practice.basicprograms;
public class AddComplexNumbers {
    int real, image;

    public AddComplexNumbers(int r, int i) {
        this.real = r;
        this.image = i;
    }
    public void showC()
    {
        System.out.println(this.real+" +i"+image);
    }
    public static AddComplexNumbers add(AddComplexNumbers n1, AddComplexNumbers n2) {
        AddComplexNumbers res = new AddComplexNumbers(0, 0);
        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }


    public static void main(String[] args) {
        AddComplexNumbers c1=new AddComplexNumbers(4,5);
        AddComplexNumbers c2=new AddComplexNumbers(10,5);
        c1.showC();
        c2.showC();
        AddComplexNumbers res=add(c1,c2);
        System.out.println("Addition of two complex numbers");
                res.showC();
    }
}