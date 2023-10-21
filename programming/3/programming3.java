import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        for(int i=1;i<=50;i++)
        {
            if(i%3==0)
            {
                System.out.print("짝 ");
            }else
            {
                System.out.print(i+" ");
            }
        }
    }
}
