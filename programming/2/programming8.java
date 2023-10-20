import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double pay;
        Scanner sc = new Scanner(System.in);
        pay = sc.nextDouble();
        System.out.printf("구의 부피:%f",(4/3.0)*3.14*(pay*pay*pay));
    }
}
