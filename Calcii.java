//Input class

public class Input {
  int a,b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}

//op named interface

package operations;

public interface op {
    public void sum(int a, int b);
    public void sub(int a, int b);
    public void mul(int a, int b);
    public void div(int a, int b);
}

//operation class

package operations;
import Input.Input;
import java.util.Scanner;

public class operations extends Input {

    public static void main(String[] args) {
        operations operation1= new operations();
        Scanner sc=new Scanner(System.in);
        System.out.println("One");
        int aa=sc.nextInt();
        System.out.println("Two");
        int bb=sc.nextInt();
        operation1.setA(aa);
        operation1.setB(bb);
        operation1.sum(operation1.getA(),operation1.getB());
        System.out.println("One");
        int cc=sc.nextInt();
        System.out.println("Two");
        int dd=sc.nextInt();
        operation1.setA(cc);
        operation1.setB(dd);
        operation1.sub(operation1.getA(),operation1.getB());
        System.out.println("One");
        int ee=sc.nextInt();
        System.out.println("Two");
        int ff=sc.nextInt();
        operation1.setA(ee);
        operation1.setB(ff);
        operation1.mul(operation1.getA(),operation1.getB());
        System.out.println("One");
        int gg=sc.nextInt();
        System.out.println("Two");
        int hh=sc.nextInt();
        operation1.setA(gg);
        operation1.setB(hh);
        operation1.div(operation1.getA(),operation1.getB());
        System.out.println("One");
    }
    public void sum(int a, int b)
    {
        int s= a +b;
        System.out.println("Sum = " +s);
    }
    public void sub(int a, int b)
    {
        int s= a-b;
        System.out.println("Sub = " +s);
    }
    public void mul(int a, int b)
    {
        int s= a*b;
        System.out.println("Mul = " +s);
    }
    public void div(int a, int b)
    {
        int s= a/b;
        System.out.println("Div = " +s);
    }
}
