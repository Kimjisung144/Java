import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        for(int i=0;i<=10;i++)
        {
            for(int j=0;j<=10;j++)
            {
                if((3*i)+(10*j)==100)
                {
                    System.out.println("("+i+","+j+")\n");
                }
            }
        }
    }
}
