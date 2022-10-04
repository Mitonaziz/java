import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any latter= ");
        ch= input.next().charAt(0);
        if (ch>='a' && ch<='z')
        {
            System.out.println("Small");
    }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("Capital Letter");
        }
        else
        {
            System.out.println("not a letter ");
        }
    }
}