import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        for(int i=3;i<=100;i++)
        {
            for(int j=2;j<i;j++)//j가 2부터 i-1까지 나누어지는게 있으면 소수 아님
            {
                if(i%j==0)
                {
                    break;
                }else if(j==i-1)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
