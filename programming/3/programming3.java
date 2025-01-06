import java.util.Scanner;

public class Main
{
    public static void game369(int number) //369게임 짝 갯수 알아내기 위한 메소드
    {
        int cnt = 0;//짝 갯수 세기 위한 변수
        if(number >= 10) //숫자가 10이상
        {
            if(((int)(number / 10.0) == 3) || ((int)(number / 10.0) == 6) || ((int)(number / 10.0) == 9)) // 십의 단위에서 3,6,9 확인
            {
                cnt = cnt+1;
            }
            if((number % 10.0) == 3 || (number % 10.0) == 6 || (number % 10.0) == 9) //일의 단위 3,6,9 확인
            {
                cnt = cnt+1;
            }
        }else if(number < 10) //숫자가 일의단위 일시
        {
            if((number % 10.0) == 3 || (number % 10.0) == 6 || (number % 10.0) == 9) // 일의 단위 3,6,9 확인
            {
                cnt = cnt+1;
            }
        }

        switch(cnt) //cnt에 따라 짝 갯수 출력
        {
            case 0:
                System.out.println(number);
                break;
            case 1:
                System.out.println("짝");
                break;
            case 2:
                System.out.println("짝,짝");
                break;
            default:
                System.out.println("문제 생김");
                break;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //생성하기
        for(int i=1; i<=50; i++) //1~50까지 확인
        {
            game369(i); //i값 짝 갯수 몇개인지 메소드 호출하여 알아내기
        }
    }
}
