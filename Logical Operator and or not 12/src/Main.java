import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any latter= ");
         ch= input.next().charAt(0);
         if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
             System.out.println("Vowel");

         }
         else {
             System.out.println("Consonant");
         }

    }
}