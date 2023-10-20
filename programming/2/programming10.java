import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int y;
        int speed;
        Scanner sc = new Scanner(System.in);
        System.out.printf("물체의 무게를 이력하시오(킬로그램):");
        y = sc.nextInt();
        System.out.printf("물체의 속도를 입력하시오(미터/초):");
        speed = sc.nextInt();
        System.out.printf("운동에너지:%fJ의 에너지를 가지고 있다.",(1/2.0)*y*speed*speed);
    }
}
