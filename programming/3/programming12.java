import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void write(ArrayList<Integer> str)//성적 적는 메소드
    {
        Scanner sc = new Scanner(System.in);
        int sw = 0;

        while(sw >= 0)
        {
            System.out.print("성적을 입력하시오:");
            sw = sc.nextInt();

            if(sw >= 0)
            {
                str.add(sw);
            }
        }
    }

    public static int sum(ArrayList<Integer> str)//합계 구하는 메소드
    {
        int sum=0;
        for(int e : str)
        {
            sum = sum + e;
        }
        return sum;
    }

    public static double avg(ArrayList<Integer> str,int sum)//평균구하는 메소드
    {
        int a = str.size();
        return (double)(sum/a);
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(); //동적 배열 생성
        write(list);                                 //성적적는 메소드 호출

        System.out.println("합계: " + sum(list)); //합계 구하는 메소드 호출하고 결과 출력
        System.out.println("평균: " + avg(list,sum(list))); 평균 구하는 메소드 호출하고 결과 출력
    }
}
