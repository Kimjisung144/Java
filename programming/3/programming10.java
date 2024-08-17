//배열  합과 최대값 구하기
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static double max(double[] listy) //파라미터인 배열 주소 가져오기
    {
        int max = 0;                          // 최대값이 있는 인덱스 저장용 변수
        for(int i = 0; i < listy.length; i++) // 배열을 다 비교하기 위해 배열길이 만큼 반복
        {
            if(listy[max] < listy[i])         // 만약 현재 배열에 max값보다 현재 비교 값이 크면  
            {
                max = i;                      // max인덱스 현재 비교 인덱스로 변경하기
            }
        }
        return listy[max];                    // 최대값 반환하기
    }
    public static void main(String[] args)
    {
        double[] list = {4.0,2.0,3.0,4.0};    // 배열 초기화
        double sum=0;                         // 합을 저장용 변수
        for(double i:list)                    // 배열 하나하나 돌아가며 값 가져오기
        {
            System.out.print(i+" ");          // 배열 값 출력
        }
        for(double j:list)
        {
            sum = sum+j;                      // 배열의 합구하기 
        }
        System.out.println("\n합은:"+sum);     // 합 출력
        System.out.println(max(list));        // 최대값구하는 함수 호출하고 반환값 출력
    }
}
