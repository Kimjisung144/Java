import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] st = {"one","two","three","four","five","six","seven","eigh","nine","ten","other"};   //문자열 여러개 저장을 위해 배열 생성
        Scanner sc = new Scanner(System.in);
        int i = 0; //입력받기 위한 변수
        i = sc.nextInt(); // 입력받기
        if(i > 0 && i < 10)
        {
            System.out.println(st[i-1]); //출력
        }else{
            System.out.println(st[10]); //1~9까지 숫자가 아닐시 출력
        }
    }
}
