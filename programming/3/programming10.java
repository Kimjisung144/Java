public class Main
{
    public static double sum(double[] list) //배열의 합을 구하는 메소드
    {
        double sum = 0.0;    // 합을 저장하는 변수
        for(double i : list) //리스트에 있는거 다 돌아가면서 i에 적용
        {
            sum = sum + i;   //합을 더해서 저장하기
        }
        return sum;          //합을 반환하기
    }

    public static double max(double[] list) //리스트중 최대값 구하는 메소드
    {
        double max = 0;    // 최대값 저장하기 위한 변수
        for(double e:list) // 리스트에 있는거 다 돌아가면서 i에 적용
        {
            if(e > max)    // e값이 현재 max값보다 클때
            {
                max = e;   // max값은 e값이 됨
            }
        }
        return max;        //max값 반환하기 
    }

    public static void main(String[] args)
    {
        double[] list = {1.0, 2.0, 3.0, 4.0};   // 리스트 저장
        System.out.println("합은 " + sum(list)); // 합 메소드 호출하고 반환된 값 출력
        System.out.println("최대값은 " + max(list)); //최대값 메소드 호출하고 반환된 값 출력
    }
}
