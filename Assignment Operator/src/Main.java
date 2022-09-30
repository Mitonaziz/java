import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter two numbers = ");
        num1=scan.nextInt();
        num2=scan.nextInt();
        num1+=num2; //Assignment operator
        System.out.println("sum valu is "+num1);
        num1-=num2;
        System.out.println("sub valu is "+num1);
        num1*=num2;
        System.out.println("multiplication is "+num1);
         num1/=num2;
        System.out.println("Div valu is "+num1);
        num1%=num2;
        System.out.println("Remainder valu is "+num1);
    }
}