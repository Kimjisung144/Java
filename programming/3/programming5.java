// 두개의 주사위 합이 6일때 경우의 수 구하기
public class Main {
    public static void main(String[] args)
    {
      for(int i=1; i<=6; i++) //1~6까지
      {
          for(int j=1; j<=6; j++) //1~6까지
          {
              if(i+j == 6) //두개의 주사위 합이 6일때
              {
                  System.out.println("("+i+", "+j+")"); //그 때 주사위 결과물들 출력
              }
          }
      }
    }
}
