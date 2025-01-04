import java.util.Scanner;

public class Main{
    public static double f_to_c( double f) //화씨에서 섭씨로 변환 메소드
    {
        return (double) 5/9*(f -32.0); //공식
    }
    public static double c_to_f(double c)  //섭씨에서 화씨로 변환 메소드
    {
        return (double)9/5*c+32;  //공식
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a; // 섭씨
        double b; // 화씨
        int sw = 0; //섭씨 화씨 선택할때 쓰일 변수

        System.out.println("화씨 -> 섭씨: 1");
        System.out.println("섭씨 -> 화씨: 2");
        sw = sc.nextInt(); //입력을 통해 선택하기

        if(sw==1)
        {
            b = sc.nextDouble(); //화씨 입력받기
            System.out.println(f_to_c(b)); //섭씨로 변환 메소드 호출
        }else{
            a = sc.nextDouble();
            System.out.println(c_to_f(a)); //화씨로 변환 메소드 호출
        }
    }
}
