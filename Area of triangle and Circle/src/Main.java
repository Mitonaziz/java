import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double base ,Height,area;
        System.out.print("Enter your base= ");
        base=input.nextDouble();
        System.out.print("Enter your Height= ");
        Height=input.nextDouble();
        area=0.5*base*Height;
        System.out.println("Area of triangle= "+area);

    }
}