import java.util.Scanner;

public class Main{

    public static int box(int orange) // box갯수 알기위한 메소드
    {
        return (int)orange/10; //박스하나에 오렌지 10개씩 넣기
    }
    
    public static int number(int orange) //오렌지 박스에 남은 오렌지 갯수 구하는 메소드
    {
        return (int)orange % 10; //나머지 구하기
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //입력받는 객체 생성
        int orange;                          //오렌지 갯수 저장 변수
        System.out.print("오렌지의 개수를 입력하시오:");

        orange = sc.nextInt();               //오렌지 갯수 입력받는다
        System.out.println(box(orange)+"박스가 필요하고 "+number(orange)+"개가 남습니다."); //각 메소드를 호출하여 결과 출력하기
    }
}
