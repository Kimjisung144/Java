import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static double power(double n,double v) //운동에너지 구하기 위한 메소드
    {
        return (1/2.0)*(n*(v*v)); //운동에너지 공식
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double n;
        double v;
        System.out.printf("물체의 무게를 입력하시오(킬로그램):");
        n = sc.nextDouble();
        System.out.printf("물체의 속도를 입력하시오(미터/초):");
        v = sc.nextDouble();
        System.out.println("물체는 "+power(n,v)+"(줄)의 에너지를 가지고 있다.");
    }
}
