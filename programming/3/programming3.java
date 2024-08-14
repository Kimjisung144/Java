// 369게임 
public class Main {
    public static void main(String[] args)
    {
      for(int i = 1; i <= 50; i++) // 1~50까지 반복
      {
          if(i % 3 == 0)     // 3의 배수일때
          {
              System.out.print("짝"+" "); // 숫자가 아닌 짝으로 하기
          }else{
              System.out.print(i+" ");    // 숫자 출력
          }
      }
    }
}
