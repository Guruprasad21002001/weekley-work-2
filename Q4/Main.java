import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of 'a' : ");
        int a = s.nextInt();
        System.out.print("Enter the value of 'b' : ");
        int b = s.nextInt();
        int res = pow(a,b);
        System.out.println(a + " raised to the power of " + b + " is " + res);
    }

    public static int pow(int a, int b)
    {
        if (b == 0)
        {
            return 1;
        }
        else if (b % 2 == 0)
        {
            int half = pow(a,b / 2);
            return half * half;
        }
        else {
            return a * pow(a,b- 1);
        }
    }
}