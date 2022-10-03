import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fahrenheit formula F=9/5c +32
        Scanner input=new Scanner(System.in);
        double Fahrenheit,Celsius;

        System.out.print("Enter your Celsius = " );
        Celsius=input.nextDouble();
        Fahrenheit= 9/5*Celsius+32;
        System.out.print("Your fahrenheit = "+Fahrenheit);

    }
}