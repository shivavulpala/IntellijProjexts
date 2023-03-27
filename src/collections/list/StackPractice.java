package collections.list;

import java.util.Iterator;
import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> s=new Stack<>();


        s.push("Hari");
        s.push("Srihan");
        s.push("Hari");
        s.push("Sriyan");
        s.push("Shiva");
        System.out.println(s);

        s.pop();
        Iterator<String> i=s.iterator();//iterator for stack
        while(i.hasNext())//for printing the stack
        {
            System.out.print(i.next()+" ");
        }

        System.out.println();

        s.clear();
        System.out.println(s);
    }
}
