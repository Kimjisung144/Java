import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("시간간격을 입력하시오(단위: 초):");
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        System.out.printf("번개가 발생한 곳까지의 거리:%dm",x*340);
    }
}
