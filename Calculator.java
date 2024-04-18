import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int op,n1,n2,r;
        System.out.println("Menu");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Exit");
        do{
            System.out.println("Enter the choice:");
            op=obj.nextInt();
            switch(op){
                case 1: try {
                    System.out.println("Enter two nos to add:");
                    n1 = obj.nextInt();
                    n2 = obj.nextInt();
                    r = n1 + n2;
                    System.out.println("The addition of" + n1 + "and" + n2 + "=" + r);
                }
                catch(Exception exception) {
                    System.out.println("Expression"+exception);
                }
                    break;
                case 2: try {
                    System.out.println("Enter two nos to sub:");
                    n1 = obj.nextInt();
                    n2 = obj.nextInt();
                    r = n1 - n2;
                    System.out.println("The subtraction of" + n1 + "and" + n2 + "=" + r);
                }
                catch(Exception exception) {
                    System.out.println("Expression"+exception);
                }
                    break;
                case 3:try {
                    System.out.println("Enter two nos to multiply:");
                    n1 = obj.nextInt();
                    n2 = obj.nextInt();
                    r = n1 * n2;
                    System.out.println("The multiplication of" + n1 + "and" + n2 + "=" + r);
                }
                catch(Exception exception) {
                    System.out.println("Expression"+exception);
                }
                    break;
                case 4:try {
                    System.out.println("Enter two nos to divide:");
                    n1 = obj.nextInt();
                    n2 = obj.nextInt();
                    r = n1 / n2;
                    System.out.println("The division of" + n1 + "and" + n2 + "=" + r);
                }
                catch(Exception exception) {
                    System.out.println("Expression"+exception);
                }
                    break;

                case 5:
                    System.out.println("Exit");
                default:
                    System.out.println("Invalid Choice");
            }
        }while(op!=5);
    }
}
