// 3x+10y==100 모든 해 구하기
public class Main {
    public static void main(String[] args)
    {
      for(int i=0; i<=10; i++) //1~10까지
      {
          for(int j=0; j<=10; j++) //1~10까지
          {
              if((3*i) + (10*j) == 100) //3x+10y=100 가 참일때
              {
                  System.out.println("("+i+", "+j+")"); //그 때 결과물들 출력
              }
          }
      }
    }
}
