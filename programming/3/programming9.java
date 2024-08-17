//피보나치 구하기
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int temp1 = 0; // 첫항부분 항 저장용 변수
        int temp2 = 1; // 두번째항부분 항 저장용 변수
        int temp3 = 0; // 두 항을 더한 값 저장용 변수
        int count = 0; // 몇항까지 할것인지 입력받은 값 저장용 변수
        Scanner sc = new Scanner(System.in); // 스캐너 입력받기 위한 객체생성

        System.out.println("출력할 항의 개수:"); // 원하는 항의 갯수 입력하라고 안내문 출력
        count = sc.nextInt();                 // 원하는 항의 갯수 입력하기 
        System.out.println(temp1+"\n"+temp2); // 첫항과 두번째 항은 정해져있기에 미리 출력

        for(int i = 1; i <= count-2; i++) // 원하는 항에 미리 출력한것이 있기에 원하는 항-2번 출력
        {
            temp3 = temp1 + temp2;     // 다음 항 구하기
            System.out.println(temp3); // 구한 항 출력
            temp1 = temp2;             // 기존에 있던 항들 왼쪽으로 이동 2번째항은 1번째로 1번쨰항은 사라짐
            temp2 = temp3;             
        }
    }
}
