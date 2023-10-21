import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in); // 스캐너 객체 생성
        int a[] = new int[100]; // 배열 객체 생성
        int i=1; //a배열의 인텍스 제어값

        while(a[i-1] >= 0) //
        {
            a[i-1] = SC.nextInt();
            i++;
        }
        int sum=0;
        for(int j=0; j<i-1; j++)
        {
            sum += a[i];
        }
        System.out.printf("합계: %d 평균:%.1f",sum,(sum/i-1.0));
    }
}
