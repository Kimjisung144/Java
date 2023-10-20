import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.printf("두수의 합%d\n",x+y);
        System.out.printf("두수의 차%d\n",x-y);
        System.out.printf("두수의 곱%d\n",x*y);
        System.out.printf("두수의 평균%f\n",(x+y)/2.0);
        System.out.printf("두수의 큰값%d\n",x>y ? x:y);
        System.out.printf("두수의 작은값%d\n",x>y ? y:x);
    }
}
