import java.util.Scanner;

public class Main
{
    public static void output_print(int number)// 단어로 출력하기 위한 메소드
    {
        String[] list = {"OTHER","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"}; //출력에 쓸 배열
        if(number > 0 && number < 10) //0보다 크고 10보다 작은 숫자 일때
        {
            System.out.println(list[number]);
        }else{                       //1~9가 아닐시
            System.out.println(list[0]);
        }
    }

    public static void main(String[] args)
    {
        int input_number;                     //입력받기 위한 변수
        Scanner sc  = new Scanner(System.in); //입력받기 위한 객체 생성
        input_number = sc.nextInt();          //입력받기
        output_print(input_number);           //출력 하기 위한 메소드 호출
    }
}
