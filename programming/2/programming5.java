import java.util.Scanner;

public class Main{

    public static double cal(double sound,int time) //거리구하는 메소드
    {
        return time * sound; //거리는 속도 곱하기 시간
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final double sound = 340; //소리는 초당 340m
        int time; //걸리는 시간 저장 변수
        
        time = sc.nextInt(); //시간이 도착하는 시간
        System.out.println(cal(sound,time));//번개치고 도착하는 데 거리 결과 출력
    }
}
