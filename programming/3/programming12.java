//시험점수의 합계와 평균 구하기
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void input_score(ArrayList<Integer> s) // 성적 점수 입력받는 함수
    {
        int temp = 0;                        // 임시로 점수 저장용 변수
        Scanner sc = new Scanner(System.in); // 입력받기 위해 객체 생성

        while(true)
        {
            System.out.println("성적을 입력하시오:"); // 성적 입력받기 위한 안내문
            temp = sc.nextInt();                   // 성적 입력받기

            if(temp == -1) // -1을 입력받으면 입력받는거 그만두기
            {
                break;     // 멈춤
            }
            s.add(temp);   // 점수 배열에 추가
        }
    }

    public static int sum(ArrayList<Integer> s) // 합계 출력
    {
        int sum = 0;   // 합계 저장을 위한 변수
        for(int num:s) // 하나하나 가져오기
        {
            sum = sum + num;  // 합계변수에 점수 더하기
        }
        return sum; // 더한 결과 반환하기
    }

    public static double avg(ArrayList<Integer> s,int sum) // 평균
    {
        double avg = 0;               // 평균 저장용 변수
        avg = (double) sum /s.size(); // 합계 / 과목 갯수
        return avg;                   // 평균 반환
    }

    public static void main(String[] args)
    {
        int score_sum = 0;                            // 합계를 저장하기 위한 변수
        ArrayList<Integer> score = new ArrayList<>(); // 점수 저장하고 보관하기 위해 동적 배열 생성

        input_score(score);                           // 점수 입력받기 위해 동적배열(주소)을 인수로 보내기
        score_sum = sum(score);                       // 합계 구하기 위해 함수 호출
        System.out.println("합계: "+score_sum+"\n평균: "+avg(score,score_sum)); // 합계와 평균 출력
    }
}
