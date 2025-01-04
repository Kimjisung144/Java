import java.util.Scanner;

public class Main{

    public static double mile_to_km(double mile) //마일에서 킬로미터로 변환
    {
        return (double) (mile*1.609); //식
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double mile;                      //마일 저장 변수
        System.out.print("마일을 입력하시오:");

        mile = sc.nextDouble(); //마일 입력
        System.out.println(mile + "마일은 " + mile_to_km(mile) + " 킬로미터입니다."); //변환 메소드 호출하고 변환 결과 출력

    }
}
