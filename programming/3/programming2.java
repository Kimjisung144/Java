import java.util.Scanner;

public class Main {
    public static double plus(double num1, double num2)     // 기호가 덧셈 일때
    {
        return num1 + num2;                                 //더한값 리턴
    }
    public static double minus(double num1, double num2)    // 기호가 뺄셈 일때
    {
        return num1 - num2;                                 // 뺀 결과값 리턴
    }
    public static double multiply(double num1, double num2) // 기호가 곱셈 일때
    {
        return num1 * num2;                                 // 곱한 결과값 리턴
    }
    public static double divide(double num1, double num2)   // 기호가 나눗셈 일때
    {
        if(num2 == 0) {                                     // 분모가 0일시 나눗셈 허용 안됨
            System.out.println("분모가 0입니다.");            // 경고 안내문 출력
            return 1.1;                                     // 계산 안된다는 의미로 1.1 리턴
        }else{
            return num1 / num2;                             // 분모가 0이 아닐시 나눈 결과값 리턴
        }

    }
    public static void main(String[] args)
    {
        String moon;                             // 연산자 저장용 변수
        double num_one = 0;                      // 피연산자1 저장용 변수
        double num_two = 0;                      // 피연산자2 저장용 변수
        System.out.println("연산을 입력하시오:"); // 연산자 입력하라는 안내문 출력

        Scanner sc = new Scanner(System.in);             // 입력받기 위한 Scanner객체 생성
        moon = sc.next();                                // 연산자 입력받기 
        System.out.println("피연산자 2개를 입력하시오:");  // 피연산자 입력하라는 안내문 출력
        num_one = sc.nextDouble();                       // 피연산자1 입력받기
        num_two = sc.nextDouble();                       // 피연산자2 입력받기

        if(moon.equals("+"))                               // 연산자가 +일 경우(문자 비교에 경우 주소를 비교하기에 equals메소드를 사용해야 비교가능) 
        {
            System.out.println(plus(num_one, num_two));    // plus함수를 호출하여 피연산자2개를 인자로 보내어 계산뒤 결과값 출력
        }else if(moon.equals("-"))                         // 연산자가 -일 경우
        {
            System.out.println(minus(num_one, num_two));   // minus함수를 호출하여 피연산자2개를 인자로 보내어 계산뒤 결과값 출력
        }else if(moon.equals("*"))                         // 연산자가 *일 경우
        {
            System.out.println(multiply(num_one,num_two)); // multiply함수를 호출하여 피연산자2개를 인자로 보내어 계산뒤 결과값 출력
        }else if(moon.equals("/"))                         // 연산자가 /일 경우
        {
            System.out.println(divide(num_one,num_two));   // divide함수를 호출하여 피연산자2개를 인자로 보내어 계산뒤 결과값 출력
        }else{
            System.out.println("문자열에 문제 생김");         // 아무것도 아닐시
        }
    }
}
