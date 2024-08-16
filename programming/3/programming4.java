// 1~100까지 수중에 3의배수와 4의 배수를 더하는 프로그램 
public class Main {
    public static void main(String[] args)
    {
        int sum = 0;
      for(int i=1;i<=100;i++) // 1~100까지 반복
      {
          if(i % 3 == 0 || i % 4 == 0) // 3의 배수 또는 4의 배수 일때
          {
              sum = sum + i; // i값 기존에 더하고 있던 변수에 더하기
          }
      }
        System.out.println("3또는 4의 배수의 합="+sum); // 합 출력
    }
}
