import java.util.Scanner;

public class Six {
    public static void main(String args[])
    {
        System.out.println("Input first number:");
        Scanner s1 =new Scanner(System.in);
        int i = s1.nextInt();
        System.out.println("Input Second number:");
        int j =s1.nextInt();
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println(i%j);
    }
}
