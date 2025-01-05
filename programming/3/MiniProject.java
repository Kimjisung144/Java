import java.util.Scanner;

public class Main
{
    public static int get_random() // 랜덤값 구히기 위한 메소드
    {
        return (int) (Math.random() * 100+1); //1~100까지 중에 하나 뽑기
    }

    public static void game(int goal) //게임 실행 위한 메소드
    {
        Scanner sc = new Scanner(System.in); // 입력받기 객체 생성
        int think;                           // 사용자가 입력한 값 저장하기 위한 변수
        boolean swi = true;                  // while문 제어용 변수
        while(swi)
        {
            System.out.printf("숫자를 맞추시오:");
            think = sc.nextInt();
            if(think == goal)                 //숫자 맞출시
            {
                System.out.println("맞추셨다.");
                swi = false;                  //while문 끝내기
            }else if(think > goal)            //숫자가 클씨
            {
                System.out.println("입력하신 숫자보다 작습니다.");
            }else if(think < goal)             //솟자가 작을시
            {
                System.out.println("입력하신 숫자보다 큽다.");
            }else{
                System.out.println("문제생김");
            }
        }
    }
    public static void main(String[] args)
    {
        int goal; //랜덤값 저장용 변수
        goal = get_random(); //랜덤값 구히기 위한 메소드 호출
        game(goal); //게임 실행 하기 위한 메소드 호출
    }
}
