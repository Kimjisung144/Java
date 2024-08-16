// 2와 100사이 수중에서 소수 구하기
public class Main {
    public static void main(String[] args)
    {
        int count = 0; // 검사받는 소수가 아닐경우 체크용 변수
      for(int i = 3; i < 100; i++) //2~100 사이
      {
          count=0;
          for(int j = 2; j < i; j++) //2~검사받는 숫자 직전까지 수로 소수 판별
          {
              if(i % j == 0) //나머지계산을 통해 소수 판별
              {
                  count++; // 소수가 아닐시 카운트로 구별
              }
          }
          if(count == 0) // 한번이라도 나누어 떨어지지 않는 경우
          {
              System.out.print(i+", "); // 검사받은 숫자 출력
          }
      }
    }
}
