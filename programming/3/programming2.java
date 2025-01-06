import java.util.Scanner;

public class Main
{
    public static void output_print(String cal, double number1, double number2) //결과 출력하기 위한 메소드
    {
        switch(cal){
            case "+":
                System.out.println(number1+cal+number2+"= "+(number1+number2)); // 연산자가 더하기 였을시
                break;
            case "-":
                System.out.println(number1+cal+number2+"= "+(number1-number2)); // 연산가자 빼기 였을시
                break;
            case "*":
                System.out.println(number1+cal+number2+"= "+(number1*number2));// 연산가자 곱하기 였을시
                break;
            case "/":
                System.out.println(number1+cal+number2+"= "+(number1/number2));// 연산가자 나누기 였을시
                break;
            default:
                System.out.println("문제 생김"); //연산자가 아닐시
                break;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in); //입력받기 위한 객체 생성
        double input_number1;//입력받기 위한 변수
        double input_number2;//입력받기 위한 변수
        String cal; //연산자 입력받기 위한 변수

        System.out.print("연산자를 입력하시오:");
        cal = sc.next(); //연산자 입력받기

        System.out.print("피연산자 2개를 입력하시오");
        input_number1 = sc.nextDouble(); // 입력받기
        input_number2 = sc.nextDouble();//입력받기

        output_print(cal,input_number1,input_number2);           //출력 하기 위한 메소드 호출
    }
}
