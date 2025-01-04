import java.util.Scanner;
import java.lang.Math;
public class Main{

    public static double volume(double r) //구의 부피를 구하기 위한 메소드
    {
        return (4.0/3.0)*(Math.PI *(r*r*r)); //4/3 *파이 *r^3;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double r; //구의 반지름 저장 변수
        System.out.printf("구의 반지름: ");
        r = sc.nextDouble(); //반지름 입력받기

        System.out.println("구의 부피: "+volume(r));//구의 부피 출력
    }
}
