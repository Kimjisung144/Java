import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int sum=0; //합을 구하기 위한 변수
        for(int i=1; i<=100; i++) //1~100까지
        {
            if((i%3==0) || (i%4==0) ) //숫자가 3의 배수인지 4의 배수인지 확인 하나라도 해당되면 참
            {
                sum = sum+i; //그 숫자 더하기
            }
        }
        System.out.println("3 또는 4의 배수의 합 = "+sum); // 결과 출력
    }
}
