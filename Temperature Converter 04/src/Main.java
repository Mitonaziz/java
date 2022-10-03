import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fahrenheit formula F=9/5c +32
        Scanner input=new Scanner(System.in);
        double Fahrenheit,Celsius;

        System.out.print("Enter your Celsius = " );
        Celsius=input.nextDouble();
        Fahrenheit= 9/5*Celsius+32;
        System.out.println("Your fahrenheit = "+Fahrenheit);
        //Celsius C=5/9(F-32)
        System.out.print("Enter your fahrenheit = " );
        Celsius=input.nextDouble();
        Celsius = 9/5*Fahrenheit-32;
        System.out.print("Your Celsius  = "+Celsius );
    }
}