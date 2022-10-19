import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //the Formula area of triangle 1/2*base *Hight
        //Circle Area Formula A=3.141592*(r)^2
        Scanner input=new Scanner(System.in);
        double base ,Height,area,redius,area2;
        System.out.print("Enter your base= ");
        base=input.nextDouble();
        System.out.print("Enter your Height= ");
        Height=input.nextDouble();
        area=0.5*base*Height;
        System.out.println("Area of triangle= "+area);
        System.out.print("Enter your redius= ");
        redius=input.nextDouble();
        area2=3.141592*redius*redius;
        System.out.println("Redius is = "+area2);
    }
}