import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1,n3,i,count,op;  //initialising the variables
        System.out.println("Menu");
        System.out.println("1.Fibonacci Series");
        System.out.println("2.Exit");
        do {
            System.out.println("Enter the choice: ");
            op=sc.nextInt();
            switch(op) {
                case 1: try {
                    System.out.println("Enter the number:");
                    count = sc.nextInt();
                    System.out.println(n1);//printing first 2 nos in series
                    System.out.println(n2);
                    //for other no using the for loop
                    for (i = 2; i < count; ++i) {
                        n3 = n1 + n2;  //printing the 3rd digit
                        System.out.println(n3);
                        n1 = n2;
                        n2 = n3;

                    }
                } catch (Exception exception) {
                    System.out.println("Expression" + exception);
                }
                    break;


                case 2:
                    System.out.println("EXit!!");
                default:
                    System.out.println("Invalid input");
            }
        }while(op!=2);
    }
}
