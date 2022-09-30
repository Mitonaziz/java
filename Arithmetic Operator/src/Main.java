import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //there are 5 number of Arithmetic operator ( + - * / % )
        int num1,num2,result;
       Scanner scan= new Scanner(System.in);
       System.out.print("Enter two numbers = ");
       num1=scan.nextInt();
        num2=scan.nextInt();
        result =num1+num2;
        System.out.println("sum valu is "+result);
        result =num1-num2;
        System.out.println("sub valu is "+result);
        result =num1*num2;
        System.out.println("multiplication is "+result);
        result =num1/num2;
        System.out.println("Div valu is "+result);
        result =num1%num2;
        System.out.println("Remainder valu is "+result);



    }
}