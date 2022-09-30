import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num ;
        String Name;
        Name="Md Azizur Rahman";
        System.out.print("Enter you Interger number=");
        num=input.nextInt();
        Name=input.nextLine();
       System.out.println("Number ="+num);
       System.out.print("Enter your name =");
       Name=input.nextLine();

       System.out.println("Name is ="+Name);
    }
}