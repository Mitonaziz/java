public class Main {
    public static void main(String[] args) {
        //Unary +  and Unary -
        int x =-10;
        int Result;
        Result= +x;//unary +
        System.out.println("Result = "+Result);
        Result= -x;//Unary -
        System.out.println("Result="+Result);
        //Increment Decrement
        int z=25;
        int y;
        y=z++;//post Increment
        y=z;
        System.out.println("y= "+y);

        int q=25;
        int v;
        v=++q;//pre  Increment
        v=q;
        System.out.println("y= "+y);

    }
}