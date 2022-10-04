import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number = ");
        num= input.nextInt();
        if (num%2==0){
            System.out.println("even ");

        }
        else {
            System.out.println("odd");
        }
    }
}