import java.util.Scanner;

public class Seven {
    public static void main(String args[])
        {
            System.out.println("Input first number:");
            Scanner s1 =new Scanner(System.in);
            int i = s1.nextInt();
            for (int j=1;j<=10;j++)
            {
                int mul = i * j;
                System.out.println(i + "*" + j + "=" + mul );
            }
    }
}
