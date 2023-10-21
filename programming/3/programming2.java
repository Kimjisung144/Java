import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int num1; // 숫자1
        int num2;// 숫자2
        String c; //연산자

        Scanner sc = new Scanner(System.in);
        System.out.println("연산을 입력하세요:");
        c = sc.next();

        System.out.println("피연산 1개를 입력하세요:");
        num1 = sc.nextInt();
        System.out.println("피연산 1개를 입력하세요:");
        num2 = sc.nextInt();
        switch (c)
        {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "%":
                System.out.println(num1%num2);
                break;
        }
    }
}
