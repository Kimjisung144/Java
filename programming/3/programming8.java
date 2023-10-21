import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        for(int i=1;i<100;i++)
        {
            for(int j=1;j<100;j++)//j가 2부터 i-1까지 나누어지는게 있으면 소수 아님
            {
                for(int k=1;k<100;k++)
                {
                    if((i*i)+(j*j) == (k*k))
                    {
                        System.out.println(i+" "+j+" "+k);
                    }
                }
            }
        }
    }
}
