import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int box;
        int orange = 127;
        System.out.printf("오렌지의 개수를 입력하시오:");
        orange = sc.nextInt();
        System.out.printf("%.0f 박스가 필요하고 %.0f개 남습니다.",orange/10.0,orange%10.0);
    }
}
