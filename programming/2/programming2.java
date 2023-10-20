import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.printf("마일을 입력하시오:");
        x = sc.nextInt();
        System.out.printf("%.1f마일은 %.1f킬로미터 입니다.",x,x*1.609);
    }
}
